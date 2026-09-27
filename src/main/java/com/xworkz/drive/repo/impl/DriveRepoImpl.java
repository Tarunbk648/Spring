package com.xworkz.drive.repo.impl;

import com.xworkz.drive.entity.DriveEntity;
import com.xworkz.drive.repo.DriveRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

@Repository
public class DriveRepoImpl implements DriveRepo {
    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
    EntityManager entityManager= entityManagerFactory.createEntityManager();
    @Override
    public boolean saveData(DriveEntity driveEntity) {
        entityManager.getTransaction().begin();
        entityManager.persist(driveEntity);
        entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public List<DriveEntity> getAllAccount() {
        List<DriveEntity> entity=entityManager.createNamedQuery("getAll") .getResultList();
        return entity;
    }

    @Override
    public DriveEntity updateById(int id) {
        DriveEntity driveEntity=entityManager.find(DriveEntity.class, id);
        return driveEntity;
    }

    @Override
    public boolean setData(DriveEntity driveEntity) {
        if(driveEntity!=null){
            entityManager.getTransaction().begin();
            entityManager.merge(driveEntity);
            entityManager.getTransaction().commit();
        }
        return true;
    }

    @Override
    public boolean deleteData(int id) {
        entityManager.getTransaction().begin();
        entityManager.createNamedQuery("delete").setParameter("id", id).executeUpdate();
        entityManager.getTransaction().commit();
        return true;
    }


}
