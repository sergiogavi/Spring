package com.example.demo.dao;

import com.example.demo.model.Usuario;
import java.util.List;
public interface UsuarioDao {

    List<Usuario> getUsuario();


    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}
