package pk2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class ListeDesEmployes {
	private ArrayList<Employe> listemp = new ArrayList<Employe>();
	public void remplir() {
		listemp.add(new Employe("Alaoui",1000,0));
		listemp.add(new Employe("Alami",1000,1));
		
		}
	
	public void afficher() {
		for(Employe emp:listemp)
			System.out.println(emp);
	}
	public void parcourIt() {
		Iterator<Employe> it =listemp.iterator();
	    while (it.hasNext()) {
	        System.out.println(it.next());
	      }
	}
	public void insererEmp(Employe emp) {
		listemp.add(0,emp);
	}
	public Employe recuperEmployer(int index) {
		if(index>=0 && index <listemp.size())
			return listemp.get(index);
		 throw new IllegalArgumentException("l indice  doit etre compris entre 0 et la taille");
	}
	
	public boolean supprimerEmploye(Employe emp) {
		return listemp.remove(emp);
	}
	public boolean rechercheEmploye(Employe emp) {
		return listemp.contains(emp);
	}
	public void trierEmployes(Comparator<Employe> cmp) { 
		Collections.sort(listemp,cmp);
	}


	public void inverserList() {
		Collections.reverse(listemp);
	}	
	
	
	
	
}