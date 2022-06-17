package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        teacher.setDiscipline("Math");
        teacher.setName("Jack");
        student.setName("Ivan");
        teacher.evaluate(student);
    }
}
