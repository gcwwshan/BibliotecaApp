package com.twu.biblioteca;

/**
 * Created by Administrator on 2015/5/31.
 */

import java.awt.*;

public class demo {

    public static void main(String agrs[]){

        Frame nw= new Frame("Login");

        Panel nn=new Panel();

        Label a1=new Label("Name   ");

        Label a2=new Label("Password ");

        TextField b1=new TextField("name     ");

        TextField b2=new TextField("password");

        Button n1=new Button("Login");

        nn.add(a1);

        nn.add(b1);

        nn.add(a2);

        nn.add(b2);

        nn.add(n1);

        nw.add(nn);

        nw.setBackground(Color.white);

        nw.setSize(300, 300);

        nw.setVisible(true);



    }

}