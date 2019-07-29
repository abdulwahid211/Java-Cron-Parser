package cronParserCode;

public class Month extends Unit {

    public Month(String _expression) {
        super(_expression);

        setMinRage(1);
        setMaxRage(12);
        assertCorrectOutput();

    }

    @Override
    public String toString() {
        return "Month: " + getOutcome();
    }


}
