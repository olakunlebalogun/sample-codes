package src.read.write.excel.inheritance;

public class Son extends Father {


    private String sonFirstName;
    public Son(String firstName, String lastName) {
        super(lastName);
        this.sonFirstName = firstName;
    }


    @Override
    public String washCars() {
        return super.washCars();
    }

    @Override
    public String repairBrokenThings() {
//        return super.repairBrokenThings();
        return "The son is repairing broken things in the house";
    }
}
