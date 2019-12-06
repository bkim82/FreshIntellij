package u10.clubs;

import jdk.internal.cmm.SystemResourcePressureImpl;

public class Student {
    private String lastName = null;
    private String firstName = null;
    private String academy = null;
    private int classYear = -1;

    public Student(String lastName, String firstName, String academy, int classYear) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.academy = academy;
        this.classYear = classYear;
    }

    public Student(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String toString() {
        if (academy == null) {
            return lastName + ", " + firstName;
        }
        else {
            return lastName + ", " + firstName + " - " + academy + " " + classYear;
        }
    }

    public boolean equals (Object o) {
        boolean result = super.equals(o);
        System.out.println("Comparing [" + this + "] and [" + o + "] = " + result);

        return result;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }
}