package com.example.nyitimeapplication.navigator;

import com.example.nyitimeapplication.model.ArticleModel;

public interface ArticleListNavigator {
    void getArticleList(ArticleModel articleModel);
    void onFail(String errorMessage);
}
