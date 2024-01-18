package edu.miu.demoinclassapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Review {

    private int id;
    private String comment;
    private int numberOfStars;

}
