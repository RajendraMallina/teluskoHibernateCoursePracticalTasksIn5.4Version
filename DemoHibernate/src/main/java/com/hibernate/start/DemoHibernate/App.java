package com.hibernate.start.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        StandardServiceRegistryBuilder reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties());
        SessionFactory factory= con.buildSessionFactory(reg.build());
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        Employee emp = new Employee(1, "Rajendra", "SoftwareDeveloper", "Undrajavaram");
        Employee emp1 = new Employee(2, "Kumar", "SoftwareDeveloper", "Undrajavaram");
        session.save(emp);
        session.save(emp1);
        
        Employee getEmp = (Employee) session.get(Employee.class, 1);
        
        tx.commit();
        
        System.out.println(getEmp);
        
    }
}
