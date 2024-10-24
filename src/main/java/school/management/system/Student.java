package school.management.system;

/**
 *  this class keeps tracks of students, name, fees, id, fees paid and fees
 */

public class Student {
    private int id;
    private String name;
    private int age;
    private int grade;
    private int feesTotal;
    private int feesPaid;

    /**
     * the constructor public Student creat a  new student by initializing.
     * Fees = 30,000€ per year
     * Fees paid initially = 0€
     * @param id  id for student : unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */

    public Student (int id, String name, int age, int grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.feesTotal = 30000;
        this.feesPaid = 0;

    }

    //student name will not be altered and id

    public void  setGrade(int grade) {
        this.grade = grade;
    }







}
