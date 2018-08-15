/*package com.epam.lowcost.dao;

import com.epam.lowcost.model.AbstractEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;
@Component
public class DaoImpl implements Dao {

    @Autowired
   private SessionFact ory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public AbstractEntity add(AbstractEntity abstractEntity) {

        Session session = sessionFactory.getCurrentSession();
        session.save(abstractEntity);

        return null;
    }

    @Override
    public Stream findAll() {
        return null;
    }

    @Override
    public Dao delete(AbstractEntity abstractEntity) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(abstractEntity);
        return this;
    }

    @Override
    public AbstractEntity update(AbstractEntity t) {
        Session session = sessionFactory.getCurrentSession();
        session.update(t);
        return t;
    }
}*/
