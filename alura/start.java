package alura;
import alura.models.movie;

public class start{
    public static void main(String[] args){
        movie firstMovie = new movie();
        firstMovie.setName("Tangled");
        firstMovie.setRelease(2010);
        firstMovie.setRuntime (100);
        firstMovie.setIncluded(true);
        
        firstMovie.showMStats();

        firstMovie.rate(8);
        firstMovie.rate(5);
        firstMovie.rate(3);

        System.out.println("Média das avaliações: " + firstMovie.medRating());
    }
}