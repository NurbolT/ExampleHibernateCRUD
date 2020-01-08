package com.item.dao;

import com.item.model.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.management.Query;
import java.util.List;

@Component
public class ItemDAOImpl implements ItemDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Item> allItems() {
        Session session = sessionFactory.openSession();

        List<Item> items = session.createQuery("FROM Item ").getResultList(); //HQL
        session.close();

        return items;
    }

    @Override
    public void add(Item item) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(item);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Item item) {

        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        session.delete(item);
        tr.commit();
        session.close();

    }

    @Override
    public void edit(Item item) {
        Session session = sessionFactory.openSession();
        Transaction tr = session.beginTransaction();
        session.update(item);
        tr.commit();
        session.close();
    }

    @Override
    public Item getById(Long id) {
        Session session = sessionFactory.openSession();
        Item item = (Item) session.createQuery("SELECT c FROM Item c WHERE c.id = :idshka")
                .setParameter("idshka", id)
                .uniqueResult();
        session.close();
        return item;

    }
}
