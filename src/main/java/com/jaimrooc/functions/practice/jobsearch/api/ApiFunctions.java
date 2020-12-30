package com.jaimrooc.functions.practice.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface ApiFunctions {

    static <T> T buildAPI(Class<T> clazz, String url) {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(clazz, url);
    }
}
