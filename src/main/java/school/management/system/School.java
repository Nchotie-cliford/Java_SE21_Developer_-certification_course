package school.management.system;


import java.util.List;

/**
 * the school can have many teachers, many students
 * ArrayList; implement student and teacher using ArrayList, since we can have many teachers and student with no fixed value
 */
public class School {
    private List<Teacher> teachers;
    private List <Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    /**
     * new school object created
     * @param teachers list of teachers in the school
     * @param students list of student in thr school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }


    /**
     *
     * @return the list of teachers in the school
     */


    public List<Teacher> getTeachers() {
        return teachers;
    }


    /**
     * add teacher to the school
     * @param teacher
     */
    public void AddTeachers(Teacher teacher) {
       teachers.add(teacher);
    }

    /**
     *
     * @return list of student in school
     */

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a student to the school
     * @param student
     */


    public void AddStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earn by the school.
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * add totally money spent by the school
     * @param MoneyEarned money that suppose to be added
     */

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update money spent by school * sallary of teacher only
     * @param MoneySpent to pay teachers
     */

    public void updateTotalMoneySpent(int MoneySpent) {
         totalMoneyEarned -= MoneySpent;
    }







}
