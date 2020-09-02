package com.example.cursorestfulspringboot.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteControle {
    
    @GetMapping("/cliente")
        public String getClientes(){
            return "Vai retornar todos os clientes";
        }
    

    @GetMapping("/cliente/{codigo}")
        public String getClienteByCodigo(@PathVariable int codigo){
            return "Vai retornar o cliente de codigo: " + codigo;
        }
}