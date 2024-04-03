package com.example.nyitimeapplication.adapter;



import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nyitimeapplication.R;
import com.example.nyitimeapplication.databinding.ArticleItemBinding;
import com.example.nyitimeapplication.model.Result;
import com.example.nyitimeapplication.navigator.ArticleListItemNavigator;


import java.util.ArrayList;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.AriticleViewHolder> {
    ArrayList<Result> results;
    ArticleListItemNavigator articleListItemNavigator;

    public ArticleAdapter(Activity context, ArrayList<Result> results, ArticleListItemNavigator articleListItemNavigator) {
        this.results = results;
        this.articleListItemNavigator = articleListItemNavigator;
    }

    @NonNull
    @Override
    public AriticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ArticleItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.article_item, parent, false);

        return new AriticleViewHolder(binding, articleListItemNavigator);
    }

    @Override
    public void onBindViewHolder(@NonNull AriticleViewHolder holder, int position) {
        holder.setData(results.get(position));
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class AriticleViewHolder extends RecyclerView.ViewHolder {
        ArticleItemBinding binding;

        public AriticleViewHolder(ArticleItemBinding binding, ArticleListItemNavigator articleListItemNavigator) {
            super(binding.getRoot());
            this.binding = binding;
            binding.constraintLayout.setOnClickListener(view -> articleListItemNavigator.onArticleSelected(results.get(getBindingAdapterPosition())));

        }

        public void setData(Result result) {
            binding.setModel(result);

        }
    }
}
