package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month == 2){
            System.out.println("28");
        }
        if(month == 6){
            System.out.println("30");
        }
        if(month <=0 || month >12){
            System.out.println("wrong number!");
        }
    }
}
