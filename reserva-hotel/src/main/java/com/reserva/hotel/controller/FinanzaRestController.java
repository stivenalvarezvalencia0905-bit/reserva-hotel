package com.reserva.hotel.controller;

import com.reserva.hotel.model.Finanza;
import com.reserva.hotel.service.FinanzaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/finanzas")
public class FinanzaRestController {

    private final FinanzaService service;

    public FinanzaRestController(FinanzaService service) {
        this.service = service;
    }

    @PostMapping
    public Finanza registrar(@RequestBody Finanza finanza) {
        return service.guardar(finanza);
    }

    @GetMapping
    public List<Finanza> listar() {
        return service.listar();
    }
}
