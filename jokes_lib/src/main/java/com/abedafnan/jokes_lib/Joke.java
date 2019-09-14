package com.abedafnan.jokes_lib;

import java.util.ArrayList;

public class Joke {
    private ArrayList<String> jokesList;
    private static int counter = 0;

    public Joke() {
        jokesList = new ArrayList<>();
        jokesList.add("There are 10 kinds of people, those that understand binary and those that don\'t");
        jokesList.add("Q: How do you know if your code is good?\n" + "A: Take a byte.");
        jokesList.add("Q: Why do Java programmers wear glasses?\n" + "A: Because they don't C#!");
        jokesList.add("A programmer puts two glasses on his bedside table before going to sleep. A full one, in case he gets thirsty, and an empty one, in case he doesn’t");
        jokesList.add("Error 404: joke not found");
    }

    public String getJoke() {
        if (counter == jokesList.size()) {
            counter = 0;
        }
        String joke =  jokesList.get(counter);
        counter++;

        return joke;
    }
}
