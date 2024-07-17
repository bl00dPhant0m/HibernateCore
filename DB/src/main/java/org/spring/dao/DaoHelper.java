package org.spring.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spring.entity.Employee;
import org.spring.utill.HibernateUtil;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DaoHelper {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();

    public  <T> T returnEntity(Object object){
         return (T) object;
    }

    public void chooseMethode(String s, Object o){
        try {
            Method method = session.getClass().getMethod("merge", Object.class);
            System.out.println(method.getName());
            method.invoke(session, o);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
