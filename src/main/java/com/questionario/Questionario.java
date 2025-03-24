package com.questionario;

import java.util.ArrayList;
import java.util.List;

public class Questionario {
    private String titulo;
    private List<Pergunta> perguntas;

    public Questionario(String titulo) {
        this.titulo = titulo;
        this.perguntas = new ArrayList<>();
    }

    public void adicionarPergunta(Pergunta pergunta) {
        perguntas.add(pergunta);
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }
}