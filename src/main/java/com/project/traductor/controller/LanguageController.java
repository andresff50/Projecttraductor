package com.project.traductor.controller;


import com.project.traductor.entity.Language;
import com.project.traductor.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping("/language/{id}")
    public Language getLanguageById(@PathVariable(name = "id") Long id) {
        return languageService.getLanguageById(id);
    }

    @GetMapping("/language")
    public List<Language> getAllLanguages() {
        return languageService.getAllLanguages();
    }

    @PostMapping("/language")
    public Language postLanguage(@RequestBody Language language) {
        return languageService.postLanguage(language);
    }

    @PutMapping("/language")
    public Language putLanguage(@RequestBody Language language) {
        return languageService.putLanguage(language);
    }

    @DeleteMapping("/language/{id}")
    public void deleteLanguage(@PathVariable(name = "id") Long id) {
        languageService.deleteLanguage(id);
    }
}
