package cronParserCode;

public class Minutes extends Unit {


    public Minutes(String _expression) {
        super(_expression);

        if (_expression.length() > 0) {
            assertCorrectOutput();
            setMinRage(0);
            setMaxRage(60);
        } else {
            throw new java.lang.RuntimeException("No expression input for Minute");
        }

    }


    @Override
    public void outputStepValues() {

        int step = Integer.parseInt(getExpression().replace("*/", ""));

        setOutcome(getOutcome() + " " + 0);

        for (int i =0; step <= 60; i++) {

            setOutcome(getOutcome() + " " + step);

            step = step + step;

        }


    }

    @Override
    public String toString() {
        return "Minutes: " + getOutcome();
    }
}
