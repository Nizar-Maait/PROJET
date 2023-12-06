package pk2;
import java.util.Arrays;
import java.util.Collections;



public class Employe extends Personne{
	
	public Employe(String nom, double salaire, int id) {
		super(nom, salaire);
		this.id = id;
	}

	private int id;
	

	}
 // Additional attributes/methods for Employe if needed


//3. New class with an array of the parent class
class MyClass {
 private Personne[] personnes;

 // 4a. Constructor to fill the array
 public MyClass(Personne[] personnes) {
     this.personnes = personnes;
 }

 // 4b. Method to sort elements
 public void sortArray() {
     Arrays.sort(personnes);
 }

 // 4c. Method to add an element
 public void addElement(Personne personne) {
     // Logic to add an element
 }

 // 4d. Method to remove an element
 public void removeElement(Personne personne) {
     // Logic to remove an element
 }

 // 4e. Method to count elements
 public int countElements() {
     return personnes.length;
 }

 // 4f. Method to reverse array
 public void reverseArray() {
     Collections.reverse(Arrays.asList(personnes));
 }

 // 4g. Method to display elements
 public void displayElements() {
     for (Personne personne : personnes) 
     {
         System.out.println(personne);
     }
 
 }


}



