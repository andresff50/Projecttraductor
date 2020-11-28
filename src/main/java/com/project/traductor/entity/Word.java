package com.project.traductor.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "word")
@Getter
@Setter
@ToString
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_word")
    private Long id;
    private String word;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnoreProperties("words")
    @JoinTable(name = "translate_word",
            joinColumns = {@JoinColumn(name = "id_key")},
            inverseJoinColumns = @JoinColumn(name = "id_value"))
    private Set<Word> words = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "id_language")
    private Language language_code;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }
}
