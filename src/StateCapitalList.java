import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;

public class StateCapitalList {

    private ArrayList<StateCapital> states = new ArrayList<>();

    public StateCapitalList(String filename) throws java.io.FileNotFoundException {
        Scanner in = new Scanner(new FileReader(filename));

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] state = line.split(":");
            StateCapital a = new StateCapital(state[0], state[1]);
            states.add(a);

        }
    }

    public StateCapital getRandomState() {
        int num = (int)(Math.random() * states.size() - 1);
        return states.get(num);
    }

    public int statesRemaining() {
        return states.size();

    }
    public void removeState(StateCapital i) {

        states.remove(i);
    }
}
