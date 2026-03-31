package br.com.pratica.paises.service;

import br.com.pratica.paises.model.Pais;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * Serviço responsável por consultar a REST Countries API
 * e desserializar o JSON retornado em um objeto {@link Pais}.
 */
@Service
public class PaisService {

    // URL base da API — {nome} será substituído pelo nome digitado
    private static final String API_URL =
            "https://restcountries.com/v3.1/name/{nome}";

    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper mapper       = new ObjectMapper();

    public Pais buscarPorNome(String nome) {
        try {
            // RestTemplate faz a requisição GET e devolve o JSON como String
            String json = restTemplate.getForObject(API_URL, String.class, nome);

            // A resposta é um array — lemos como Pais[] e pegamos o índice 0
            Pais[] paises = mapper.readValue(json, Pais[].class);

            if (paises == null || paises.length == 0) {
                throw new PaisNaoEncontradoException(nome);
            }

            return paises[0];

        } catch (HttpClientErrorException.NotFound e) {
            // HTTP 404 → país não encontrado
            throw new PaisNaoEncontradoException(nome);

        } catch (PaisNaoEncontradoException e) {
            throw e; // repassa sem envolver em RuntimeException

        } catch (Exception e) {
            throw new RuntimeException(
                    "Erro ao consultar a API para o país: " + nome, e);
        }
    }

    // ── Exceção de domínio ───────────────────────────────────────────────────

    public static class PaisNaoEncontradoException extends RuntimeException {
        public PaisNaoEncontradoException(String nome) {
            super("País não encontrado: " + nome);
        }
    }
}
