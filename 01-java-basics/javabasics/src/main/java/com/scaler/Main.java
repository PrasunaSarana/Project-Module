package com.scaler;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {

    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
    public static void main(String[] args){
        System.out.println("Hello World!!!");
        Person p = Person.builder()
                        .age(25)
                        .name("Prasuna")
                        .build();

        Main m = new Main();
        try {
            System.out.println(m.run("https://example.com/"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
