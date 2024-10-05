package inheritance;

public class Employee extends person {

    private String employeeId;
    private String title;

    public Employee() {
        super( "cliford");
        System.out.println(" in Employee Constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
