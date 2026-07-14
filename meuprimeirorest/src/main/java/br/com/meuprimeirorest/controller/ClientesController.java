package br.com.meuprimeirorest.controller;

import br.com.meuprimeirorest.dto.Cliente;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesController {

    @PostMapping(path = "clientes/novo", consumes = "application/json ")
    public void novoCliente(@RequestBody @Validated Cliente cliente){
        System.out.println( "Nome do cliente: " + cliente.getNome() + " " + cliente.getSobrenome());
    }
}
