package Comparator;

public class ComparatorByName {
	public int compare(Etudiant etud1, Etudiant etud2) {
		return etud1.getNom().compareTo(etud2.getNom()) + etud1.getPrenom().compareTo(etud2.getPrenom());
	}
}
