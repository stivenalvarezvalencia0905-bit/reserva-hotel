package com.reserva.hotel.service;

import com.reserva.hotel.model.Recepcion;
import com.reserva.hotel.repository.RecepcionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecepcionService {

    private final RecepcionRepository repository;

    public RecepcionService(RecepcionRepository repository) {
        this.repository = repository;
    }

    public Recepcion guardar(Recepcion recepcion) {
        return repository.save(recepcion);
    }

    public List<Recepcion> listar() {
        return repository.findAll();
    }
}
