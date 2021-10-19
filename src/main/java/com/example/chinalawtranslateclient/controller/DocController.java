package com.example.chinalawtranslateclient.controller;


import com.example.chinalawtranslate.service.Doc;
import com.example.chinalawtranslate.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cxf")
public class DocController {

    @Autowired
    DocService docService;

    @GetMapping("/getByTitle")
    public Doc getByTitle(String title) {
        return docService.getByTitle(title);
    }
}
