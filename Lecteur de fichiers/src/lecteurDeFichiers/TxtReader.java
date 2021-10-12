package lecteurDeFichiers;

import java.util.ArrayList;





public class TxtReader {

	public static void main(String[] args) {
		System.out.println("Normal Reader :");
		NormalFileReader test1 = new NormalFileReader("./test.txt");
		test1.stream();
		System.out.println(" ");
		
		System.out.println("Reversed Reader :");
		ReverseFileReader test2 = new ReverseFileReader("./test.txt");
		test2.stream();
		System.out.println(" ");
		
		System.out.println("Palindromic Reader :");
		PalindromicFileReader test3 = new PalindromicFileReader("./test.txt");
		test3.stream();
		System.out.println(" ");
		
		System.out.println("File comparator :");
		NormalFileReader test4 = new NormalFileReader("./test.txt");
		NormalFileReader test5 = new NormalFileReader("./test3.txt");
		ArrayList<String> content1 = test4.stream();
		System.out.println(" ");
		ArrayList<String> content2 = test5.stream();
		System.out.println(" ");
		test4.diff(content1,content2);
		
	}

}
