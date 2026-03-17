package com.reserva.hotel.controller;

import com.reserva.hotel.model.Recepcion;
import com.reserva.hotel.service.RecepcionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recepcion")
public class RecepcionRestController {

    private final RecepcionService service;

    public RecepcionRestController(RecepcionService service) {
        this.service = service;
    }

    @PostMapping
    public Recepcion registrar(@RequestBody Recepcion recepcion) {
        return service.guardar(recepcion);
    }

    @GetMapping
    public List<Recepcion> listar() {
        return service.listar();
    }
}
