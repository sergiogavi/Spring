package com.example.demo.dao;

import com.example.demo.model.Hilo;

import java.util.List;

import com.example.demo.model.Mensaje;
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

    @Override
    public List<Mensaje> getHiloMsg(Long id) {
        String query3= "FROM Mensaje WHERE id='"+id+"'";
        return entityManager.createQuery(query3).getResultList();
    }

    @Override
    public List<Mensaje> getMsg() {
        String query4= "FROM Mensaje";
        return entityManager.createQuery(query4).getResultList();
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

    @Override
    public Mensaje PushMsg(Mensaje mensaje){
        String query= "FROM Mensaje";
        List<Mensaje> lista= entityManager.createQuery(query)
                .setParameter("id",mensaje.getId())
                .setParameter("mensaje",mensaje.getMensaje())
                .setParameter("publicador",mensaje.getPublicador())
                .getResultList();
        if(lista.isEmpty()){
            return null;
        }else{
            return lista.get(0);
        }
    }
}
