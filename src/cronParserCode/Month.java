package cronParserCode;

public class Month extends Unit {

    public Month(String _expression) {
        super(_expression);

        if (_expression.length() > 0) {
            assertCorrectOutput();
            setMinRage(1);
            setMaxRage(12);
        } else {
            throw new java.lang.RuntimeException("No expression input for Month");
        }

    }

    @Override
    public String toString() {
        return "Month: " + getOutcome();
    }


}
