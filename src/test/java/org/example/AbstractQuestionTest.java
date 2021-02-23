package org.example;

import junit.framework.TestCase;
import org.example.model.AbstractQuestion;
import org.example.model.MultipleChoiceQuestion;
import org.junit.Test;

public class AbstractQuestionTest extends TestCase {

    @Test
    public void testQuestionCreation(){

        AbstractQuestion abstractQuestion = new MultipleChoiceQuestion();
        abstractQuestion.setId(1);
        abstractQuestion.setName("What are the warm colors?");

        assertEquals("What are the warm colors?", abstractQuestion.getName());
    }
}
