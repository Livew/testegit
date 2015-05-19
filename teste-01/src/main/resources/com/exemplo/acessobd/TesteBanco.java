package com.exemplo.acessobd;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.exemplo.entidade.Mensagem;


public class TesteBanco {

	public TesteBanco() {
		
	}
	
	public void teste() {		
		List<Mensagem> list= null;
		
		SessionFactory sessions = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessions.openSession();
		
		try {
			session.beginTransaction();
			list = session.createQuery("select msg from Mensagem msg").list();
			session.getTransaction().commit();
			
			for (Mensagem msg : list) {
				System.out.println(msg.getMsg());
			}

		} catch ( HibernateException e ) {
			if ( session.getTransaction() != null )
				session.getTransaction().rollback();
		} finally {
			session.close();
		}
				
	}
	
}


Leia mais em: Criando um Projeto Web com Hibernate e Eclipse Kepler http://www.devmedia.com.br/criando-um-projeto-web-com-hibernate-e-eclipse-kepler/29168#ixzz3aXXBzG69
