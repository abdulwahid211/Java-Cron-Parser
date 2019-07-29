package cronParserCode;

import java.util.ArrayList;

public class CronParser {


    private ArrayList<Unit> unitExpressions;

    private String command ="";

    private String expressions[];


    public CronParser(String cronExpression) {

        expressions = cronExpression.split(" ");

        unitExpressions = new ArrayList<>();
    }

    public void runProcess() {


        for (int i = 0; i < expressions.length; i++) {


            if (i == 0) {
                // Minutes
                unitExpressions.add(new Minutes(expressions[i]));
            } else if (i == 1) {
                // Hours
                unitExpressions.add(new Hours(expressions[i]));
            } else if (i == 2) {
                // Days Of Month
                unitExpressions.add(new DaysOfMonth(expressions[i]));
            } else if (i == 3) {
                // Month
                unitExpressions.add(new Month(expressions[i]));
            } else if (i == 4) {
                // Week
                unitExpressions.add(new Week(expressions[i]));
            } else {
                command = expressions[i];
            }

        }

    }

    public void output() {

        System.out.println("***");

        for (int i = 0; i < unitExpressions.size(); i++) {

            System.out.println(unitExpressions.get(i));

        }
        System.out.println("Command: "+this.command);

        System.out.println("***");
    }


}
