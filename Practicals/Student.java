public class Student {
    private String name;
    private String rollNumber;
    private int marks;
    public Student(String name, String rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Roll Number: " + rollNumber + "\n" +
               "Marks: " + marks + "\n" +
               "Grade: " + calculateGrade();
    }
    public static void main(String[] args) {
        Student student1 = new Student("Nithya", "S123", 85);
        Student student2 = new Student("Dhiyani", "S124", 72);
        System.out.println(student1);
        System.out.println();
        System.out.println(student2);
    }
}

