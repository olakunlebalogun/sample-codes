package read.write.excel.enumeration;

public enum JacketSize {
    small(36),
    medium(40),
    large(44),
    extra_large(48),
    extra_extra_large(52);


    // Constructor
    JacketSize(int chestSize) {
        this.chestSize = chestSize;
    }

    // Method to return the chest size for the current jacket size
    public int chestSize() {
        return chestSize;
    }

    @Override
    public String toString() {
        switch(this) {
            case small:
                return "S";
            case medium:
                return "M";
            case large:
                return "L";
            case extra_large:
                return "XL";
            default:
                return "XXL";
        }
    }
    private int chestSize;
}
