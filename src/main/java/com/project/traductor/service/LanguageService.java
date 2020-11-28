package com.project.traductor.service;

import com.project.traductor.entity.Language;
import com.project.traductor.repository.ILanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    @Autowired
    private ILanguageRepository iLanguageRepository;

    public Language getLanguageById(Long id) {
        return iLanguageRepository.findById(id).get();
    }

    public List<Language> getAllLanguages() {
        return iLanguageRepository.findAll();
    }

    public Language postLanguage(Language language) {
        return iLanguageRepository.save(language);
    }

    public Language putLanguage(Language language) {
        return iLanguageRepository.save(language);
    }

    public void deleteLanguage(Long id) {
        iLanguageRepository.deleteById(id);
    }
}
