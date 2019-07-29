package cronParserCode;

public class DaysOfMonth extends Unit {

    public DaysOfMonth(String _expression) {
        super(_expression);

        setMinRage(1);
        setMaxRage(31);

        if (_expression.length() > 0) {
            assertCorrectOutput();
        } else {
            throw new java.lang.RuntimeException("No expression input for Day");
        }

    }

    @Override
    public String toString() {
        return "Days: " + getOutcome();
    }


}
