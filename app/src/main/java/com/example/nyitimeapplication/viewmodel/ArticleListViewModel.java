package com.example.nyitimeapplication.viewmodel;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.example.nyitimeapplication.model.ArticleModel;
import com.example.nyitimeapplication.model.RetrofitBuilder;
import com.example.nyitimeapplication.navigator.ArticleListNavigator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticleListViewModel extends ViewModel {
    ArticleListNavigator articleListNavigator;


    public void setNavigator(ArticleListNavigator articleListNavigator) {
        this.articleListNavigator = articleListNavigator;
    }

    public void getArticleList(Context context) {
        RetrofitBuilder.getInstance().getApiInterface().getArticlesList().enqueue(new Callback<ArticleModel>() {
            @Override
            public void onResponse(Call<ArticleModel> call, Response<ArticleModel> response) {
                if (response.isSuccessful()) articleListNavigator.getArticleList(response.body());
                else articleListNavigator.onFail("some thing went wrong");
            }

            @Override
            public void onFailure(Call<ArticleModel> call, Throwable t) {
                articleListNavigator.onFail(t.getMessage());
            }
        });
    }
}
