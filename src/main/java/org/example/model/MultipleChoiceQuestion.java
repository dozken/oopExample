package org.example.model;

import lombok.Data;

import java.util.List;

@Data
public class MultipleChoiceQuestion extends AbstractQuestion {

    private List<String> answers;

}
