import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private String address;
    private ArrayList<Double> marks;

    // Constructor
    public Student(String name, int age, String address, ArrayList<Double> marks) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.marks = marks;
    }

    // Phương thức tính điểm trung bình
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    // Phương thức hiển thị thông tin sinh viên
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Marks: " + marks);
        System.out.printf("Average Mark: %.2f\n", calculateAverage());
    }
}

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách điểm
        ArrayList<Double> marks = new ArrayList<>();
        marks.add(8.0);
        marks.add(7.5);
        marks.add(9.0);
        marks.add(6.5);

        // Tạo đối tượng sinh viên
        Student student1 = new Student("Nguyen Van A", 20, "Da Nang", marks);

        // Hiển thị thông tin sinh viên và tính điểm trung bình
        student1.displayInfo();
    }
}
