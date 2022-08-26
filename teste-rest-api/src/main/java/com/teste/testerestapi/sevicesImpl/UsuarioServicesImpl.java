package com.teste.testerestapi.sevicesImpl;

import com.teste.testerestapi.dto.UsuarioDto;
import com.teste.testerestapi.model.UsuarioModel;
import com.teste.testerestapi.repository.UsuarioRepository;
import com.teste.testerestapi.sevices.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicesImpl implements UsuarioServices {
    @Autowired
    private UsuarioRepository repository;
    @Override
    public UsuarioDto consultar(Integer id) {
        UsuarioModel usuario = repository.findById(id).orElse(null);
        return usuarioMap(usuario);
    }

    @Override
    public UsuarioDto salvar(UsuarioDto usuario) {
        UsuarioModel usuarioModel = repository.save(usuario);
        return salvarUsuario(usuarioModel);
    }

    private UsuarioDto usuarioMap(UsuarioModel usuario){
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setId(usuario.getId());
        usuarioDto.setNome(usuario.getNome());
        usuarioDto.setEmail(usuario.getLogin());
        usuarioDto.setSenha(usuario.getSenha());
        return usuarioDto;
    }

    private UsuarioDto salvarUsuario(UsuarioModel usuarioModel){
        UsuarioDto usuarioDto = new UsuarioDto();
        return usuarioDto;
    }
}
