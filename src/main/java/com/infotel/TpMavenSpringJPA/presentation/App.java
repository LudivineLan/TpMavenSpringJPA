package com.infotel.TpMavenSpringJPA.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringJPA.metier.Adresse;
import com.infotel.TpMavenSpringJPA.metier.Personne;
import com.infotel.TpMavenSpringJPA.service.IService;
import com.infotel.TpMavenSpringJPA.service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//1-Charger les fichier de configuration spring
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext (3).xml");
       
       //2-Recuperer et utiliser les beans service et personne
       
       Personne p = context.getBean("pers", Personne.class);
       
       IService service = context.getBean("service", ServiceImpl.class);
       System.out.println(p);
       service.ajouterPersonne(p);
       
       Personne p1 = context.getBean("pers1", Personne.class);
       p1.setNom("Moulin");
       p1.setPrenom("Roger");
       p1.setAge(45);
       service.ajouterPersonne(p1);
       
//       Personne p2 = context.getBean("pers2", Personne.class);
//       p2.setNom("Moulin");
//       p2.setPrenom("Melanie");
//       p2.setAge(36);
//       service.ajouterPersonne(p2);
       
////       GetPersonne
//       service.getPersonne(3);
//       System.out.println(service.affichagePersonne(3));
       
//       Supprimer Personne
//       Personne p3 = context.getBean("pers3", Personne.class);
//       p3 = service.getPersonne(7);
//       service.supprimerPersonne(p3);
       
////       Ajouter Personne
//       Personne p4 = context.getBean("pers4", Personne.class);
//       p4.setNom("Moureau");
//       p4.setPrenom("Marion");
//       p4.setAge(36);
//       service.ajouterPersonne(p4);
       
////       Modifier Personne
//       p4 = service.affichagePersonne(4);
//       p4.setPrenom("Jules");
//       service.modifierPersonne(p4);
       
//       //Lister Personne
//    	  System.out.println(service.findAllPErsonne());
    	  
    	  Adresse a1 = context.getBean("adr1", Adresse.class);
    	  System.out.println(a1);
    	  service.ajouterAdresse(a1);
    	  
    	  Personne p2 = context.getBean("pers2", Personne.class);
          p2.setNom("Moule");
          p2.setPrenom("Jacques");
          p2.setAge(45);
          p2.setAdresse(a1);
          service.ajouterPersonne(p2);
    	  
//    	  Adresse a2 = context.getBean("adr2", Adresse.class); 
//    	  a2.setNumRue("2bis");
//    	  a2.setNomRue("rue de l'olympe");
//    	  a2.setVille("paris");
//    	  a2.setCp("75");
//    	  System.out.println(a2);
//    	  service.ajouterAdresse(a2);
    	   
       
     //4- fermer le contexte
       context.close();
    }
}
