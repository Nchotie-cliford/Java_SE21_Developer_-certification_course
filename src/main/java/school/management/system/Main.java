package school.management.system;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 5000);
        Teacher Paul = new Teacher(2, "Paul", 5000);
        Teacher Mary = new Teacher(3, "Mary", 9000);
        Teacher John = new Teacher(4, "John", 5000);
        Teacher Jack = new Teacher(5, "Jack", 7000);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(Paul);
        teachersList.add(Mary);
        teachersList.add(John);
        teachersList.add(Jack);


        Student Cliff = new Student(1, "Cliff", 26, 6);
        Student David = new Student(2, "David", 22, 6);
        Student Johnson = new Student(3, "Johnson", 22, 6);
        Student Jackson = new Student(4, "Jackson", 22, 6);
        Student Jane = new Student(5, "Jane", 22, 6);
        Student Maryson = new Student(6, "Maryson", 22, 6);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Cliff);
        studentList.add(David);
        studentList.add(Johnson);
        studentList.add(Jackson);
        studentList.add(Jane);
        studentList.add(Maryson);


        School UniBayreuth = new School(teachersList, studentList);

        Cliff.payFees(20000);

        System.out.println(UniBayreuth.getTotalMoneyEarned());



    }



}
