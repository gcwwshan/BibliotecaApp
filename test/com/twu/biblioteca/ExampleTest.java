package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    String usersPath="/Users/btian/Downloads/twu-biblioteca-tianbiao-master/res/users.txt";
    String booksPath="/Users/btian/Downloads/twu-biblioteca-tianbiao-master/res/books.txt";
    String moviesPath="/Users/btian/Downloads/twu-biblioteca-tianbiao-master/res/movies.txt";

    @Test
    public void test_welcomeMessage(){
        assertEquals(0,BibliotecaApp.welcomeMessage());
    }

    @Test
    public void test_readUserTextFile() throws Exception {
        assertEquals(true,BibliotecaApp.readUserTextFile(usersPath));
    }

    @Test
    public void test_login(){
        BibliotecaApp.readUserTextFile(usersPath);
        String userInfo="000-0001123456";
        assertEquals(true,BibliotecaApp.login(userInfo));
    }

    @Test
    public void test_readBookTextFile() throws Exception {
        assertEquals(true,BibliotecaApp.readBookTextFile(booksPath));
    }

    @Test
    public void test_readMovieTextFile() throws Exception {
        assertEquals(true,BibliotecaApp.readMovieTextFile(moviesPath));
    }

    @Test
    public void test_showBookList(){;
        BibliotecaApp.readBookTextFile(booksPath);
        int i = BibliotecaApp.showBookList();
        assertEquals(3,i);
    }

    @Test
    public void test_showMovieList(){
        BibliotecaApp.readMovieTextFile(moviesPath);
        int i = BibliotecaApp.showMovieList();
        assertEquals(4, i);
    }

    @Test
    public void test_checkOut_books(){
        BibliotecaApp.readBookTextFile(booksPath);
        int i = BibliotecaApp.checkOut("agogogog2011");
        assertEquals(2, i);
    }

    @Test
    public void test_returnBook(){
        BibliotecaApp.readBookTextFile(booksPath);
        BibliotecaApp.checkOut("agogogog2011");
        int i = BibliotecaApp.returnBook("agogogog2011");
        assertEquals(3, i);
    }

    @Test
    public void test_checkOut_movies(){
        BibliotecaApp.readMovieTextFile(moviesPath);
        int i = BibliotecaApp.checkOutMovie("ma2001xiaoming6.0");
        assertEquals(3, i);
    }

}
