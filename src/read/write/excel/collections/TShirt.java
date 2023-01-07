package read.write.excel.collections;

public class TShirt {
    private String colour;
    private int shirtSize;
    private String brand;
    private String material;

    public TShirt() {
    }

    public TShirt(String colour, int shirtSize, String brand, String material) {
        this.colour = colour;
        this.shirtSize = shirtSize;
        this.brand = brand;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(int shirtSize) {
        this.shirtSize = shirtSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "colour='" + colour + '\'' +
                ", shirtSize=" + shirtSize +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
