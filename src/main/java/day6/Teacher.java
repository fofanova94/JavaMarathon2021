package day6;

import java.util.Random;

public class Teacher {
    String name;
    String discipline;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Student evaluate(Student student) {
        Random rand = new Random();
        String announce = null;

        int mark = rand.nextInt(2, 6);
        if (mark == 2) {
            announce = "неудовлетворительно";
        } else if (mark == 3) {
            announce = "удовлетворительно";
        } else if (mark == 4) {
            announce = "хорошо";
        } else if (mark == 5) {
            announce = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + discipline + " на оценку " + announce + ".");
        return student;
    }
}
