package com.twu.biblioteca;


public class Movie {
    private String name;
    private String year;
    private String director;
    private String movieRating;
    public final static int MovieNameInfoIdex = 0;
    public final static int MovieYearInfoIdex = 1;
    public final static int MovieDirectorInfoIdex = 2;
    public final static int MovieMovieRatingInfoIdex = 3;

    public void setMovieInfo(String info, int i){
        switch(i){
            case MovieNameInfoIdex:
                this.name = info;
                break;
            case MovieYearInfoIdex:
                this.year = info;
                break;
            case MovieDirectorInfoIdex:
                this.director = info;
            case MovieMovieRatingInfoIdex:
                this.movieRating = info;
                break;
        }
    }
    public String getMovieInfo(int i){
        switch(i){
            case MovieNameInfoIdex:
                return this.name;
            case MovieYearInfoIdex:
                return this.year;
            case MovieDirectorInfoIdex:
                return this.director;
            case MovieMovieRatingInfoIdex:
                return this.movieRating;
        }
        return null;
    }
}
