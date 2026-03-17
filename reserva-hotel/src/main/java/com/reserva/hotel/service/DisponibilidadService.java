package com.reserva.hotel.service;

import com.reserva.hotel.model.Disponibilidad;
import com.reserva.hotel.repository.DisponibilidadRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisponibilidadService {

    private final DisponibilidadRepository repository;

    public DisponibilidadService(DisponibilidadRepository repository) {
        this.repository = repository;
    }

    public Disponibilidad guardar(Disponibilidad disponibilidad) {
        return repository.save(disponibilidad);
    }

    public List<Disponibilidad> listar() {
        return repository.findAll();
    }

    public Optional<Disponibilidad> buscarPorTipo(String tipoHabitacion) {
        return repository.findByTipoHabitacion(tipoHabitacion);
    }
}
