package com.flaminko.DAO.impl;


import com.flaminko.DAO.UserDao;
import com.flaminko.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(User u ){
        System.out.println(entityManager);
        entityManager.persist(u);
        System.out.println(entityManager.contains(u));

    }
}
