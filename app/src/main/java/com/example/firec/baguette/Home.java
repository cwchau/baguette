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
        import android.widget.TextView;
        import java.util.*;
        import com.example.firec.baguette.MainActivity.*;


public class Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // baguette progress
        String baguette_progress_text = String.valueOf(MainActivity.baguette_progress);
        TextView baguette_progress_textview = (TextView) view.findViewById(R.id.textView7);
        baguette_progress_textview.setText(baguette_progress_text);

        // completed baguettes
        //String baguettes_completed_text = String.valueOf(MainActivity.completed_baguettes);
        //TextView baguettes_completed_textview = (TextView) view.findViewById(R.id.textView6);
        //baguettes_completed_textview.setText(baguettes_completed_text);

        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Home");

        List<String> crumbs = new ArrayList<String>();
        crumbs.add("The average family accumulates 60 plastic bags in only four trips to the grocery store.");
        crumbs.add("The average reusable bag has a lifespan equal to that of more than 700 disposable plastic bags.");
        crumbs.add("Keep your reusable bags in the car so you don't forget them!");
        crumbs.add("Reduce, reuse, recycle!");
        crumbs.add("You can reuse your plastic bags as garbage can liners!");

        //1 means "Tip of the Day!" , 0 means "Did you know?"
        List<Boolean> types = new ArrayList<Boolean>();
        types.add(false);
        types.add(false);
        types.add(true);
        types.add(true);
        types.add(true);

        Random r = new Random();
        int randomIndex = r.nextInt(crumbs.size());

        String message = "";
        if (types.get(randomIndex) == false) { message = "Did you know?"; }
        else { message = "Tip of the Day!"; }

        TextView message_textview = (TextView) view.findViewById(R.id.textView9);
        message_textview.setText(message);

        String crumb = crumbs.get(randomIndex);
        TextView crumb_textview = (TextView) view.findViewById(R.id.textView10);
        crumb_textview.setText(crumb);

    }
}