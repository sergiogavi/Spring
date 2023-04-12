package com.example.demo.dao;

import com.example.demo.model.Hilo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")
@Repository
@Transactional
public class HiloDaoImp implements HiloDao{
    @PersistenceContext
    //Entity manager sirve para realizar la conexión con la BD
    private EntityManager entityManager;
    @Override
    public List<Hilo> getHilo() {
        String query= "FROM Hilo";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Hilo> getHiloId(Long id) {
        String query2= "FROM Hilo WHERE id='"+id+"'";
        return entityManager.createQuery(query2).getResultList();
    }

    public String getMsg(){
        return "mensaje desde server";
    }
    @Override
    public void eliminar(Long id) {

    }

    @Override
    public void registrarMensajes(Hilo hilo) {

    }

    @Override
    public Hilo obtenerMensajes(Hilo hilo) {
        return null;
    }
}
