package com.example.demo.controladors;
import com.example.demo.dao.HiloDao;
import com.example.demo.model.Hilo;
import com.example.demo.model.Mensaje;
import com.example.demo.model.Usuario;
import com.example.demo.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
class HiloController{

    @Autowired
    private HiloDao hiloDao;
    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/getHilos", method = RequestMethod.GET)
    public List<Hilo> getMensaje(){
        return  hiloDao.getHilo();
    }

    @RequestMapping("api/getHilos/{id}")
    public @ResponseBody List<Hilo> getAttr(@PathVariable(value="id") Long id) {
        return  hiloDao.getHiloId(id);
    }

    @RequestMapping("api/getMsg/{id}")
    public @ResponseBody List<Mensaje> getAttrs(@PathVariable(value="id") Long id) {
        return  hiloDao.getHiloMsg(id);
    }
    @RequestMapping(value = "api/getMsg", method = RequestMethod.GET)
    public List<Mensaje> getMensajes(){
        return  hiloDao.getMsg();
    }

    @RequestMapping(value = "api/postHilos", method = RequestMethod.POST)
    public void registrarMensajes(@RequestBody Hilo hilo){
        hiloDao.registrarMensajes(hilo);
    }


    @RequestMapping(value = "api/sendMessage", method = RequestMethod.POST)
    public void registrarMensajes(@RequestBody Mensaje mensaje){
        hiloDao.PushMsg(mensaje);
    }



}
