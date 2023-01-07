package read.write.excel.collections;


public class Persons extends PersonAbs implements PersonInt{
    private String name;
    private Integer age;

    public Persons(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Persons(){}

    public void talk(){
        System.out.println("Make a cup of coffee for your head");
    }

    @Override
    public void walk() {
        System.out.println("Just walk bitch!");
    }

    @Override
    public void dance() {

    }

    public Persons(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void greet() {
        System.out.println("This class takes greeting from the interface class");

    }

    @Override
    public void eat() {
        System.out.println("This is an interface class method called from the PersonInt");
    }


}
