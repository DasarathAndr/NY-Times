package com.example.nyitimeapplication.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.nyitimeapplication.R;
import com.example.nyitimeapplication.adapter.ArticleAdapter;
import com.example.nyitimeapplication.databinding.ActivityArticleListBinding;
import com.example.nyitimeapplication.fragment.DetailsFragment;
import com.example.nyitimeapplication.model.ArticleModel;
import com.example.nyitimeapplication.model.Result;
import com.example.nyitimeapplication.navigator.ArticleListItemNavigator;
import com.example.nyitimeapplication.navigator.ArticleListNavigator;
import com.example.nyitimeapplication.viewmodel.ArticleListViewModel;


public class ArticleListActivity extends Fragment implements ArticleListNavigator, ArticleListItemNavigator {
    ActivityArticleListBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.activity_article_list,container,false);
        ArticleListViewModel articleListViewModel = new ViewModelProvider(this).get(ArticleListViewModel.class);
        articleListViewModel.setNavigator(this);
        articleListViewModel.getArticleList(getActivity());

        return binding.getRoot();

    }

    @Override
    public void getArticleList(ArticleModel articleModel) {
        if (articleModel != null && articleModel.results != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
            binding.recyclerView.setLayoutManager(linearLayoutManager);
            ArticleAdapter articleAdapter = new ArticleAdapter(getActivity(), articleModel.results, this);
            binding.recyclerView.setAdapter(articleAdapter);
        } else {
            Toast.makeText(getActivity(), "some thing went wrong", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFail(String errorMessage) {
        Toast.makeText(getActivity(), errorMessage, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onArticleSelected(Result result) {
        Toast.makeText(getActivity(), result.title, Toast.LENGTH_SHORT).show();
        redirectFragment(result, new DetailsFragment());

    }
    public void redirectFragment(Result result,DetailsFragment detailsFragment)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", result.getTitle()); // Pass data if needed
        bundle.putString("line", result.byline);
        detailsFragment.setArguments(bundle);
        FragmentManager fragmentManager = getParentFragmentManager();

// Start a new FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

// Replace the current fragment with the new fragment
        fragmentTransaction.replace(R.id.fragment_container, detailsFragment);

// Commit the FragmentTransaction
        fragmentTransaction.commit();


    }
}