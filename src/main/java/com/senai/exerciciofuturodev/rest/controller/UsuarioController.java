package com.senai.exerciciofuturodev.rest.controller;


import com.senai.exerciciofuturodev.domain.service.UsuarioService;
import com.senai.exerciciofuturodev.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/usuario")
    public String salvarUsuario(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.salvar(usuarioDto);
        return "Usuário salvo com sucesso!";
    }

    @PostMapping("/usuario1")
    public String salvarUsuario1(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.salvar(usuarioDto);
        return "Usuário salvo com sucesso!";
    }

    @PostMapping("/usuario2")
    public String salvarUsuario2(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.salvar(usuarioDto);
        return "Usuário salvo com sucesso!";
    }

    @GetMapping("/usuario")
    public UsuarioDto buscarUsuario() {
        UsuarioDto usuarioDtoLocalizadoPeloCpf = usuarioService.buscarUsuario("cpf");
        return usuarioDtoLocalizadoPeloCpf;
    }

    @GetMapping("/usuario1")
    public UsuarioDto buscarUsuario1() {
        UsuarioDto usuarioDtoLocalizadoPeloCpf = usuarioService.buscarUsuario("cpf");
        return usuarioDtoLocalizadoPeloCpf;
    }

    @GetMapping("/usuario2")
    public UsuarioDto buscarUsuario2() {
        UsuarioDto usuarioDtoLocalizadoPeloCpf = usuarioService.buscarUsuario("cpf");
        return usuarioDtoLocalizadoPeloCpf;
    }
}
