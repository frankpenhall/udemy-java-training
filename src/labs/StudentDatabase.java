package labs;

import java.util.Locale;

public class StudentDatabase {
    public static void main(String[] args) {
        Student stu1 = new Student("Janny", "293184451");
        Student stu2 = new Student("Rob", "827615537");
        Student stu3 = new Student("Bonnie", "635188396");

        stu1.enroll("MATH 121");
        stu1.enroll("ENG 240");

        //stu1.checkBalance();
        //stu1.showCourses();
        stu1.payTuition(600);
        //stu1.checkBalance();
        System.out.println(stu1.toString());
    }
}

class Student {
    // Properties
    private String name;
    private String ssn;
    private String email;
    private static int id = 0;
    private String userId;
    public String courses = "";
    private static final int costOfCourse = 800;
    private int balance;
    private String phone;
    private String city;
    private String state;

    public Student(String name, String ssn) {
        id++;
        this.name = name;
        this.ssn = ssn;
        setUserID();
        setEmail();
    }

    private void setEmail() {
        email = name.toLowerCase(Locale.ROOT) + "." + id + "@abcuniversity.com";
        System.out.println("Your email: " + email);
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private void setUserID() {
        int max = 9000;
        int min = 1000;
        int random = (int) (Math.random() * (max - min));
        random = random + min;
        System.out.println(random);
        userId = id + "" + random + "" + ssn.substring(5);
        System.out.println("User ID: " + userId);
    }

    public void enroll(String course) {
        this.courses = this.courses + "\n" + course;
        System.out.println(courses);
        balance = balance + costOfCourse;
    }

    public void payTuition(int amount) {
        balance = balance - amount;
        System.out.println("Payment: $" + amount);
    }

    public void checkBalance() {
        System.out.println("Balance: $" + balance);
    }

    public void showCourses() {
        System.out.println("Courses: " + courses);
    }

    public String toString() {
        return "Name: " + name + "\nCourses: " + courses + "\nBalance: $" + balance;
    }
}
