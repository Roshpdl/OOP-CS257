import java.util.Scanner;

public class StringErrors2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        char letter = input.charAt(1);
        System.out.println(letter);
    }
}
