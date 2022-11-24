package com.ll.jpaexercise.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "review2")
@Entity
public class Review {
    @Id
    private Long id;
    private String username;
    private String title;
    private String contents;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
}
