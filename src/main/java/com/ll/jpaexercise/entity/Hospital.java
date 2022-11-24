package com.ll.jpaexercise.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
public class Hospital {

    @Id
    private Long id;
    private String name;
    private String roadAddress;

    @OneToMany(mappedBy = "hospital", fetch = FetchType.LAZY)
    private List<Review> reviews = new ArrayList<>();
}
