package modelo;

public class Empresa {

    private Cliente[] clientes = new Cliente[5];
    private int contadorClientes = 0;

    public String adicionarCliente(String nome, String email) {
        if (contadorClientes >= clientes.length) {
            return "Máximo de 5 clientes atingido!";
        }

        clientes[contadorClientes] = new Cliente(nome, email);
        contadorClientes++;

        return "Cliente adicionado com sucesso!";
    }

    public String exibirClientes() {
        if (contadorClientes == 0) {
            return "Nenhum cliente cadastrado";
        }

        String texto = "CLIENTES CADASTRADOS:\n";

        for (int i = 0; i < contadorClientes; i++) {
            texto += "Nome: " + clientes[i].getNome() +
                     " | Email: " + clientes[i].getEmail() + "\n";
        }

        return texto;
    }

    private Funcionario[] funcionarios = new Funcionario[10];
    private int contadorFunc = 0;

    public String adicionarFuncionario(String nome, String cargo, double salario) {
        if (contadorFunc >= funcionarios.length) {
            return "Limite de 10 funcionários atingido!";
        }

        funcionarios[contadorFunc] = new Funcionario(nome, cargo, salario);
        contadorFunc++;

        return "Funcionário adicionado com sucesso!";
    }

    public String exibirFuncionarios() {
        if (contadorFunc == 0) {
            return "Nenhum funcionário cadastrado";
        }

        String texto = "FUNCIONÁRIOS CADASTRADOS";

        for (int i = 0; i < contadorFunc; i++) {
            texto += "\nNome: " + funcionarios[i].getNome() +
                     "\nCargo: " + funcionarios[i].getCargo() +
                     "\nSalário: R$" + funcionarios[i].getSalario() +
                     "\n";
        }

        return texto;
    }

    public double calcularFolhaSalarial() {
        double total = 0;

        for (int i = 0; i < contadorFunc; i++) {
            total += funcionarios[i].getSalario();
        }

        return total;
    }
    
    
    public double calcularMediaSalarial() {

        if (contadorFunc == 0) {
            return 0; 
        }

        Calculadora calc = new Calculadora(); 

        double soma = 0;

        for (int i = 0; i < contadorFunc; i++) {
            soma = calc.somar(soma, funcionarios[i].getSalario());
        }
        return soma / contadorFunc;
    }
    
    public String exibirMediaSalarial() {
        if (contadorFunc == 0) {
            return "Nenhum funcionário cadastrado, média salarial indisponível.";
        }

        double media = calcularMediaSalarial();
        return "Média salarial dos funcionários: R$ " + media;
    }
}
