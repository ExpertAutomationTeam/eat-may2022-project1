package datatype.nonprimtive.arrays;

class Array {
    public static void main(String[] args) {

        //syntax: variableType[] arrayName = {value1, value2, value3 ... }
        int[] array1 = {0, 6, 5, 1, 4};

        System.out.println(array1[2]);

        //declare array
        int[] array2 = new int[5];

        //assign array
        //array2[0] = 4;
        array2[1] = 3;
        array2[2] = 5;
        array2[3] = 1;
        array2[4] = 7;

        System.out.println(array2[4]);

        System.out.println(array2[0]);
        //non assigned indexes in java would be given a value of 0

    }
}
