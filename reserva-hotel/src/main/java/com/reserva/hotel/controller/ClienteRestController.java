package com.reserva.hotel.controller;

import com.reserva.hotel.model.Cliente;
import com.reserva.hotel.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

    private final ClienteService clienteService;

    public ClienteRestController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Registro de cliente
    @PostMapping("/registro")
    public Cliente registrar(@RequestBody Cliente cliente) {
        return clienteService.registrar(cliente);
    }

    // Login REST
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        Optional<Cliente> cliente = clienteService.login(request.getEmail(), request.getPassword());

        if (cliente.isPresent()) {
            return "Login correcto";
        } else {
            return "Credenciales incorrectas";
        }
    }
}
