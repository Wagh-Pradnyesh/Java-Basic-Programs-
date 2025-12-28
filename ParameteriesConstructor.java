class Student {
    // Data members
    int rollNo;
    String name;

    // Parameterized constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Method to display data
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects and passing parameters
        Student s1 = new Student(101, "Pradnyesh");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();
    }
}
