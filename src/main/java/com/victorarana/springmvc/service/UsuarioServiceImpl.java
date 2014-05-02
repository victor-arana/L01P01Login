package com.victorarana.springmvc.service;

import org.springframework.stereotype.Component;

@Component
public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public boolean validaUsuario(String nombre, String password) {
		return nombre.equals("juanito") && password.equals("123");
	}

}
