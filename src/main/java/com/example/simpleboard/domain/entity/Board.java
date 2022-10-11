package com.example.simpleboard.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bno;

    private String title;

    private String content;

    @ManyToOne
    @JoinColumn(name = "mno")
    private Member member;

}
