package com.example.demo.controladors;

import com.example.demo.dao.UsuarioDao;
import com.example.demo.model.Usuario;
import com.example.demo.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class AuthController {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){

        Usuario usuarioLogueado= usuarioDao.obtenerUsuarioPorCredenciales(usuario);
        if(usuarioLogueado != null) {

           String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()),usuarioLogueado.getEmail());
            return tokenJwt;
        }else{
            return "FAIL";
        }
    }


}
