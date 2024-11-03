package TP;

public class Developpeur extends Employe {
	private String langage;
	
	public Developpeur() {
		super();
		this.langage="";

	}
	
	public Developpeur(String nom, int salaire,String langage ) {
		super(nom,salaire);
		this.langage=langage;

	}
	
	public void afficherInfos() {
		  System.out.println("Nom de l'employé : " + nom);
	        System.out.println("Salaire : " + salaire + "€");
	  	  System.out.println(":  le langage de programmation" + langage);
	  	  
	}
	public void  afficherLangage() {
		System.out.println(" le langage utilisé par le développeur"+ langage);
		
		
	}

}
