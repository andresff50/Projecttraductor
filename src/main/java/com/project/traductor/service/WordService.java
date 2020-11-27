package com.project.traductor.service;

import com.project.traductor.entity.Word;
import com.project.traductor.repository.IWordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    @Autowired
    private IWordRepository iWordRepository;

    public List<Word> getAllWords() {
        return iWordRepository.findAll();
    }

    public Word getWordById(Long id) {
        return iWordRepository.findById(id).get();
    }

    public Word postWord(Word word) {
        return iWordRepository.save(word);
    }

    public Word putWord(Word word) {
        return iWordRepository.save(word);
    }


    public void deleteWord(Long id) {
        iWordRepository.deleteById(id);
    }
}
