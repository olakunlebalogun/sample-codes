package read.write.excel.generics;

public class Pair <T>{
//    class properties
    private T first;
    private T second;
    // Constructors
    public Pair() {
        first = null; second = null;
    }
    public Pair(T first, T second) {
        this.first = first; this.second = second;
    }

//    class instance Methods getters and setters

    public T getFirst() { return first; }
    public T getSecond() { return second; }
    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }
}
