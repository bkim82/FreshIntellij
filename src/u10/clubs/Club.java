package u10.clubs;

import java.util.ArrayList;

public class Club {
    public static final int MORNING = 0;
    public static final int AFTERNOON = 1;
    public static final String[] TYPES = {"Morning", "Afternoon"};

    private String name;
    private String advisor;
    private int type;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Club(String name, String advisor, int type) {
        this.name = name;
        this.advisor = advisor;
        this.type = type;
    }

    public void addStudent (Student s) {
        studentList.add(s);
    }

    public void removeStudent (Student s) {
        studentList.remove(s);
    }

    public void removeStudent (String lastName, String firstName) {
        Student s = new Student (lastName, firstName);
        studentList.remove(s);
    }

    public String toString() {
        String s = name + " (" + TYPES[type] + "): " + advisor;

//        for (String name :studentList)
        for (int i=0; i<studentList.size(); i++) {
            s += "\n\t" + studentList.get(i);
        }
        return s;
    }
}