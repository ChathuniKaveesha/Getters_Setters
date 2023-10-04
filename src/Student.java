public class Student {
    private String name;
    private int age;
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }


    public char getGrade() {
        return grade;
    }

    public void setGrade(char newGrade) {
        this.grade = newGrade;
    }


    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Alice");
        student.setAge(18);
        student.setGrade('A');

        System.out.println("Student Info:");
        student.displayInfo();
    }
}

