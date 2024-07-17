package org.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spring.dao.DaoHelper;
import org.spring.dao.TraineeDao;
import org.spring.entity.Employee;
import org.spring.entity.Internship;
import org.spring.entity.Trainee;
import org.spring.utill.HibernateUtil;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Internship internship = new Internship("МГУ", 20);
        Trainee trainee = new Trainee("Nikolay", "Ivanov", internship);
        Employee employee = new Employee("Dmitriy", "Petrov",
                250_000, LocalDate.of(1999, 6, 24));
        Employee employee2 = new Employee("Alexey", "Smith",
                260_000, LocalDate.of(2000, 1, 15));

        internship.setTrainee(trainee);
        employee.setTrainee(trainee);
        System.out.println(trainee);
//        TraineeDao traineeDao = new TraineeDao();
//        Trainee trainee1 = traineeDao.find(2);
//        System.out.println(trainee1);
//        HibernateUtil.closeSession();

//        Object object = employee2;
//        DaoHelper daoHelper = new DaoHelper();
//        daoHelper.
//        System.out.println(daoHelper.returnEntity(object).getClass());
    }
}
