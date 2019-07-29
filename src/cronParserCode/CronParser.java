package cronParserCode;

import java.util.ArrayList;

public class CronParser {


    private ArrayList<Unit> cronExpressions;


    public CronParser(String cronExpression) {

        cronExpressions = new ArrayList<>();
    }

    public String processExpression(String cronExpression) {


        String expressions[] = cronExpression.split(" ");




        return null;

    }

    public void outputExpressions() {

        System.out.println("***");

        for (int i = 0; i < cronExpressions.size(); i++) {

            System.out.println(cronExpressions.get(i));

        }
        System.out.println("Conmmand: ");

        System.out.println("***");
    }


}
