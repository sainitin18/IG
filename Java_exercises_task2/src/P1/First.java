package P1;

import java.util.Scanner;

public class First {
	
	public static String captalise(String str) {
		StringBuilder sb = new StringBuilder();
		String [] words = str.split(" ");
		for(String word : words) {
			sb.append(Character.toUpperCase(word.charAt(0)))
					.append(word.substring(1).toLowerCase())
					.append(" ");
			}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the text");
		String str = s.nextLine();
		String res = captalise(str);
		System.out.println(res);
	}

}
