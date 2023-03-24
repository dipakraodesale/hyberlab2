package com.hiberlab2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Course s=new Course();
    	s.setCid(01);
    	s.setSubjectname("Java Programming");

    	Course s2=new Course();
    	s2.setCid(02);
    	s2.setSubjectname("Python Programming");

    	Course s3=new Course();
    	s3.setCid(03);
    	s3.setSubjectname("Angular Programming");

    	Teacher teacher=new Teacher();
    	teacher.setId(101);
    	teacher.setName("Mrunali");
    	teacher.getList1().add(s);
    	teacher.getList1().add(s2);
    	teacher.getList1().add(s3);

    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Teacher.class).addAnnotatedClass(Course.class);
    	SessionFactory sf=cfg.buildSessionFactory();
    	Session ss=sf.openSession();
    	Transaction t=ss.beginTransaction();
    	ss.save(s);
    	ss.save(s2);
    	ss.save(s3);
    	ss.save(teacher);
    	ss.getTransaction().commit();
        System.out.println( "Hello World!" );
    }
}
    

