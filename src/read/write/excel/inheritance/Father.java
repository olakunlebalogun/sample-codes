package src.read.write.excel.inheritance;

public class Father {

    private String firstName;
    private String lastName;

    public Father(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Father(String lastName){
        this.lastName = lastName;
    }

    public String washCars() {
        return "Wash the family RV";
    }

    public String repairBrokenThings() {
        return "Repair all broken furniture";
    }
}
