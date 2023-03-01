package com.flaminko.DAO.impl;

import com.flaminko.DAO.CategoryDao;
import com.flaminko.models.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

public class CategoryDaoImpl implements CategoryDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional

    public void save(Category u) {
        entityManager.persist(u);
    }
}
