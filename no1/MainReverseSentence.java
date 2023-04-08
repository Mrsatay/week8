package week8.no1;
import java.util.Scanner;

public class MainReverseSentence  {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        System.out.print("\nInsert Sentence: ");
        String str = input.nextLine();

        ReverseSentence stack = new ReverseSentence(str.length());

        // Masukkan setiap karakter dari string ke dalam stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Keluarkan setiap karakter dari stack dan tambahkan ke dalam string kosong
        String reversedStr = "";
        while (!stack.isEmpty()) {
            char ch = (char) stack.peek();
            stack.pop();
            reversedStr += ch;
        }

        System.out.println("Result: \n" + reversedStr);
        

    }

}
