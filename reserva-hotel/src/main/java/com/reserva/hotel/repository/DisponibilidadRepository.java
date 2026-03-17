package com.reserva.hotel.repository;

import com.reserva.hotel.model.Disponibilidad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DisponibilidadRepository extends JpaRepository<Disponibilidad, Long> {

    Optional<Disponibilidad> findByTipoHabitacion(String tipoHabitacion);
}
