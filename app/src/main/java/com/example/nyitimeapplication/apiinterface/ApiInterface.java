package com.example.nyitimeapplication.apiinterface;

import com.example.nyitimeapplication.model.ArticleModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    String BASE_URL = "https://api.nytimes.com/";

    @GET("svc/mostpopular/v2/viewed/1.json?api-key=9g3YWrH8cjS4nSjWQ9ayYvgYACHul2Gj")
    Call<ArticleModel> getArticlesList();
}
