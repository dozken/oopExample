package org.example.service;

import org.example.model.ShortAnswerQuestion;

public class ShortAnswerQuestionService implements QuestionService {

    @Override
    public ShortAnswerQuestion create() {

        ShortAnswerQuestion question = new ShortAnswerQuestion();
        question.setId(2);
        question.setName("Write down OOP principles");
        question.setAnswer("A PIE");

        return question;
    }

    @Override
    public void delete(long id) {

    }
}
