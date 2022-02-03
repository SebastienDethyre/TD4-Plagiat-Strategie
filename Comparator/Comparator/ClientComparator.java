package Comparator;
import java.util.*;

public class ClientComparator {
	
	 public static void main(String[] args) {
		 Etudiant etud1 = new Etudiant();
		 Etudiant etud2 = new Etudiant();
		 Etudiant etud3 = new Etudiant();
		 Etudiant etud4 = new Etudiant();
		 Promotion promo = new Promotion();
		 promo.add(etud1);
		 promo.add(etud1);
		 promo.add(etud1);
		 promo.add(etud1);
		 ComparatorById Cid = new ComparatorById();
		 promo.setStrategy(Cid);
		 promo.execute();
	 }
}
