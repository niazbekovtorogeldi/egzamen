package org.example.confic;

import jakarta.persistence.EntityManager;
import org.example.repository.AftoShop;
import org.example.repository.Car;
import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;

import static org.hibernate.cfg.AvailableSettings.*;

public class Confic {
    public static EntityManager getEntityManagerFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.setProperty(DRIVER, "org.postgresql.Driver");
            configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/postgres");
            configuration.setProperty(USER, "postgres");
            configuration.setProperty(PASS, "1234");
            configuration.setProperty(HBM2DDL_AUTO, "update");
            configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            configuration.setProperty(SHOW_SQL, "true");
            configuration.addAnnotatedClass(Car.class);
            configuration.addAnnotatedClass(AftoShop.class);
            return configuration.buildSessionFactory().createEntityManager();
        } catch (
                HibernateException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
