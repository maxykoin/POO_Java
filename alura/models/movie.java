package alura.models;

public class movie extends title{
    private String director;

    public void setDirector(String director){
        this.director = director;
    }

    public String getDirector(){
        return this.director;
    }
}
