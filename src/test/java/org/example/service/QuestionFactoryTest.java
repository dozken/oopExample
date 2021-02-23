package org.example.service;

import junit.framework.TestCase;
import org.example.model.MultipleChoiceQuestion;
import org.example.model.Question;
import org.example.model.QuestionType;
import org.example.model.ShortAnswerQuestion;
import org.junit.Test;

public class QuestionFactoryTest extends TestCase {


    @Test
    public void testFactory() {
        QuestionFactory factory = new QuestionFactory();

        QuestionService service = factory.getQuestionService(QuestionType.MULTIPLE_CHOICE);

        Question multipleChoiceQuestion = service.create();
        assertTrue(multipleChoiceQuestion instanceof MultipleChoiceQuestion);
        assertEquals("What are the warm colors?", ((MultipleChoiceQuestion) multipleChoiceQuestion).getName());


        service = factory.getQuestionService(QuestionType.SHORT_ANSWER);
        Question shortAnswerQuestion = service.create();
        assertTrue(shortAnswerQuestion instanceof ShortAnswerQuestion);
        assertEquals("Write down OOP principles", ((ShortAnswerQuestion) shortAnswerQuestion).getName());

    }

    @Test
    public void testFactoryOther(){

    }

}
