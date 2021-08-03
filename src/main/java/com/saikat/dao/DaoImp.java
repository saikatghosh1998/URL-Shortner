package com.saikat.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saikat.model.Link;

@Repository
public class DaoImp implements Dao {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	//Method for saving into DB(saving id & long URL)
	@Transactional
	public int saveLink(Link link) {
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		return (Integer)currentSession.save(link);
	}
	
	//Method for updating into DB (updating the short URL)
	@Transactional
	public void update(Link link) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(link);	
	}

	@Transactional
	public Link getLink(String Link) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query=currentSession.createQuery("from Link where shortUrl= :shortUrl");
	    query.setParameter("shortUrl", Link);
		List<Link> link = query.getResultList();
		Link l = new Link();
		try {
			l = link.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return l;
	}

	

}
