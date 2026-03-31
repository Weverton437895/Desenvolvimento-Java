package br.com.pratica.paises.controller;

import br.com.pratica.paises.model.Pais;
import br.com.pratica.paises.service.PaisService;
import br.com.pratica.paises.service.PaisService.PaisNaoEncontradoException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller MVC responsável pelas páginas:
 *  GET /          → formulário de busca
 *  GET /resultado → exibe os dados do país pesquisado
 */
@Controller
public class PaisController {

    private final PaisService paisService;

    // Injeção de dependência via construtor (boas práticas Spring)
    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    /**
     * Exibe o formulário de busca.
     */
    @GetMapping("/")
    public String formulario() {
        return "formulario"; // → templates/formulario.html
    }

    /**
     * Processa a busca e exibe o resultado.
     *
     * @param nome  parâmetro de query string: /resultado?nome=brazil
     * @param model modelo passado ao Thymeleaf
     */
    @GetMapping("/resultado")
    public String resultado(
            @RequestParam(value = "nome", defaultValue = "") String nome,
            Model model) {

        // Validação básica: campo vazio
        if (nome.isBlank()) {
            model.addAttribute("erro", "Por favor, informe o nome de um país.");
            return "formulario";
        }

        try {
            Pais pais = paisService.buscarPorNome(nome.trim());
            model.addAttribute("pais", pais);
            return "resultado"; // → templates/resultado.html

        } catch (PaisNaoEncontradoException e) {
            model.addAttribute("erro",
                    "País \"" + nome + "\" não encontrado. Tente em inglês (ex: Brazil, France).");
            return "formulario";

        } catch (Exception e) {
            model.addAttribute("erro",
                    "Erro ao consultar a API. Tente novamente mais tarde.");
            return "formulario";
        }
    }
}
