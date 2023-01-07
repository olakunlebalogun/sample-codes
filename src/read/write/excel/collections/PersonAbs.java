package read.write.excel.collections;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonAbs {
    private String color;
    private List<String> familyMembers = new ArrayList<>();


    public PersonAbs ()  {

    }

    public PersonAbs (String color)  {
        this.color = color;
    }
    public String getFirstFamilyGreet(){
        return "Hello, " + familyMembers.get(0);
    }

    public abstract void walk();
    public abstract void dance();
}
