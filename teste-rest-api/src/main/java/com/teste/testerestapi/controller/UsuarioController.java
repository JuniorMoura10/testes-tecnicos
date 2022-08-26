package com.teste.testerestapi.controller;

import com.teste.testerestapi.dto.UsuarioDto;
import com.teste.testerestapi.repository.UsuarioRepository;
import com.teste.testerestapi.sevices.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioServices service;

    // Criando a consulta no BD
    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        UsuarioDto dto =  service.consultar(codigo);
        return new ResponseEntity<>(dto, HttpStatus.OK);
//        return repository.findById(codigo).map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioDto salvar(@RequestBody UsuarioDto usuario){

        //  return repository.save(usuario);
            return null;
    }
}
