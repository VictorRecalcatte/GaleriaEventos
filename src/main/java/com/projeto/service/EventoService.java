package com.projeto.service;

import com.projeto.model.Evento;
import com.projeto.model.Usuario;
import com.projeto.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {
    @Autowired

    private EventoRepository eventoRepository;

    public List<Evento> listartodos() {
        return eventoRepository.findAll();
    }

    public Evento salvar(Evento evento){
        return eventoRepository.save(evento);
    }

    public void deletar(Long id){
        eventoRepository.deleteById(id);
    }

}
