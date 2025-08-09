package com.javanauta.api_agendador_tarefas.infrastructure.security;


import com.javanauta.api_agendador_tarefas.business.dto.UsuarioDTO;
import com.javanauta.api_agendador_tarefas.infrastructure.client.UsuarioClient;
//import com.javanauta.apiusuario.infrastructure.entity.Usuario;
//import com.javanauta.apiusuario.infrastructure.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl {

    @Autowired
    private UsuarioClient client;

    public UserDetails carregaDadosUsuario(String email, String token){


        UsuarioDTO usuarioDTO = client.buscaUsuarioPorEmail(email, token);
        return User
                .withUsername(usuarioDTO.getEmail())
                .password(usuarioDTO.getSenha())
                .build();
    }
}
