package cronParserCode;

public class Hours extends Unit {


    public Hours(String _expression) {
        super(_expression);

        if (_expression.length() > 0) {
            assertCorrectOutput();
            setMinRage(0);
            setMaxRage(23);
        } else {
            throw new java.lang.RuntimeException("No expression input for Hour");
        }

    }

    @Override
    public String toString() {
        return "Hours: " + getOutcome();
    }




}
