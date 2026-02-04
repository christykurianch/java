import java.util.Scanner;

class complex{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of first complex number:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter real and imaginary part of second complex number:");
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.print("Sum = " + (a + c) +"+" + (b + d) + "i");

        sc.close();
    }

}