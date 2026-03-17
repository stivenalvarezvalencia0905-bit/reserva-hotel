package com.reserva.hotel.service;

import com.reserva.hotel.model.Cliente;
import com.reserva.hotel.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Registrar cliente
    public Cliente registrar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Login
    public Optional<Cliente> login(String email, String password) {
        return clienteRepository.findByEmailAndPassword(email, password);
    }
}
