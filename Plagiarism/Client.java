import java.util.*;

public class Client {
	
	 public static void main(String[] args) {
		 String texteATester1 = "sed Lacus Ex, Tincidunt sed leo id, volutpat semper nulla. Phasellus at varius augue. Duis pellentesque quam tortor, quis dictum lectus posuere vel. Fusce gravida sagittis hendrerit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed mollis augue ac elementum aliquet. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Duis id augue at arcu faucibus aliquet a at quam.";
		 PlagiarismChecker checker = new PlagiarismChecker();
		 LevenshteinStrategy L= new LevenshteinStrategy();
		 HammingStrategy H = new HammingStrategy();
		 checker.setTreshold(3);
		 
		 
		checker.setCheckerStrategy(L);
		System.out.println(checker.checkPlagiarism(texteATester1));
		
		checker.setCheckerStrategy(H);
		System.out.println(checker.checkPlagiarism(texteATester1));
	 }
}
