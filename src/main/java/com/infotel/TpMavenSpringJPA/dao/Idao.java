package com.infotel.TpMavenSpringJPA.dao;

import java.util.List;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;

public interface Idao {

	public int ajouterPersonne(Personne p);
	public int modifierPersonne(Personne p);
	public int supprimerPersonne(Personne p);
	public Personne getPersonne(int idPersonne);
	public List<Personne> findAllPErsonne();
	public Personne affichagePersonne(int idPersonne);
	
	public int ajouterAdresse(Adresse a);
	public int modifierAdresse(Adresse a);
	public int supprimerAdresse(Adresse a);
	public Adresse getAdresse(int idAdresse);
	public List<Adresse> findAllAdresse();
	public Adresse affichageAdresse(int idAdresse);
	
}
