package breakcontinue;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 20 ; i++) {
            if(i > 5 && i < 15){
                continue;
            }
            System.out.println(i);
        }

    }
}
