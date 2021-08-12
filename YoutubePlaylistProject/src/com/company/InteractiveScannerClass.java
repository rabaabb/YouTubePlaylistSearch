package com.company;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;  // Import the Scanner class

public class InteractiveScannerClass {
    public InteractiveScannerClass() throws IOException, URISyntaxException {
        introductionScript();
        search();

    }
    public void introductionScript() {
        System.out.println("Welcome!");
        System.out.println("Before (virtually) meeting me, let's play some music!");
        System.out.println("Would you like to listen to my music or your own");
    }

    public void search() throws IOException, URISyntaxException {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String choice = myObj.nextLine();  // Read user input

        if (choice.contains("my") || choice.contains("mine")) {
            System.out.println("Enter a genre, artist, song, region, or anything!");
            String input = myObj.nextLine();  // Read user input
            YoutubeSearchJava theirSearch = new YoutubeSearchJava(input);
        } else {
            YoutubeSearchJava mySearch = new YoutubeSearchJava("contemporary lofi beats");
        }
    }

}
