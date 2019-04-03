
public class SalariedEmployee extends Employee {

    private double weeklySalary;


    void setWeeklySalary(double ws){
        weeklySalary = ws;
    }

    double getWeeklySalary(){
        return weeklySalary;
    }
    public String getFullName(){
        String fullName = getFirstName() + getLastName();
        return fullName;
    }
    @Override
    public String calculatePay(){
        String str = "";
        double totalPay = weeklySalary * 52;
        str = str + getFullName() + " makes $" + totalPay + " annually.";
        return str;
    }