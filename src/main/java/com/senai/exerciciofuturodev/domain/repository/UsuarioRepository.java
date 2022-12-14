package com.senai.exerciciofuturodev.domain.repository;

import com.senai.exerciciofuturodev.domain.model.ClientModel;
import com.senai.exerciciofuturodev.domain.model.EnderecoModel;
import com.senai.exerciciofuturodev.rest.dto.UsuarioDto;
import org.springframework.stereotype.Repository;


@Repository
public class UsuarioRepository {

    public void salvarCliente(ClientModel clienteModel) {
        var insertTable = "insert into cliente (nome, cpf) values ()";
        System.out.println("Cliente inserido com sucesso!" + clienteModel.toString());
    }

    public void salvarEndereco(EnderecoModel enderecoModel) {
        var insertTable = "insert into endereco () values ()";
        System.out.println("Endeço inserido com sucesso!");
    }

    public UsuarioDto getUsuario(String cpf) {
        var selectClienteComEndereco = "select * from cliente inner join endereco ... where cpf = :cpf";
        UsuarioDto usuarioDtoRetornadoDoSql = new UsuarioDto();
        usuarioDtoRetornadoDoSql.setNome("Usuario 1");
        usuarioDtoRetornadoDoSql.setCpf("456546464646");
        usuarioDtoRetornadoDoSql.setCep("123456789");
        usuarioDtoRetornadoDoSql.setCidade("Florianopolis");
        usuarioDtoRetornadoDoSql.setEstado("Santa Catarina");
        usuarioDtoRetornadoDoSql.setRua("Rua Almirante Tamandaré");
        return usuarioDtoRetornadoDoSql;
    }
}
