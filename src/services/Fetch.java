package services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;

public class Fetch<T> {

    private final String api = "http://127.0.0.1:8000/api/";
    private String URL;
    private String endpoint;
    private ArrayList<T> objectList;
    private HttpClient client;
    private ObjectMapper objectMapper;
    private HttpRequest request;
    private HttpResponse<String> response;

    public Fetch() {
        client = HttpClient.newBuilder().build();
        objectMapper = new ObjectMapper();
    }

    public Fetch(String endpoint) {
        client = HttpClient.newBuilder().build();
        objectMapper = new ObjectMapper();
        this.endpoint = endpoint;
    }

    public ArrayList<T> get() {
        try {
            setGetRequest();
            response = sendRequest();

            objectList = objectMapper.readValue(
                    response.body(),
                    new TypeReference<ArrayList<T>>() {
            });
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
        String stringify;

        try {
            stringify = objectToString(object);
            setPostRequest(stringify);
            response = sendRequest();
            System.out.println("Response code: " + response.statusCode());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private String objectToString(T object) throws Exception {
        return objectMapper.writeValueAsString(object);
    }

    private HttpResponse<String> sendRequest() throws Exception {
        return client.send(request, BodyHandlers.ofString());
    }

    private void setGetRequest() {
        request = HttpRequest.newBuilder()
                .uri(URI.create(api + URL))
                .setHeader("Content-Type", "application/json")
                .build();
    }

    private void setPostRequest(String requestBody) {
        request = HttpRequest.newBuilder()
                .uri((URI.create(api + URL)))
                .setHeader("Content-Type", "application/json")
                .POST(BodyPublishers.ofString(requestBody))
                .build();
    }

}
