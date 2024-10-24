package school.management.system;


/**
 * this class is responsible for keeping the track of the teacher name , id, salary, email, etc
 */



public class Teacher {
    private int Id ;
    private String Name ;
    private String Email ;
    private int  salary;

    /**
     *Constructor
     * Used to creat a new object for teacher
     * @param Id id for teacher
     * @param Name name of the teacher
     * @param salary salary of the teacher
     */

    public Teacher(int Id, String Name, int salary) {
        this.Id = Id;
        this.Name = Name;
        this.salary = salary;
    }


    /**
     *
     * @return return the id of teacher
     */

    public int getId() {
        return Id;
    }

    /**
     *
     * @return return name of teacher
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @return return email of teacher
     */

    public String getEmail() {
        return Email;
    }

    /**
     *
     * @return salary og teacher
     */
    public int getSalary() {
        return salary;
    }

    /**
     *
     * @param salary upsate salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
