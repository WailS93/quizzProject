package com.tonpseudo.quizapp.service;

import com.tonpseudo.quizapp.model.Quiz;
import com.tonpseudo.quizapp.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    private final QuizRepository repository;

    public QuizService(QuizRepository repository) {
        this.repository = repository;
    }

    public List<Quiz> getAll() {
        return repository.findAll();
    }

    public Quiz save(Quiz quiz) {
        return repository.save(quiz);
    }
}