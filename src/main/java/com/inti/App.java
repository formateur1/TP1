package com.inti;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.inti.model.Aeroport;
import com.inti.model.CB;
import com.inti.model.InfosEscale;
import com.inti.model.Paiement;
import com.inti.model.Vol;

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
        
//        CB cb1 = new CB(2, 159, LocalDate.now(), 123456, LocalDate.of(2024, 10, 10));
        
//        session.save(p1);
//        session.save(cb1);
        
        Aeroport a1 = new Aeroport(3, "Paris");
        Vol v1 = new Vol(1, "AirFrance");
        
        InfosEscale ie1 = new InfosEscale(3, "13:45", "16:00");
        ie1.setAeroport(a1);
        ie1.setVol(v1);
        
//        session.save(ie1);
        
        List<InfosEscale> listeIE = new ArrayList<>();
        listeIE.add(ie1);
        
        a1.setListeIE(listeIE);
        
        session.save(a1);
        
        session.getTransaction().commit();
        
// Theo was here
    }
}
