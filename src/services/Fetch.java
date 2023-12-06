package services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;

public class Fetch<T> {

    private final String api = "http://127.0.0.1:8000/api";
    private String URL;
    private String endpoint;
    private ArrayList<T> objectList;
    private HttpClient client;
    private HttpRequest request;
    private HttpResponse<String> response;
    private JSONParser<T> jsonParser;
    private Class<T> objectType;

    public Fetch(Class<T> objectType) {
        client = HttpClient.newBuilder().build();
        jsonParser = new JSONParser<T>();
        this.objectType = objectType;
    }

    public Fetch(String endpoint) {
        client = HttpClient.newBuilder().build();
        jsonParser = new JSONParser<>();
        this.endpoint = endpoint;
    }

    public ArrayList<T> get() {
        try {
            setGetRequest();
            response = sendRequest();
            System.out.println(response.body());

            objectList = jsonParser.parserList(response.body(), objectType);
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
            jsonString = objectToString(object);
            setPostRequest(stringify);
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
                .uri(URI.create(api + endpoint))
                .setHeader("Content-Type", "application/json")
                .build();
    }

    private void setPostRequest(String requestBody) {
        request = HttpRequest.newBuilder()
                .uri((URI.create(api + endpoint)))
                .setHeader("Content-Type", "application/json")
                .POST(BodyPublishers.ofString(requestBody))
                .build();
    }

//    private List<T> 
}