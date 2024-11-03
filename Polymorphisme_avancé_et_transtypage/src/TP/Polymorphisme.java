package TP;

public class Polymorphisme {

	 public static void main(String[] args) {
	        // Étape 4 : Création d'un tableau d'objets Employe avec polymorphisme
	        Employe[] employes = new Employe[2];
	        employes[0] = new Developpeur("Alice", 50000, "Java");
	        employes[1] = new Manager("Bob", 70000, 5);

	        for (Employe employe : employes) {
	            employe.afficherInfos();  // Appel de la méthode spécifique de chaque sous-classe
	        }

	        // Étape 5 : Sur-casting (upcasting)
	        Employe employeDev = new Developpeur("Charlie", 60000, "Python"); // Upcasting
	        employeDev.afficherInfos();  // Affiche les infos spécifiques au développeur grâce au polymorphisme

	        // Étape 6 : Sous-casting (downcasting) pour accéder aux méthodes spécifiques des sous-classes
	        if (employeDev instanceof Developpeur) {
	            Developpeur dev = (Developpeur) employeDev; // Downcasting
	            dev.afficherLangage();  // Appel de la méthode spécifique à Developpeur
	        }

	        // Autre exemple de downcasting avec un objet Manager
	        Employe employeMgr = new Manager("Dave", 80000, 10); // Upcasting
	        if (employeMgr instanceof Manager) {
	            Manager mgr = (Manager) employeMgr; // Downcasting
	            mgr.gererEquipe();  // Appel de la méthode spécifique à Manager
	        }
	    }
	}