package com.infotel.TpMavenSpringJPA.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;

@Transactional
@Repository("dao")
public class DaoImpl implements Idao {

	@PersistenceContext
	EntityManager em;
	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.persist(p);
		return p.getIdPersonne();
	}
	@Override
	public int modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.merge(p);
		return p.getIdPersonne();
	}
	@Override
	public int supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		em.remove(p);
		return p.getIdPersonne();
	}
	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		Personne p = em.getReference(Personne.class, idPersonne);
		return p;
	}
	@Override
	public List<Personne> findAllPErsonne() {
		// TODO Auto-generated method stub
		Query q = null; 
		List<Personne> l = new ArrayList<Personne>();
		q = em.createQuery("SELECT p FROM Personne p");
		l= q.getResultList();
		return l;
	}
	
	@Override
	public Personne affichagePersonne(int idPersonne) {
		Personne p = em.find(Personne.class, idPersonne);
		return p;
	}
	
	//Adresse
	@Override
	public int ajouterAdresse(Adresse a) {
		em.persist(a);
		return a.getIdAdresse();
	}
	@Override
	public int modifierAdresse(Adresse a) {
		em.merge(a);
		return a.getIdAdresse();
	}
	@Override
	public int supprimerAdresse(Adresse a) {
		em.remove(a);
		return a.getIdAdresse();
	}
	@Override
	public Adresse getAdresse(int idAdresse) {
		Adresse a = em.getReference(Adresse.class, idAdresse);
		return a;
	}
	@Override
	public List<Adresse> findAllAdresse() {
		Query q = null; 
		List<Adresse> l = new ArrayList<Adresse>();
		q = em.createQuery("SELECT a FROM Adresse a");
		l= q.getResultList();
		return l;
	}
	@Override
	public Adresse affichageAdresse(int idAdresse) {
		Adresse a = em.find(Adresse.class, idAdresse);
		return null;
	}

}
