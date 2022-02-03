package Comparator;

import java.util.ArrayList;
import java.util.List;

import Plagiarism.EditDistanceStrategy;
import fr.univamu.iut.exo3.Composant;

public class Promotion {
	//private Etudiant[] Etud;
	private List<Etudiant> etud = new ArrayList<>();
	private Comparator myComp;
	private int treshold=0;
   


    public void setTreshold(int treshold) {
    	this.treshold = treshold;
    }
	
	public Etudiant add(Etudiant e) {
		etud.add(e);
		return e;		
	}
	
	public Etudiant remove(Etudiant e) {
		etud.remove(e);
		return e;		
	}
	
	public Etudiant getEtudiant(int index) {
		return etud.get(index);
	}
	public void setStrategy(Comparator c) {
        myComp = c;
    }

    public void execute(Etudiant etud1, Etudiant etud2) {
    	for (int i=0;i<etud.size();++i)
    	{
    	if(myComp.compare(etud.get(i), etud.get(i+1)) < treshold)
        	etud.swap(etud, etud.get(i), etud.get(i+1));
        return true;
    	}
    }
}
