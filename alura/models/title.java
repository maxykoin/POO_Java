package alura.models;

public class title {
    private String name;
    private int release;
    private boolean included;
    private int runtime;
    private double rate;
    private int allRatings;
    private double sumRatings;

    // get atributes
    public int getAllRatings(){
        return allRatings;
    }

    public String getName() {
        return this.name;
    }
    
    public int getRelease() {
        return this.release;
    }

    public int getRuntime(){
        return this.runtime;
    }


    // set atributes
    public void setName(String name){
        this.name = name;
    }

    public void setRelease(int release){
        this.release = release;
    }

    public void setRate(int rate){ 
        this.rate = rate;
    }

    public void setIncluded(boolean included){ 
        this.included = included;
    }

    public void setRuntime(int runtime){
        this.runtime = runtime;
    }

    // methods
    public void showMStats(){
        System.out.println("Name: " + name);
        System.out.println("Year of release: " + release);
        System.out.println("Included in the plan: " + included);
    }

    public void rate(double grade){
        sumRatings += grade; 
        allRatings++;
    }

    public double medRating(){
        return sumRatings / allRatings;
    }
}
