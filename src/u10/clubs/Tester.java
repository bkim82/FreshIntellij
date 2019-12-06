package u10.clubs;

public class Tester {
    public static void main(String[] args) {
        Club c = new Club("Robotics", "DeFalco", Club.AFTERNOON);
        Student s1 = new Student ("Ciccarelli", "Leo", "ATCS", 2022);
        Student s2 = new Student ("Kim", "Brandon");
        Student s3 = new Student ("Kalish", "Chris", "ATCS", 2022);
        Student s4 = new Student ("Malysa", "Mark", "ATCS", 2022);

        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);
        c.addStudent(s4);

        c.removeStudent("Kalish", "Chris");
        // c.removeStudent(s3);

        System.out.println(c);
    }
}