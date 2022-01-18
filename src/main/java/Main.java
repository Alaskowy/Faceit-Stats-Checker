import Data.Match;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    private static HttpURLConnection connection;
    private static final String API_KEY_FACEIT = "Bearer <api_key>";

    public static void main(String[] args) {

        BufferedReader reader;
        String data;
        StringBuffer response = new StringBuffer();
        ObjectMapper mapper = new ObjectMapper();
        Scanner scan = new Scanner(System.in);
        String matchID = scan.nextLine();


        try {
            URL url = new URL("https://open.faceit.com/data/v4/matches/" + matchID);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Authorization", API_KEY_FACEIT);

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((data= reader.readLine()) != null){
                    response.append(data);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((data= reader.readLine()) != null){
                    response.append(data);
                }
                reader.close();
            }

           String result = response.toString();
            Match match = mapper.readValue(result, Match.class);
            System.out.println(match.getTeams().getFaction1().getRoster().get(0).getNickname() + " " +
                    match.getTeams().getFaction1().getRoster().get(1).getNickname() + " " +
                    match.getTeams().getFaction1().getRoster().get(2).getNickname() + " " +
                    match.getTeams().getFaction1().getRoster().get(3).getNickname() + " " +
                    match.getTeams().getFaction1().getRoster().get(4).getNickname() + " " +
                    " vs " +
                    match.getTeams().getFaction2().getRoster().get(0).getNickname() + " " +
                    match.getTeams().getFaction2().getRoster().get(1).getNickname() + " " +
                    match.getTeams().getFaction2().getRoster().get(2).getNickname() + " " +
                    match.getTeams().getFaction2().getRoster().get(3).getNickname() + " " +
                    match.getTeams().getFaction2().getRoster().get(4).getNickname());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            connection.disconnect();
        }
    }
}
