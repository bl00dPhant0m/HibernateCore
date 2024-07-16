package org.spring;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    @Getter
    private static final SessionFactory sessionFactory  = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        return new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Diary.class)
                .buildSessionFactory();
    }

    public static void shutdown(){
        getSessionFactory().close();
    }
}
