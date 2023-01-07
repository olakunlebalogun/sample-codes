package read.write.excel.enumeration;

public class TrySize {
    public static void main(String[] args) {
        Size mySize = Size.X_SMALL;

        switch (mySize) {
            case LARGE: {
                System.out.println("This is my size right here!");
                break;
            }

            case MEDIUM: {
                System.out.println("This is the medium size and that is not mine");
                break;
            }

            case SMALL : {
                System.out.println("This is for young kids...");
                break;
            }
            default: {
                System.out.println("this is absolutely wrong, i am not a kid");
                break;
            }

        }


//        if (mySize == Size.LARGE) {
//            System.out.println("This is my size right here!");
//        } else if (mySize == Size.MEDIUM) {
//            System.out.println("This is the medium size and that is not mine");
//        } else if (mySize == Size.SMALL) {
//            System.out.println("This is for young kids...");
//        }
//        else {
//            System.out.println("this is absolutely wrong, i am not a kid");
//        }
    }
}
