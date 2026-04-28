package br.edu.fatecpg.fatec.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_receitas")
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String categoria;
    private Double preco;
    private Boolean emPromocao;

    public Receita() {}

    public Receita(String nome, String categoria, Double preco, Boolean emPromocao) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.emPromocao = emPromocao;
    }

    // Getters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getCategoria() { return categoria; }
    public Double getPreco() { return preco; }
    public Boolean getEmPromocao() { return emPromocao; }
}