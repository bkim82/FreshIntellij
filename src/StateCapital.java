public class StateCapital {

    private String state;
    private String capital;

    public StateCapital(java.lang.String state,
                        java.lang.String capital) {
        this.state = state;
        this.capital = capital;

    }

    @Override
    public boolean equals(Object obj) {
        StateCapital temp = (StateCapital) obj;
        return (temp.state == this.state);
    }

    public java.lang.String getState() {
        return this.state;
    }
    public java.lang.String getCapital() {
        return this.capital;
    }

}
