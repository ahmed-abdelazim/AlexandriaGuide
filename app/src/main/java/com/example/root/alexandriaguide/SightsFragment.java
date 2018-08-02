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
                "King Farouk Palace",
                "This sprawling property was the summer home of controversial King Farouk who assumed power at the age of 16 in 1936.",
                null,
                null,
                null,
                null,
                R.drawable.king
        ));

        list.add(new Location(
                "Catacombs of Kom el Shoqafa",
                "An ancient circular staircase leads down into these tombs that were tunneled into the bedrock during the age of the Antonine emporers (2nd century AD).",
                null,
                null,
                null,
                null,
                R.drawable.kom

        ));


        list.add(new Location(
                "Fort Qaitbey",
                "Resembling an imposing castle fortress, this citadel was built in the 1480s by Sultan Qaitbey on the site of the Pharos Lighthouse, to protect the city from the crusaders who used to attack the city by sea.",
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
