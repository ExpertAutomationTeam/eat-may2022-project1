package datatype.primitive;

class Variables {
    public static void main(String[] args){

        //primitive data type
        //data type: variableType variableName = variableValue;
            //numbers
                //wholes numbers
                byte b = 127;//1 byte
                short s = 1234;//2 bytes
                int x = 123440;//4 bytes
                long l = 23416624352342L;//8 bytes

                //fractions
                float f = 1.62547284F;//4 bytes
                double y = 10.5;//8 bytes

            //characters
            char c = '1';//2 bytes

            //boolean
            boolean boo = false;//1 bit (1/8 byte)

        //single variable declaration
        int i;

        //multiple variable declaration
        double num1, num2, num3, num4, num5;

        //variable assignment
        i = 20;

        char ch = 't';
        System.out.println(ch);
        //variable reassignment
        ch = '*';
        System.out.println(ch);

        //final variable: a final variable cannot be reassigned
        final int height = 9;

        //strong names: names that meaning refers to the variable's job
        int age = 25;
        String name =  "john";

    }
}
