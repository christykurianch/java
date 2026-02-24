import java.util.Arrays;
import java.util.Scanner;

class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        System.out.println("Sorted string: " + new String(ch));

        sc.close();
    }
}