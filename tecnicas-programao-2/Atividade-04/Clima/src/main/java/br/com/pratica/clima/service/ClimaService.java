package br.com.pratica.clima.service;

import br.com.pratica.clima.model.ClimaDados;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimaService {

    private static final String API_URL =
            "https://api.open-meteo.com/v1/forecast"
                    + "?latitude={latitude}&longitude={longitude}"
                    + "&current=temperature_2m,windspeed_10m,weathercode"
                    + "&timezone=America/Sao_Paulo";

    private final RestTemplate restTemplate = new RestTemplate();

    public ClimaDados buscar(double latitude, double longitude) {
        return restTemplate.getForObject(
                API_URL,
                ClimaDados.class,
                latitude,
                longitude
        );
    }
}