package pk2;

import java.util.Arrays;


public class GestionTableau {
    private static final Personne[] Personnes = null;
	private Personne[] tableau;

    public GestionTableau(Personne[] tableau) {
        this.tableau = tableau;
    }

    public void trierTableau() {
        Arrays.sort(tableau);
    }

    public void ajouterElement(Personne personne) {
        // Code pour ajouter un élément dans le tableau
    }
    public void afficher()
	{
		for(Personne prs:Personnes)
		{
			System.out.println(prs);
		}
	}
    
}