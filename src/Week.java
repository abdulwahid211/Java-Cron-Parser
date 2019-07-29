public class Week extends Unit {

    public Week(String _expression) {
        super(_expression);

        setMinRage(1);
        setMaxRage(7);
        assertCorrectOutput();

    }

    @Override
    public String toString() {
        return "Day of Week: " + getOutcome();
    }





}
