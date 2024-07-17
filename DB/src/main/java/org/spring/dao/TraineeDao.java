package org.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spring.entity.Trainee;
import org.spring.utill.HibernateUtil;

public class TraineeDao {
    public void save(Trainee trainee) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        try {
            session.persist(trainee);
            session.getTransaction().commit();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
    }

    public void update(Trainee trainee) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        try {
            session.merge(trainee);
            session.getTransaction().commit();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
    }

    public void delete(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        try {
            Trainee trainee = (Trainee) session.get(Trainee.class, id);
            session.delete(trainee);
            session.getTransaction().commit();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            session.close();
        }
    }

    public Trainee find(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Trainee trainee = null;

        try {
            trainee = session.get(Trainee.class, id);
            session.getTransaction().commit();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
          session.close();
        }
        return trainee;
    }
}
