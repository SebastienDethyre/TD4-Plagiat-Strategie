package Comparator;
import java.util.*;

public class ClientComparator {
	
	 public static void main(String[] args) {
		 Etudiant etud1 = new Etudiant("Durieux","Joe",5);
		 Etudiant etud2 = new Etudiant("Maxens","Sylvain",8);
		 Etudiant etud3 = new Etudiant("Jilain","Didier",4);
		 Etudiant etud4 = new Etudiant("Durimi","Henri",1);
		 Promotion promo = new Promotion();
		 promo.add(etud1);
		 promo.add(etud2);
		 promo.add(etud3);
		 promo.add(etud4);
		 ComparatorByName Cid = new ComparatorByName();
		 ComparatorById Cid2 = new ComparatorById();
		 promo.setStrategy(Cid2);
		 promo.execute();
	 }
}
