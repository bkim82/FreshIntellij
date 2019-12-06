package u10.Classwork;

import java.util.ArrayList;

public class Day06_ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> list = new java.util.ArrayList<>();

        list.add("Chris");
        list.add(0, "Ryan");
        list.add("Tomas");

        for (int i= 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
