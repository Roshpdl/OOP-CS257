import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        printWords("Foo was here");
    }
    public static void printWords(String sentence) {
        String rest = sentence;
        boolean done = false;
        while (!done) {
            int i = rest.indexOf(" ");
            if (i == -1) {
                System.out.println(rest);
                done = true;
            } else {
                System.out.println(rest.substring(0, i));
                rest = rest.substring(i + 1);
            }
        }
    }

//    what is wrong with this implementation?
    public static int[] allMatches(int[] values, int size, int a, int b) {
        int count = 0;
        for (int v : values) {
            if (v >= a && v <= b) {
                count++;
            }
        }
        int[] result = new int[count];
        int i=0;
        for (int k=0; k < size; k++) {
            if (values[k] >= a && values[k] <= b) {
                result[i] = values[k];
                i++;
            }
        }
        return result;
    }
}
