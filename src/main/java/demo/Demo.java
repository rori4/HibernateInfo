package demo;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionFactory =
                cfg.buildSessionFactory();
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();

            Student joro = new Student("joro", LocalDate.now());
            session.save(joro);

            session.getTransaction().commit();
        }
    }

}
