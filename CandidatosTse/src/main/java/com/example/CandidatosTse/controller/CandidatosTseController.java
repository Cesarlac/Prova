package com.example.CandidatosTse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.CandidatosTse.service.CandidatosTseService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class CandidatosTseController {

    private final CandidatosTseService candidatosTseService;

    public CandidatosTseController(CandidatosTseService candidatosTseService){
        this.candidatosTseService = candidatosTseService;
    }

    @GetMapping("/")
    public String index(
        @RequestParam (required = false) String genero,
        @RequestParam (required = false) String escolaridade,
        @RequestParam (required = false) Integer idadeMin,
        @RequestParam (required = false) Integer idadeMax,
        Model model) {
            return "index";
        }
}
