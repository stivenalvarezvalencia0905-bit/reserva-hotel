package com.reserva.hotel.controller;

import com.reserva.hotel.model.Disponibilidad;
import com.reserva.hotel.service.DisponibilidadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/disponibilidad")
public class DisponibilidadRestController {

    private final DisponibilidadService service;

    public DisponibilidadRestController(DisponibilidadService service) {
        this.service = service;
    }

    @PostMapping
    public Disponibilidad crear(@RequestBody Disponibilidad disponibilidad) {
        return service.guardar(disponibilidad);
    }

    @GetMapping
    public List<Disponibilidad> listar() {
        return service.listar();
    }

    @GetMapping("/{tipo}")
    public Optional<Disponibilidad> consultar(@PathVariable String tipo) {
        return service.buscarPorTipo(tipo);
    }
}
