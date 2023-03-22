package com.example.demo.controladors;


import com.example.demo.model.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Sergio");
        usuario.setApellido("Garcia");
        usuario.setEmail("sergio.gavi9@hotmail.cat");
        usuario.setTelefono("999342567");
        return usuario;
    }


    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List <Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Sergio");
        usuario.setApellido("Garcia");
        usuario.setEmail("sergio.gavi9@hotmail.cat");
        usuario.setTelefono("999342567");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Antonio");
        usuario2.setApellido("Garcia");
        usuario2.setEmail("sergio.gavi9@hotmail.cat");
        usuario2.setTelefono("999342567");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("José Juan");
        usuario3.setApellido("Garcia");
        usuario3.setEmail("sergio.gavi9@hotmail.cat");
        usuario3.setTelefono("999342567");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }


    @RequestMapping(value = "usuario/202")
    public Usuario CreateUsuario(){

        Usuario usuario = new Usuario();
        usuario.setId(202L);
        usuario.setNombre("Sergio");
        usuario.setApellido("Garcia");
        usuario.setEmail("sergio.gavi9@hotmail.cat");
        usuario.setTelefono("999342567");
        return usuario;
    }

}
