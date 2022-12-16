package com.shadow.CRUD.controller;

import com.shadow.CRUD.entity.Usuario;
import com.shadow.CRUD.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping(value = "salvar")
    @ResponseBody
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {

        Usuario user = usuarioRepository.save(usuario);
        return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);

    }
    @GetMapping(value = "listartodos")
    @ResponseBody
    public ResponseEntity<List<Usuario>> listaUsuario() {

        List<Usuario> usuarios = usuarioRepository.findAll();
        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);

    }

    @PutMapping(value = "atualizar")
    @ResponseBody
    public ResponseEntity<?> atualizar(@RequestBody Usuario usuario) {

        if (usuario.getId() == null) {
            return new ResponseEntity<String>("Id não foi informado para atualização.", HttpStatus.OK);
        }

        Usuario user = usuarioRepository.saveAndFlush(usuario);

        return new ResponseEntity<Usuario>(user, HttpStatus.OK);

    }

    @DeleteMapping(value = "delete")
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Long iduser) {

        usuarioRepository.deleteById(iduser);

        return new ResponseEntity<String>("Usário deletado com sucesso", HttpStatus.OK);

    }

}
