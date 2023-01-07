package read.write.excel.moshexceptionclass;

import read.write.excel.enumeration.Size;

public class Main {
    public static void main(String[] args) {
//        ExceptionDemo.show();
        Size myShirt = Size.LARGE;

        switch (myShirt) {
            case LARGE:
                System.out.println("This is a large shirt");
            case SMALL:
                System.out.println("Stop wearing a small shirt");
            case MEDIUM:
                System.out.println("THis is a medium shirt");
        }
    }


}
