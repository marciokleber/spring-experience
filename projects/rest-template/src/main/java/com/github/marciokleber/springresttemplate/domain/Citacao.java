package com.github.marciokleber.springresttemplate.domain;

public class Citacao {

    private Long id;

    private String citacao;

    private String descricao;

    public Citacao(Long id, String citacao, String descricao) {
        this.id = id;
        this.citacao = citacao;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCitacao() {
        return citacao;
    }

    public void setCitacao(String citacao) {
        this.citacao = citacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
