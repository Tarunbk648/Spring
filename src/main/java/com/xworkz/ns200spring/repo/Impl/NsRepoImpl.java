package com.xworkz.ns200spring.repo.Impl;

import com.xworkz.ns200spring.entity.NsEntity;
import com.xworkz.ns200spring.repo.NsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


@Repository
public class NsRepoImpl implements NsRepo {

    @Autowired
    EntityManagerFactory entityManagerFactory;


    @Override
    public boolean saveData(NsEntity nsEntity) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(nsEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}
