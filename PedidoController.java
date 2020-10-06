package com.example.ac1lab.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class PedidoController {

@RestController
@RequestMapping ("/pedidos")
public class PedidoController{

    @Autowired
    private PedidoRepository repository;

    @GetMapping ("/{id}")
    public ResponseEntity<Pedido> getPedidoByCodigo(@PathVariable final int id){
        final Pedido ped = repository.getPedidoByCodigo(id);

        if(ped != null){
            return ResponseEntity.ok(ped);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping 
    public ResponseEntity<Pedido> salvar(@RequestBody final Pedido pedido){
        final Pedido ped = repository.salvar(pedido);
        final URI uri = URI.create("https://localhost:8080/pedidos/" + ped.getCodigo());
        return ResponseEntity.created(uri).build();
    }

    
    @DeleteMapping ("/id")
    public ResponseEntity<Void> remover (@PathVariable final int id){
        final Pedido ped = repository.getPedidoByCodigo(id);

        if(ped != null){
            repository.remove(ped);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
}
