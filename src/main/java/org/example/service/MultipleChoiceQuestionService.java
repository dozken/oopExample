package org.example.service;

import org.example.model.MultipleChoiceQuestion;
import org.example.model.Question;

import java.util.Arrays;

public class MultipleChoiceQuestionService implements QuestionService {

    @Override
    public Question create() {

        MultipleChoiceQuestion question = new MultipleChoiceQuestion();
        question.setId(1);
        question.setName("What are the warm colors?");
        question.setAnswers(Arrays.asList("red", "green", "yellow"));

        return question;
    }

}
