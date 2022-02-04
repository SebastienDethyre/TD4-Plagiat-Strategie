package Comparator;

public class ComparatorById extends Comparato{
	public int compare(Etudiant etud1, Etudiant etud2) {
		return etud1.getId() - etud2.getId();
	}
}
