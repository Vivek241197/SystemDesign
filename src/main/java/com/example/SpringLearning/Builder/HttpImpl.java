package com.example.SpringLearning.Builder;

public class HttpImpl {

    HttpRequest rq1 = new HttpRequest.Builder("http://llocalhost:8087")
            .getBody("Abc").build();
}
