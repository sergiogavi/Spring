package com.example.demo.dao;

import com.example.demo.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{
    @PersistenceContext
    //Entity manager sirve para realizar la conexión con la BD
    private EntityManager entityManager;
    @Override
    public List<Usuario> getUsuario() {
        String query= "FROM Usuario";
        return entityManager.createQuery(query).getResultList();

    }
}
