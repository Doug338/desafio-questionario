package com.example.questionario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questionarios")
public class QuestionarioController {

    @GetMapping
    public String listarQuestionarios() {
        // lógica para listar questionários
        return "Lista de questionários";
    }

    @PostMapping
    public String criarQuestionario() {
        // lógica para criar um novo questionário
        return "Questionário criado";
    }

    @GetMapping("/teste")
    public String testarAplicacao() {
        return "Aplicação está funcionando corretamente";
    }
}
