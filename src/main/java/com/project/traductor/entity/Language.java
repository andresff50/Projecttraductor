package com.project.traductor.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "language_code")
@Getter
@Setter
@ToString
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_language")
    private Long id;
    private String language_code;

    @OneToMany(mappedBy = "language_code")
    private List<Word> words = new ArrayList<>();

    public Language() {
    }

    public Language(String language_code) {
        this.language_code = language_code;
    }
}
