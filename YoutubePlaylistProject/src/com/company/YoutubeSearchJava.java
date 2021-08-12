package com.company;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * The YoutubeSearchJava class demonstrates taking in an input and then using that input
 * to search a specified url on the web.
 * It will launch a url online that will display a number of playlists on youtube for the
 * user to listen to whilst they go through my (rabail's website).
 * This class demonstrates code interacting with users and launching search engines.
 */
public class YoutubeSearchJava {
    /**
     * Final variables demonstrate the properties of the URL that will remain constant
     */
    public final String  YOUTUBE_SEACH_URL = "https://www.youtube.com/results?search_query=";
    public final String END_URL = "+music+playlist";

    /**
     * Constructor Method:
     *  Takes in a genre (from the IneractiveScannerClass), and will convert such input to the appropriate
     *  type (to be used in a URL) in the convertToCompatibleSearch method
     *  Then, it will create said appropriate URL
     *  Lastly, it will prompt the launchUrl method and display the url after triggering the search engine
     *
     * @param givenGenre
     * @throws IOException
     * @throws URISyntaxException
     */
    public YoutubeSearchJava(String givenGenre) throws IOException, URISyntaxException {
        String genre = convertToCompatibleSearch(givenGenre);
        String searchURL = YOUTUBE_SEACH_URL + genre + END_URL;
        launchUrl(searchURL);
    }

    /**
     * convertToCompatibleSearch Method:
     *  the purpose of this method is to take in a string and convert it to the appropriate string
     *  so that it can be used in a url.
     *  It will scan through the string and replace any white spaces with '+'
     * @param givenGenre
     * @return
     */
    public String convertToCompatibleSearch(String givenGenre) {
        String fullSearch = givenGenre;
        for(int i=0; i<givenGenre.length(); i++ ) {
            if(givenGenre.charAt(i) == ' ' ) {
                fullSearch = fullSearch.substring(0, i) + "+" + fullSearch.substring(i+1);
            }
        }
        return fullSearch;
    }

    /**
     * launchUrl Method:
     *  Utilizes Desktop class to trigger the desktop and browse said object with our url.
     *  The ouput is a youtube search of playlists the user would like to listen to.
     * @param searchUrl
     * @throws URISyntaxException
     * @throws IOException
     */
    public void launchUrl(String searchUrl) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI(searchUrl));
    }
}
