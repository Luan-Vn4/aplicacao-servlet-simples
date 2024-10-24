package br.com.luanvn.domain.pokemons.models;

import br.com.luanvn.domain.pokemons.models.enums.Tipagem;

public class Pokemon {

    private int id;

    private String nome;

    private String descricao;

    private Tipagem tipagem;

    private float altura;

    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipagem getTipagem() {
        return tipagem;
    }

    public void setTipagem(Tipagem tipagem) {
        this.tipagem = tipagem;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
