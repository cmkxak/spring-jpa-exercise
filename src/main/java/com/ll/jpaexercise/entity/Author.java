package com.ll.jpaexercise.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "author2")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
