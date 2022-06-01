package oops.encapsulation;

public class Movie {

    private String title;
    private int duration;

    //setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    //getter
    public String getTitle(){
        return title;
    }

    public int getDuration(){
        return duration;
    }
}
