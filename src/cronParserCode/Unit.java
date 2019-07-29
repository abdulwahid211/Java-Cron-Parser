package cronParserCode;

public abstract class Unit {


    protected String expression;

    protected int min_rage = 0;

    protected int max_rage = 0;

    protected String outcome = "";


    Unit(String _expression) {
        this.expression = _expression;
    }

    //public setter and getter
    public String getExpression() {
        return expression;
    }

    public int getMinRage() {
        return min_rage;
    }

    public void setMinRage(int min_rage) {
        this.min_rage = min_rage;
    }

    public int getMaxRage() {
        return max_rage;
    }

    public void setMaxRage(int max_rage) {
        this.max_rage = max_rage;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public void assertCorrectOutput() {

        if (getExpression().contains("/")) {
            outputStepValues();
        } else if (getExpression().contains("-")) {
            outputRangeValues();
        } else if (getExpression().contains(",")) {
            outputListSeperator();
        } else {
            outputAnyValue();
        }


    }


    //set a output any value if its has *
    public void outputAnyValue() {

        for (int i = getMinRage(); i <= getMaxRage(); i++) {

            setOutcome(getOutcome() + " " + i);

        }

    }

    //set a output a value if it has list separator ,
    public void outputListSeperator() {

        String sperate[] = getExpression().split(",");

        setOutcome(sperate[0] + " " + sperate[1]);

    }

    //set a output a value if it has range -
    public void outputRangeValues() {

        String sperate[] = getExpression().split("-");

        int min = Integer.parseInt(sperate[0]);

        int max = Integer.parseInt(sperate[1]);

        for (int i = min; i <= max; i++) {

            setOutcome(getOutcome() + " " + i);

        }

    }

    //set a output a value if it has step /
    public void outputStepValues() {

        setOutcome(getExpression().replace("*/", ""));


    }

    //abstract toString method
    public abstract String toString();


}
