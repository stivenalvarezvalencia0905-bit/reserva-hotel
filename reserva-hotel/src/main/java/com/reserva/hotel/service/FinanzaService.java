package com.reserva.hotel.service;

import com.reserva.hotel.model.Finanza;
import com.reserva.hotel.repository.FinanzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanzaService {

    private final FinanzaRepository repository;

    public FinanzaService(FinanzaRepository repository) {
        this.repository = repository;
    }

    public Finanza guardar(Finanza finanza) {
        return repository.save(finanza);
    }

    public List<Finanza> listar() {
        return repository.findAll();
    }
}
