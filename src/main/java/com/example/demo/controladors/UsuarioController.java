package com.example.demo.controladors;


import com.example.demo.dao.UsuarioDao;
import com.example.demo.model.Usuario;
import com.example.demo.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
class UsuarioController{

    @Autowired
    private UsuarioDao usuarioDao;
    @Autowired
    private JWTUtil jwtUtil;
    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Sergio");
        usuario.setApellido("Garcia");
        usuario.setEmail("sergio.gavi9@hotmail.cat");
        usuario.setTelefono("999342567");
        return usuario;
    }


    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(@RequestHeader(value="Authorization")String token){

        if(!validarToken(token)){ return null;}
            return  usuarioDao.getUsuario();
        }

    private boolean validarToken(String token){
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }


    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario){
         usuarioDao.registrar(usuario);
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



    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@RequestHeader(value="Authorization")String token,@PathVariable Long id){
        if(!validarToken(token)){ return;}
        usuarioDao.eliminar(id);
    }

}
