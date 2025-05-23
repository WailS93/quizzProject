package com.tonpseudo.quizapp.controller;

import com.tonpseudo.quizapp.model.Quiz;
import com.tonpseudo.quizapp.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    private final QuizService service;

    public QuizController(QuizService service) {
        this.service = service;
    }

    @GetMapping
    public List<Quiz> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz) {
        return service.save(quiz);
    }
}