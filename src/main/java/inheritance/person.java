package inheritance;

import javax.crypto.spec.PSource;

public class person {
    private String name;
    private int age;
    private String gender;

    public person () {
        System.out.println("In Person defualt constructor");
    }

    public person (String name ) {
        System.out.println("in person 2 second constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
