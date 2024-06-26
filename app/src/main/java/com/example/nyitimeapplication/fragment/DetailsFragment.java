package com.example.nyitimeapplication.fragment;

import static androidx.databinding.DataBindingUtil.inflate;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nyitimeapplication.R;
import com.example.nyitimeapplication.databinding.ArticleItemBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String title;
    private String line;

    public DetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailsFragment newInstance(String param1, String param2) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null) {
            title = getArguments().getString("title");
            line = getArguments().getString("line");

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         TextView tvTitle,tvLine;
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_details, container, false);

        // Initialize views
        tvTitle = rootView.findViewById(R.id.fgtxtTitle);
        tvLine = rootView.findViewById(R.id.fgtxtBy);

        // Retrieve data passed from previous fragment/activity
        Bundle bundle = getArguments();
        if (bundle != null) {
            String textTitle = bundle.getString("title");
            String textLine = bundle.getString("line");
            if (textTitle != null && textLine!=null) {
                // Update UI with details
                tvTitle.setText(textTitle);
                tvLine.setText(textLine);
            }
        }

        return rootView;

    }
}