package com.example.demo.dao;

import com.example.demo.model.Hilo;
import com.example.demo.model.Mensaje;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;
public interface HiloDao {


    List<Hilo> getHilo();


    void eliminar(Long id);

    void registrarMensajes(Hilo hilo);

    Hilo obtenerMensajes(Hilo hilo);

    List<Hilo> getHiloId(Long id);

    List<Mensaje> getHiloMsg(Long id);

    List<Mensaje> getMsg();

     Mensaje PushMsg(Mensaje mensaje);

}
