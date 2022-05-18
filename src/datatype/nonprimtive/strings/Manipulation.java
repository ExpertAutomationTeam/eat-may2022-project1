package datatype.nonprimtive.strings;

public class Manipulation {

    public static void main(String[] args) {

        //string manipulation
        String str = "     Hello World     ";

        System.out.println(str);

        //System.out.println(str.replace(" World", ""));

        //System.out.println(str.trim());

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str.indexOf("World"));

    }
}
