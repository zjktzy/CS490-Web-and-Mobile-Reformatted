package com.example.earthquake;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class QueryUtils {
    /**
     * Tag for the log messages
     */
    private static final String LOG_TAG = QueryUtils.class.getSimpleName();

    /**
     * Create a private constructor because no one should ever create a {@link QueryUtils} object.
     * This class is only meant to hold static variables and methods, which can be accessed
     * directly from the class name QueryUtils (and an object instance of QueryUtils is not needed).
     */
    private QueryUtils() {
    }

    /**
     * Query the USGS dataset and return a list of {@link Earthquake} objects.
     */
    public static List<Earthquake> fetchEarthquakeData2(String requestUrl) throws IOException, JSONException {
        //  URL object to store the url for a given string
        URL url = null;
        // A string to store the response obtained from rest call in the form of string
        String jsonResponse = "";

        //TODO: 1. Create a URL from the requestUrl string and make a GET request to it

        // initialize connection object, set GET request method, and connect
        url = new URL(requestUrl);
        HttpURLConnection connection;
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        //TODO: 2. Read from the Url Connection and store it as a string(jsonResponse)

        // if successful, we create an input stream, store the response, and disconnect
        if (connection.getResponseCode() == 200){
            StringBuilder strBuilder = new StringBuilder();
            BufferedReader iStream = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = iStream.readLine()) != null) {
                strBuilder.append(inputLine);
            }
            iStream.close();
            jsonResponse = strBuilder.toString();

            connection.disconnect();
        }
        else{
            System.out.print("Connection Failed");
        }

        /*TODO: 3. Parse the jsonResponse string obtained in step 2 above into JSONObject to extract the values of
                        "mag","place","time","url"for every earth quake and create corresponding Earthquake objects with them
                        Add each earthquake object to the list(earthquakes) and return it.*/

        // iterate through response adding each quake to "earthquakes"
        List<Earthquake> earthquakes = new ArrayList<>();
        JSONObject jsonObj = new JSONObject(jsonResponse);
        JSONArray arrayJSONObj = jsonObj.getJSONArray("features");

        for (int i = 0; i < arrayJSONObj.length(); i++){
            JSONObject responseJSON = arrayJSONObj.getJSONObject(i);
            JSONObject quake = responseJSON.getJSONObject("properties");
            double mag = quake.getDouble("mag");
            String place = quake.getString("place");
            long time = quake.getLong("time");
            String urlStr = quake.getString("url");
            earthquakes.add(new Earthquake(mag, place, time, urlStr));
        }

        // Return the list of earthquakes
        return earthquakes;
    }
}
