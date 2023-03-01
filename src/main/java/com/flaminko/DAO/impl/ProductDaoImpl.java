package com.flaminko.DAO.impl;

import com.flaminko.DAO.ProductDao;
import com.flaminko.models.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public void save(Product p) {
        entityManager.persist(p);
    }
}
