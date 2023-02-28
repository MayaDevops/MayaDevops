package com.translator.controller;

import com.translator.service.TranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/translator")
public class TranslatorController {
	@Autowired
    TranslatorService translatorService;
@GetMapping(value = {"/translate"})
    public void translateToMalayalam(@ModelAttribute String words) {
     translatorService.translateMalayalam(words);
}

}
