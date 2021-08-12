package com.company;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class YoutubeSearchJava {
    public String YOUTUBE_SEACH_URL = "https://www.youtube.com/results?search_query=";
    public String END_URL = "+music+playlist";
    public YoutubeSearchJava(String givenGenre) throws IOException, URISyntaxException {
        String genre = convertToCompatibleSearch(givenGenre);
        String searchURL = YOUTUBE_SEACH_URL + genre + END_URL;
        launchUrl(searchURL);
    }
    public String convertToCompatibleSearch(String givenGenre) {
        String fullSearch = givenGenre;
        for(int i=0; i<givenGenre.length(); i++ ) {
            if(givenGenre.charAt(i) == ' ' ) {
                fullSearch = fullSearch.substring(0, i) + "+" + fullSearch.substring(i+1);
            }
        }
        return fullSearch;
    }
    public void launchUrl(String searchUrl) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI(searchUrl));
    }
}
