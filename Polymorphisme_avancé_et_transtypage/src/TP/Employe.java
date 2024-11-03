package TP;

public class Employe {
	protected String nom;
	protected int salaire;
	
    public Employe(String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }
	
	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public void afficherInfos() {
		  System.out.println("Nom de l'employé : " + nom);
	        System.out.println("Salaire : " + salaire + "€");
	}

}
