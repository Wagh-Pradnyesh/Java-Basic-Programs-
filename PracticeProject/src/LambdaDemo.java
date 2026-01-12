/*import java.util.Scanner;

@FunctionalInterface
interface calculate {
   public int add(int a,int b);
}
public class LambdaDemo {

    public static void main(String[] args) {
        LambdaDemo obj = new LambdaDemo();
        Scanner scanner = new Scanner(System.in);
        calculate obj2=(int a,int b) -> (a+b);

        System.out.println("Add="+ obj2.add(5,10));
    }
}*/


import java.util.Scanner;

@FunctionalInterface
interface Calculate {
    int add(int a, int b);
}

public class LambdaDemo {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        Calculate obj2 = (x, y) -> x + y;

        System.out.println("Add = " + obj2.add(a, b));

        scanner.close();
    }
}

