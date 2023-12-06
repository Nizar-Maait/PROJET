package pk2;

	import java.util.*;



	// 1. Classes: Personne (Parent) and Employe (Child)
	class Personne implements Comparable<Personne> {
	    // 2a. Attributes
		private String nom;
		private double salaire;
	    
	    	
	    

	    // 2b. Constructor with parameters
	    public Personne(String nom, double salaire) {
	        this.nom = nom;
	        this.salaire=salaire;
	    }

	    // 2c. Methods: toString, equals, clone
	    @Override
	    public String toString() {
	        return "Personne{nom='" + nom+ "'}";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Personne personne = (Personne) obj;
	        return Objects.equals(nom, personne.nom);
	    }

	    @Override
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    // 2c. Comparable interface
	    @Override
	    public int compareTo(Personne personne) {
	        return this.nom.compareTo(personne.nom);
	    }
	}

	


