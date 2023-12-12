package com.graphql.learn.controllers;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class BookInput {
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
}
