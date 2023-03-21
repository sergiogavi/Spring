package com.example.demo.controladors;


import com.example.demo.model.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
