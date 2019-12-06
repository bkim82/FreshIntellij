import com.sun.xml.internal.ws.util.StringUtils;

import javax.swing.*;

public class StateCapitalQuiz {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        int correct = 0;
        int tries = 0;

        String[] possibleValues = {"states_all.txt", "states_central.txt", "states_east.txt","states_small.txt", "states_south.txt", "states_west.txt"};
        String response = (String) JOptionPane.showInputDialog(null,
                "Select a file", "Input",
                JOptionPane.QUESTION_MESSAGE, null, possibleValues,
                possibleValues[0]);
        if (response == null) {
            JOptionPane.showMessageDialog(null, "You have exited.");
            System.exit(0);
        }

        StateCapitalList a = new StateCapitalList(response);

        while (a.statesRemaining() != 0) {
            StateCapital state = a.getRandomState();
            String input = StringUtils.capitalize(JOptionPane.showInputDialog("What is the capital of " + state.getState() + "?"));
            if (input == null) {
                break;
            }
            else if (input.equals(state.getCapital())) {
                a.removeState(state);
                JOptionPane.showMessageDialog(null, "Correct!");
                correct++;

            }

            else {
                JOptionPane.showMessageDialog(null, "Incorrect! The capital is " + state.getCapital());
            }
            tries++;
        }
        JOptionPane.showMessageDialog(null, "You got " + correct + " correct out of " + tries + " tries.");
    }
}
