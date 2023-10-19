package com.xworkz.bookings.booking.impl;

import com.xworkz.bookings.booking.BookMyshow;
import com.xworkz.bookings.dto.MovieticketDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookMyShowImpl implements BookMyshow {
    @Override
    public boolean save(MovieticketDto dto) {
        boolean isadded = false;
        Persistence persistence = new Persistence();
        EntityManagerFactory entityManagerFactory = persistence.createEntityManagerFactory("");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        entityManager.persist(dto);
        return isadded;
    }
}
