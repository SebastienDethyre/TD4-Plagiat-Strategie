package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.univamu.iut.exo3.Composant;

public class Promotion {
	//private Etudiant[] Etud;
	private List<Etudiant> etudiants = new ArrayList<>();
	private Comparator myComp;
	private int treshold=0;
   


    public void setTreshold(int treshold) {
    	this.treshold = treshold;
    }
	
	public Etudiant add(Etudiant e) {
		etudiants.add(e);
		return e;		
	}
	
	public Etudiant remove(Etudiant e) {
		etudiants.remove(e);
		return e;		
	}
	
	public Etudiant getEtudiant(int index) {
		return etudiants.get(index);
	}
	
	public void setStrategy(Comparator c) {
        myComp = c;
    }

    public void execute() {
    	Collections.sort(etudiants, new ComparatorById());
    	//for (int i=0;i<etudiants.size();++i)
    	//{
    		//int temp =myComp.compare(etudiants.get(i), etudiants.get(i+1));
    	//System.out.println(temp);
    			
        
    	}
    	
    }
}
