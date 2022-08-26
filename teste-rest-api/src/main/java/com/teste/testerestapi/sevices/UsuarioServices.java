package com.teste.testerestapi.sevices;

import com.teste.testerestapi.dto.UsuarioDto;

public interface UsuarioServices {

    public UsuarioDto consultar(Integer id);
    public UsuarioDto salvar(UsuarioDto usuario);
}
