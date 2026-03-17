package view;

import br.edu.fatecpg.model.Empresa;
import com.google.gson.Gson;
import dao.EmpresaDAO;
import dao.SocioDAO;
import service.ConsomeApi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("=== Cadastro Automático de Fornecedores ===");
            System.out.print("Digite o CNPJ (com ou sem formatação): ");
            String cnpj = entrada.nextLine();

            // 1. Consulta a API (a limpeza do CNPJ acontece dentro de ConsomeApi)
            System.out.println("\nConsultando BrasilAPI...");
            String json = ConsomeApi.buscaCnpj(cnpj);

            if (json == null) {
                System.out.println("CNPJ não encontrado ou inválido. Encerrando.");
                return;
            }

            // 2. Converte o JSON para objetos Java via Gson
            Gson gson = new Gson();
            Empresa empresa = gson.fromJson(json, Empresa.class);

            System.out.println("\nEmpresa encontrada:");
            System.out.println(empresa);

            // 3. Persiste no banco via DAOs (responsabilidade separada do modelo)
            EmpresaDAO empresaDAO = new EmpresaDAO();
            SocioDAO   socioDAO   = new SocioDAO();

            empresaDAO.salvar(empresa);
            System.out.println("Empresa salva com sucesso.");

            socioDAO.salvarTodos(empresa);

        } catch (java.net.ConnectException e) {
            System.err.println("Erro de rede: não foi possível conectar à BrasilAPI.");
            System.err.println("Verifique sua conexão com a internet.");

        } catch (java.sql.SQLException e) {
            System.err.println("Erro de banco de dados: " + e.getMessage());
            System.err.println("Verifique se o PostgreSQL está rodando e as credenciais estão corretas.");

        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();

        } finally {
            entrada.close();
        }
    }
}