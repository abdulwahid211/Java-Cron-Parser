public class Minutes extends Unit {


    public Minutes(String _expression) {
        super(_expression);

        setMinRage(0);
        setMaxRage(60);
        assertCorrectOutput();


    }


    @Override
    public void outputStepValues() {

        int step = Integer.parseInt(getExpression().trim().replace("*/", ""));

        int result = 0;

        for (int i = 0; result < 60; i++) {

            setOutcome(getOutcome() + " " + result);

            result = result + step;

        }


    }

    @Override
    public String toString() {
        return "Minutes: " + getOutcome();
    }
}
