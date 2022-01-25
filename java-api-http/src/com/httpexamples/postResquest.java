package com.httpexamples;

import java.io.FileNotFoundException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class postResquest {

    public static final String URL_POST = "http://httpbin.org/forms/post";
    public static final String FILE_JSON = "../java-api-http/teste.json";

    public static void main(String[] args) throws FileNotFoundException {

        HttpClient cliente = HttpClient.newHttpClient();

        HttpRequest requisicao = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_POST))
                .build();

        cliente.sendAsync(requisicao, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

    }

}
