package read.write.excel.collections.TryComparable;

import java.util.Comparator;

public class Person  implements Comparable {
    private Integer personId;
    private String name;
    private boolean isBoy;

    public Person() {

    }

    public Person(int id, String name) {
        this.personId = id;
        this.name = name;
    }

    public Person (String myName) {
        this.name = myName;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBoy() {
        return isBoy;
    }

    public void setBoy(boolean boy) {
        isBoy = boy;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", isBoy=" + isBoy +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
