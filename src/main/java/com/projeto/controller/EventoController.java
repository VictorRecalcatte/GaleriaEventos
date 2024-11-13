package com.projeto.controller;

import com.projeto.model.Evento;
import com.projeto.model.Usuario;
import com.projeto.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController {
    @Autowired

    private EventoService eventoService;

    @GetMapping("/listar")
    public List<Evento> listar(){
        return eventoService.listartodos();
    }

    @PostMapping("/add")
    public Evento adicionar(@RequestBody Evento evento){
        return eventoService.salvar(evento);
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        eventoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
