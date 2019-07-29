package cronParserCode;

public class Week extends Unit {

    public Week(String _expression) {
        super(_expression);

        if (_expression.length() > 0) {
            assertCorrectOutput();
            setMinRage(1);
            setMaxRage(7);
        } else {
            throw new java.lang.RuntimeException("No expression input for Week");
        }

    }

    @Override
    public String toString() {
        return "Day of Week: " + getOutcome();
    }





}
