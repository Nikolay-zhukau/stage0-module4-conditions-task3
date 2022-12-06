package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if(salary<=10000 && salary!=0 && salary >0){
            float convertSalary = salary;
            float taxes = convertSalary/100 *15;
            convertSalary = convertSalary-taxes;
            System.out.println(convertSalary);
        }
        if (salary>10000 && salary<=20000){
            float convertSalary = salary;
            float taxes = convertSalary/100 *18;
            convertSalary = convertSalary-taxes;
            System.out.println(convertSalary);
        }
        if (salary>20000){
            float convertSalary = salary;
            float taxes = convertSalary/100 *20;
            convertSalary = convertSalary-taxes;
            System.out.println(convertSalary);
        }
        if (salary<=0){
            System.out.println("wrong input!");
        }
    }
}
