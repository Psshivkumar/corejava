package com.xworkz.showroom.girias.impl;

import com.xworkz.showroom.dto.ApplienceDto;
import com.xworkz.showroom.girias.Girias;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GiriasImpl implements Girias {


    @Override
    public boolean addSAppliences(ApplienceDto dto) {
        boolean isAdded = false;
        Persistence persistence = new Persistence();
        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
        entityManager.getTransaction().begin();
        entityManager.persist(dto);
        entityManager.getTransaction().commit();
        isAdded = true;

        return isAdded;
    }
}
