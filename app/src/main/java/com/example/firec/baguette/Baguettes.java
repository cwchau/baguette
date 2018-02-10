package com.example.firec.baguette;

/**
 * Created by firec on 2/10/2018.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Baguettes extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_baguettes, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String baguette_progress_text = String.valueOf(MainActivity.baguette_progress);
        TextView baguette_progress_textview = (TextView) view.findViewById(R.id.textView7);
        baguette_progress_textview.setText(baguette_progress_text);

        ProgressBar baguette_progressbar = (ProgressBar) view.findViewById(R.id.progressBar);
        baguette_progressbar.setProgress(MainActivity.baguette_progress);

        String baguettes_completed_text = String.valueOf(MainActivity.completed_baguettes);
        TextView baguettes_completed_textview = (TextView) view.findViewById(R.id.textView11);
        String money_text = String.valueOf(MainActivity.completed_baguettes * 10);
        TextView money_textview = (TextView) view.findViewById(R.id.textView12);
        if (MainActivity.completed_baguettes == 1) {
            baguette_progress_textview.setText(baguettes_completed_text + " baguette  = ");
        }
        else {
            baguettes_completed_textview.setText(baguettes_completed_text + " baguettes  = ");
        }
        money_textview.setText("$" + money_text);


        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Baguettes");
    }
}