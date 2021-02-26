import java.util.Scanner;

public class Homework2 {  
  public static void main(String[] args) {
    
    Scanner text = new Scanner(System.in);
    System.out.print("Input text ");
    String word = text.nextLine();
    int wordCount = 0;
    
		for (char letter = 'a'; letter <= 'z'; letter++) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == letter) {
					wordCount++;
				}
			}
			if (wordCount > 0) {
				System.out.println(letter + "=" + wordCount);
				wordCount = 0;
			}
		}
  }
}