package br.com.pratica.paises.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

/**
 * Representa os dados de um país retornados pela REST Countries API.
 *
 * Como a API retorna objetos aninhados (ex: name.common, flags.png),
 * usamos @JsonIgnoreProperties para ignorar campos extras e mapeamos
 * manualmente os campos aninhados por meio de setters com JsonNode.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pais {

    // ── Campos simples ──────────────────────────────────────────────────────
    private String nomeComum;
    private String nomeOficial;
    private String regiao;
    private String subRegiao;
    private long   populacao;
    private double area;

    // Primeiros elemento da lista "capital"
    private String capital;

    // URL da bandeira (dentro de flags.png)
    private String urlBandeira;

    // ── Mapeamento de objetos aninhados via JsonNode ────────────────────────

    /**
     * Recebe o nó "name" do JSON:
     * { "common": "Brazil", "official": "Federative Republic of Brazil" }
     */
    @JsonProperty("name")
    public void mapearNome(JsonNode name) {
        this.nomeComum   = name.path("common").asText();
        this.nomeOficial = name.path("official").asText();
    }

    /**
     * Recebe o array "capital" do JSON: ["Brasília"]
     */
    @JsonProperty("capital")
    public void mapearCapital(List<String> capitals) {
        if (capitals != null && !capitals.isEmpty()) {
            this.capital = capitals.get(0);
        }
    }

    /**
     * Recebe o nó "flags" do JSON:
     * { "png": "https://flagcdn.com/w320/br.png", "svg": "..." }
     */
    @JsonProperty("flags")
    public void mapearBandeira(JsonNode flags) {
        this.urlBandeira = flags.path("png").asText();
    }

    // ── Mapeamento de campos simples com @JsonProperty ──────────────────────

    @JsonProperty("region")
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @JsonProperty("subregion")
    public void setSubRegiao(String subRegiao) {
        this.subRegiao = subRegiao;
    }

    @JsonProperty("population")
    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    @JsonProperty("area")
    public void setArea(double area) {
        this.area = area;
    }

    // ── Getters ─────────────────────────────────────────────────────────────

    public String getNomeComum()   { return nomeComum;   }
    public String getNomeOficial() { return nomeOficial; }
    public String getRegiao()      { return regiao;      }
    public String getSubRegiao()   { return subRegiao;   }
    public long   getPopulacao()   { return populacao;   }
    public double getArea()        { return area;        }
    public String getCapital()     { return capital;     }
    public String getUrlBandeira() { return urlBandeira; }
}
