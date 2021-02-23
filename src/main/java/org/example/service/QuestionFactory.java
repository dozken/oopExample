package org.example.service;

import org.example.model.QuestionType;

public class QuestionFactory {


    /**
     * @param type
     * @return
     */
    public QuestionService getQuestionService(QuestionType type) {
        switch (type) {
            case MULTIPLE_CHOICE:
                return new MultipleChoiceQuestionService();
            case SHORT_ANSWER:
                return new ShortAnswerQuestionService();
            //dropdown
            default:
                throw new IllegalArgumentException("This type is not supported yet");
        }

    }

}
