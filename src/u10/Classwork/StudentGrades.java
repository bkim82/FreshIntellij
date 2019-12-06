package u10.Classwork;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;


public class StudentGrades {

    public static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (int n : list) {
            sum += n;
        }

        return sum/ list.size();
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new FileReader("grades.txt"));

        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] lineArray = line.split(":");
            String name = lineArray[0];
            int grade = Integer.parseInt(lineArray[1]);

            if (!map.containsKey(name)) {
                map.put(name, new ArrayList<Integer>());
            }
            ArrayList<Integer> gradeList = map.get(name);
            gradeList.add(grade);
        }

        for (String student: map.keySet()) {
            System.out.println(student + ":" + average(map.get(student)));
        }
    }
}
