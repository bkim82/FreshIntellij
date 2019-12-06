package u10.Classwork;

import javax.swing.*;

public class Day9_DialogBoxes {
    public static void main(String[] args) {
        String[] possibleValues = {"Friend", "Foe"};

        String response = (String) JOptionPane.showInputDialog(null,
                "Are you a friend or a foe?", "Input",
                JOptionPane.QUESTION_MESSAGE, null, possibleValues,
                possibleValues[0]);

        String name = (String) JOptionPane.showInputDialog("What is " +
                "your name?");

        System.out.println(response);
        System.out.println(name);


        if (name != null) {
            JOptionPane.showMessageDialog(null, "Hi, " + name);
        }
        else {
            JOptionPane.showMessageDialog(null, "Enter a name!");
        }
    }
}
