package org.example.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class AbstractQuestion implements Question {

    private long id;
    private String name; //body

    private QuestionType type;
}
