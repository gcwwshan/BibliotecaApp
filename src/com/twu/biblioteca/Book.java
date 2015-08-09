package com.twu.biblioteca;


public class Book {
    private String name;
    private String author;
    private String publishedYear;
    public final static int BookNameInfoIdex = 0;
    public final static int BookAuthorInfoIdex = 1;
    public final static int BookPublishedYearInfoIdex = 2;

    public void setBookInfo(String info, int i){
        switch(i){
            case BookNameInfoIdex:
                this.name = info;
                break;
            case BookAuthorInfoIdex:
                this.author = info;
                break;
            case BookPublishedYearInfoIdex:
                this.publishedYear = info;
                break;
        }
    }
    public String getBookInfo(int i){
        switch(i){
            case BookNameInfoIdex:
                return this.name;
            case BookAuthorInfoIdex:
                return this.author;
            case BookPublishedYearInfoIdex:
               return this.publishedYear;
        }
        return null;
    }
}
