class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public static void main(String[] args) {

        Product p1 = new Product(101, "Pen", 10);
        Product p2 = new Product(102, "Notebook", 40);
        Product p3 = new Product(103, "Pencil", 5);

        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }

        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("Product with lowest price:");
        System.out.println("product code: " + lowest.pcode);
        System.out.println("product name: " + lowest.pname);
        System.out.println("price: " + lowest.price);
    }
}


import java.util.*;

class Addmatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
