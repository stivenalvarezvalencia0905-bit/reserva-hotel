package com.reserva.hotel.controller;

import com.reserva.hotel.model.Reserva;
import com.reserva.hotel.service.ReservaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaRestController {

    private final ReservaService reservaService;

    public ReservaRestController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    // Crear una reserva (JSON)
    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return reservaService.guardarReserva(reserva);
    }

    // Listar reservas
    @GetMapping
    public List<Reserva> listarReservas() {
        return reservaService.listarReservas();
    }
}
