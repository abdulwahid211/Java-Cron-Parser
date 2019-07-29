package cronParserCode;

public class Hours extends Unit {


    public Hours(String _expression) {
        super(_expression);

        setMinRage(0);
        setMaxRage(23);
        assertCorrectOutput();

    }

    @Override
    public String toString() {
        return "Hours: " + getOutcome();
    }


}
