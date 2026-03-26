package com.reserva.hotel.service;

import com.reserva.hotel.model.Reserva;
import com.reserva.hotel.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public Reserva guardarReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservaRepository.findAll();
    }

    // GET -> Obtener reserva por ID
    public Optional<Reserva> obtenerReservaPorId(Long id) {
        return reservaRepository.findById(id);
    }

    // PUT -> Actualizar reserva por ID
    public Reserva actualizarReserva(Long id, Reserva reservaActualizada) {
        return reservaRepository.findById(id)
                .map(reserva -> {
                    reserva.setNombreCliente(reservaActualizada.getNombreCliente());
                    reserva.setFechaEntrada(reservaActualizada.getFechaEntrada());
                    reserva.setFechaSalida(reservaActualizada.getFechaSalida());
                    reserva.setTipoHabitacion(reservaActualizada.getTipoHabitacion());
                    reserva.setEmail(reservaActualizada.getEmail());
                    reserva.setPrecio(reservaActualizada.getPrecio());
                    return reservaRepository.save(reserva);
                })
                .orElseThrow(() -> new RuntimeException("Reserva no encontrada con ID: " + id));
    }

    // DELETE -> Eliminar reserva por ID
    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
