package com.project.traductor.controller;

import com.project.traductor.entity.Word;
import com.project.traductor.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping("/word")
    public List<Word> getAllWords() {
        return wordService.getAllWords();
    }

    @GetMapping("/word/{id}")
    public Word getWordById(@PathVariable(name = "id") Long id) {
        return wordService.getWordById(id);
    }

    @PostMapping("/word")
    public Word postWord(@RequestBody Word word) {
        return wordService.postWord(word);
    }

    @PutMapping("/word")
    public Word putWord(@RequestBody Word word) {
        return wordService.putWord(word);
    }

    @DeleteMapping("/word/{id}")
    public void deleteWord(@PathVariable(name = "id") Long id) {
        wordService.deleteWord(id);
    }
}
