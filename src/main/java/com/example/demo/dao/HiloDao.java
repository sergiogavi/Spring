package com.example.demo.dao;

import com.example.demo.model.Hilo;
import com.example.demo.model.Usuario;
import java.util.List;
public interface HiloDao {

    List<Hilo> getHilo();


    void eliminar(Long id);

    void registrarMensajes(Hilo hilo);

    Hilo obtenerMensajes(Hilo hilo);

    List<Hilo> getHiloId(Long id);

    String getMsg();
}
