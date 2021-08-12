package com.company;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;  // Import the Scanner class

/**
 * The InteractiveScannerClass demonstrates the interactive part of the project
 * The code will interact with the user in multiple ways -- asking for their input
 * And then based on their input, will either ask more questions, and/or trigger
 * the next part of the project: domain search
 */
public class InteractiveScannerClass {
    /**
     * Constructor Method:
     *  will trigger introductionScript() method (which prompts some lines to terminal)
     *  then will trigger the search() method (which will trigger the search online based on user input)
     *
     * @throws IOException
     * @throws URISyntaxException
     */
    public InteractiveScannerClass() throws IOException, URISyntaxException {
        introductionScript();
        search();
    }

    /**
     * introductionScript() Method:
     *  displays introduction to user on terminal
     */
    public void introductionScript() {
        System.out.println("Welcome!");
        System.out.println("Before (virtually) meeting me, let's play some music!");
        System.out.println("Would you like to listen to my music or your own");
    }

    /**
     * search() Method:
     *  utilizes scanner class to have interactivity with user
     *  first asks user if they would like to listen to my (rabail's) music or their own
     *      if they choose rabail: it will create a YoutubeSearchJava object with rabail's fav playlists on youtube
     *      if they choose themselves:
     *          it asks user what genre, artist, region, etc.
     *          then, it will createa a YoutubeSearchJava object with whatever input they inputted
     * @throws IOException
     * @throws URISyntaxException
     */
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
