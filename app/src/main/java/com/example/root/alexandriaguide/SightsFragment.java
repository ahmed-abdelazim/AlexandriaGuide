package com.example.root.alexandriaguide;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SightsFragment extends Fragment {

    public static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.sights_title_king),
                context.getString(R.string.sights_desc_king),
                null,
                null,
                null,
                null,
                R.drawable.king
        ));

        list.add(new Location(
                context.getString(R.string.sights_title_kom),
                context.getString(R.string.sights_desc_kom),
                null,
                null,
                null,
                null,
                R.drawable.kom

        ));


        list.add(new Location(
                context.getString(R.string.sights_title_qayet),
                context.getString(R.string.sights_desc_qayet),
                null,
                null,
                null,
                null,
                R.drawable.kayet
        ));


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<Location> list = new ArrayList<>();
        this.initSightsList(list, getContext());

        LocationAdapter adapter = new LocationAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.locations_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;


    }


}
