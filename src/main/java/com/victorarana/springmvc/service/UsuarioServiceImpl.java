package com.victorarana.springmvc.service;

import org.springframework.stereotype.Component;

@Component
public class UsuarioServiceImpl implements UsuarioService {

	public boolean validaUsuario(String nombre, String password) {
		return nombre.equals("juanito") && password.equals("123");
	}

}
