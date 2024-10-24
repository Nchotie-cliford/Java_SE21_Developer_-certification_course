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

    /** this constructor
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

    /** this methode
     * used to update the grade of the student.
     * @param grade new grade of the student.
     */

    public void  setGrade(int grade) {
        this.grade = grade;
    }

    /**this methode
     * example with installment payment
     * keep adding the fees to paid
     * Add the fees paid, that the school receive the fees
     * @param fees fees that the student paide
     */

    public void updateFeesPaid(int fees) {
        feesPaid+= fees;
    }

    /**
     *  will return the student attributes
     * @return
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getFeesPaid() {
        return feesPaid;
    }



}
