package com.example.samriddhi.facts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by samriddhi on 6/2/15.
 */
public class Colors {

    public String[] colors={
            "",
            "",
            ""

    };


    public int getColor() {

        String color="";

        Random randomGenerator = new Random();
        int randomNo = randomGenerator.nextInt(3);

        color=colors[randomNo];
        int colorInt= Color.parseColor(color);

        return colorInt;
    }
}
