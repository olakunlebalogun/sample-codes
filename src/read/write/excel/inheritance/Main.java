package src.read.write.excel.inheritance;

public class Main {
    public static void main(String[] args) {
        Father myFather = new Father("Solomon", "Balogun");
        System.out.println(myFather.repairBrokenThings());

        Son niyi = new Son("Olaniyi", "Balogun");
        System.out.println(niyi.repairBrokenThings());
    }
}
