package com.inti;

import java.time.LocalDate;

import org.hibernate.Session;

import com.inti.model.CB;
import com.inti.model.Paiement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
//        Paiement p1 = new Paiement(1, 15.26, LocalDate.now());
        
        CB cb1 = new CB(2, 159, LocalDate.now(), 123456, LocalDate.of(2024, 10, 10));
        
//        session.save(p1);
        session.save(cb1);
        
        session.getTransaction().commit();
        
// Theo was here
    }
}
