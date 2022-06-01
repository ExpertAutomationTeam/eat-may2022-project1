package superkeyword;

public class Son extends Father {

    //super keyword

    public Son(){
        super(10);
    }

    public void higherEducation(){
        super.education();
        super.height = 10;
    }

}
