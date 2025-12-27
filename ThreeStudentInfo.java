import java.util.Scanner;

class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                for(int i = 1; i <= 3; i++) {
            System.out.println("---- Student " + i + " Details ----");

            System.out.print("Enter Your Name: ");
            String name = sc.nextLine(); 

            System.out.print("Enter Your  Roll No: ");
            int rollno = sc.nextInt();
            System.out.print("Enter Your Fees: ");
            float fees = sc.nextFloat();

            sc.nextLine();
                    System.out.println("\n*** Student " + i + " Information ***");
                    System.out.println("Name  : " + name);
                    System.out.println("Roll NO   : " + rollno);
                    System.out.println("Fees : " + fees);
                    System.out.println("--------------------------------\n");

        }

        sc.close();
    }
}
