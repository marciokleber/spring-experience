package com.github.marciokleber.springresttemplate.controller;

import com.github.marciokleber.springresttemplate.domain.Citacao;
import com.github.marciokleber.springresttemplate.service.CitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/citacao")
public class CitacaoController {

    @Autowired
    private CitacaoService citacaoService;

    @GetMapping
    public ResponseEntity<List<Citacao>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(citacaoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Citacao> findById(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(citacaoService.findById(id));
    }
}
