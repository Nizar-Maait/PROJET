package pk2;
import java.util.ArrayList;
import java.util.List;



import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ListeDesEmployes listeEmployes = new ListeDesEmployes();

        // Remplir la liste d'employés
        listeEmployes.remplir();

        // Afficher les employés
        System.out.println("Liste des employes :");
        listeEmployes.afficher();

        // Insérer un nouvel employé
        Employe nouvelEmploye = new Employe("Nouveau", 1500, 2);
        listeEmployes.insererEmp(nouvelEmploye);

        // Afficher les employés après l'insertion
        System.out.println("\nListe des employés apres insertion :");
        listeEmployes.afficher();

        // Récupérer un employé par index
        int index = 1;
        Employe employeRecupere = listeEmployes.recuperEmployer(index);
        System.out.println("\nEmployé rrcupéré à l index " + index + " : " + employeRecupere);

        // Supprimer un employé
        boolean suppression = listeEmployes.supprimerEmploye(nouvelEmploye);
        System.out.println("\nSuppression de l employé " + nouvelEmploye + " : " + suppression);

        // Rechercher un employé
        Employe employeRecherche = new Employe("Alaoui", 1000, 0);
        boolean recherche = listeEmployes.rechercheEmploye(employeRecherche);
        System.out.println("\nRecherche de lemployé " + employeRecherche + " : " + recherche);

        
}
}