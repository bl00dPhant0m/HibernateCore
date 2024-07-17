package org.spring.utill;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.spring.entity.Employee;
import org.spring.entity.Internship;
import org.spring.entity.Trainee;

public class HibernateUtil {
    private static SessionFactory sessionFactory = getSessionFactory();

    public static SessionFactory getSessionFactory() {
        return new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Trainee.class)
                .addAnnotatedClass(Internship.class)
                .buildSessionFactory();
    }

    public static Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public static void closeSession() {
        sessionFactory.close();
    }
}
