package com.barbosalog.api.controller;

import com.barbosalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Marcelo");
        cliente1.setTelefone("16 99999-1111");
        cliente1.setEmail("marecelobarbosa@barbosalog.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Saullo");
        cliente2.setTelefone("16 99999-2222");
        cliente2.setEmail("saullobarbosa@barbosalog.com");

        return Arrays.asList(cliente1, cliente2);
    }

}
