class Student {

    String name;
    String lastname;
    int grade;

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public Student setLastName(String lastname) {
        this.lastname = lastname;
        return this;
    }

}

public class Chaining {

    public static void main(String[] args) {

        Student s = new Student();
        s.setGrade(7).setName("Bob").setLastName("Swift");
        System.out.println(s.name);
        System.out.println(s.grade);
        System.out.println(s.lastname);
    }
}
