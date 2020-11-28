package com.project.traductor.service;

import com.project.traductor.entity.Language;
import com.project.traductor.entity.Word;
import com.project.traductor.repository.ILanguageRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WordServiceTest {

    @Autowired
    private WordService wordService;

    @Autowired
    private ILanguageRepository iLanguageRepository;

    Language language = new Language();

    @Test
    public void saveNewWord() {
        language = iLanguageRepository.findById(1L).get();

        Word word = new Word();
        word.setWord("Computador");
        word.setLanguage_code(language);

        Word wordValidate = wordService.postWord(word);

        Assert.assertEquals(wordValidate.getWord(), word.getWord());
        Assert.assertEquals(wordValidate.getLanguage_code().getLanguage_code(), word.getLanguage_code().getLanguage_code());
        Assert.assertEquals(wordValidate.getLanguage_code().getId(), word.getLanguage_code().getId());
    }
}
