package TP;

public class Manager extends Employe {


	    // Attribut spécifique au manager
	    private int nombreDeSubordonnes;

	    // Constructeur pour initialiser les attributs, y compris ceux de la classe parent
	    public Manager(String nom, int salaire, int nombreDeSubordonnes) {
	        super(nom, salaire); // Appel du constructeur de la classe parent
	        this.nombreDeSubordonnes = nombreDeSubordonnes;
	    }

	    // Redéfinition de la méthode afficherInfos() pour inclure le nombre de subordonnés
	    @Override
	    public void afficherInfos() {
	        super.afficherInfos(); // Appel de la méthode afficherInfos() de la classe parent
	        System.out.println("Nombre de subordonnés : " + nombreDeSubordonnes);
	    }

	    // Méthode spécifique pour simuler la gestion de l'équipe
	    public void gererEquipe() {
	        System.out.println("Le manager gère une équipe de " + nombreDeSubordonnes + " subordonnés.");
	    }

}
