package com.example.SpringLearning.Builder;

import org.springframework.http.HttpMethod;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    private String url;
    private String type;
    private Map<String,String> headers;
    private String body;
    private int timeout;

    private HttpRequest(Builder build){
        this.url=build.url;
        this.type= build.method;
        this.headers=build.headers;
        this.body=build.body;
        this.timeout=build.timeout;

    }

    public static class Builder{
        private String url; // required
        private String method = "GET";
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> queryParams = new HashMap<>();
        private String body;
        private int timeout = 30000;

        public Builder (String url){
            this.url=url;
        }
        public Builder method(String method) {
            this.method = method;
            return this;
        }
        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }
        public Builder getBody(String body){
            this.body=body;
            return this;
        }
        public Builder getTimeout(int timeout){
            this.timeout=timeout;
            return this;
        }
        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}
