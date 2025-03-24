package com.questionario;

public class Pergunta {
    private String enunciado;
    private TipoPergunta tipo;

    public Pergunta(String enunciado, TipoPergunta tipo) {
        this.enunciado = enunciado;
        this.tipo = tipo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public TipoPergunta getTipo() {
        return tipo;
    }
}