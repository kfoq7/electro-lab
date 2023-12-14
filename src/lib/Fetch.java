package lib;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;

public class Fetch<T> {

    private final String API_URL = "http://localhost:8000/api";
    private String endpoint;
    private ArrayList<T> objectList;
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;
    private JSONParser<T> jsonParser;

    public Fetch(Class<T> objectType) {
        client = HttpClient.newBuilder().build();
        jsonParser = new JSONParser<>(objectType);
    }

    public Fetch(String endpoint, Class<T> objectType) {
        this.endpoint = endpoint;

        client = HttpClient.newBuilder().build();
        jsonParser = new JSONParser<>(objectType);
    }

    public ArrayList<T> get() {
        try {
            setGetRequest();
            System.out.println(request.headers());
            response = sendRequest();
//            response.request
            System.out.println(response.request());

            objectList = jsonParser.parserList(response.body());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return objectList;
    }

    public void post(String stringify) {
        try {
            setPostRequest(stringify);
            response = sendRequest();
            System.out.println("Response code: " + response.statusCode());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void post(T object) {
        String jsonString;

        try {
            jsonString = jsonParser.stringify(object);
            setPostRequest(jsonString);
            response = sendRequest();
            System.out.println("Response code: " + response.statusCode());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private HttpResponse<String> sendRequest() throws Exception {
        return client.send(request, BodyHandlers.ofString());
    }

    private void setGetRequest() {
        request = HttpRequest.newBuilder()
                .headers("Accept", "application/json")
                .headers("Content-Type", "application/json")
                .uri(URI.create(API_URL + endpoint))
                .build();
    }

    private void setPostRequest(String requestBody) {
        request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + endpoint))
                .POST(BodyPublishers.ofString(requestBody))
                .header("Content-Type", "application/json")
                .build();
    }

}
