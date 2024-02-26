package alura.models;

public class series extends title{
    private int seasons;
    private int episodesPerSeason;
    private boolean airing;
    private int medMinutes;

    public void setSeasons(int seasons){
        this.seasons = seasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason){
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setAiring(boolean airing){
        this.airing = airing;
    }

    public void setMedMinutes(int medMinutes){
        this.medMinutes = medMinutes;
    }

    public int getSeasons(){
        return this.seasons;
    }

    public int getEpisodesPerSeason(){
        return this.episodesPerSeason;
    }

    public boolean getAiring(){
        return this.airing;
    }

    public int getMedMinutes(){
        return this.medMinutes;
    }

    public int getRuntime(){
        return seasons * episodesPerSeason * medMinutes;
    }
}
