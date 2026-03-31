package br.com.pratica.clima.controller;

import br.com.pratica.clima.model.ClimaDados;
import br.com.pratica.clima.service.ClimaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClimaController {

    private final ClimaService climaService;

    public ClimaController(ClimaService climaService) {
        this.climaService = climaService;
    }

    @GetMapping("/")
    public String index() {
        return "formulario";
    }

    @GetMapping("/clima")
    public String buscar(@RequestParam double latitude,
                         @RequestParam double longitude,
                         Model model) {
        try {
            ClimaDados clima = climaService.buscar(latitude, longitude);
            model.addAttribute("clima", clima);
            model.addAttribute("condicao", getCondicao(clima.getClimaAtual().getWeathercode()));
        } catch (Exception e) {
            model.addAttribute("erro", "Não foi possível consultar a API: " + e.getMessage());
        }
        return "resultado";
    }

    private String getCondicao(int code) {
        if (code == 0)               return "Céu limpo";
        if (code >= 1  && code <= 3) return "Parcialmente nublado";
        if (code >= 45 && code <= 48) return "Neblina";
        if (code >= 61 && code <= 67) return "Chuva";
        if (code >= 71 && code <= 77) return "Neve";
        if (code >= 80 && code <= 82) return "Pancadas de chuva";
        return "Condição desconhecida";
    }
}