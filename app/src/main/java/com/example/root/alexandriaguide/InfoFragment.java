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
public class InfoFragment extends Fragment {


    public static void initTransportList(List<Location> list, Context context) {

        list.add(new Location(
                "Misr Train Station",
                "The city's main train terminal, Mahattat Misr, is about 1km south of Midan Ramla. If you're arriving in Alexandria and going to the city centre around Midan Saad Zaghloul, make sure you stay on until this stop.",
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                "Sidi Gaber Train Station",
                "Mahattat Sidi Gaber train station serves the eastern suburbs. Trains from Cairo stop at Sidi Gaber before Mahattat Misr station, and most locals get off here",
                null,
                null,
                null,
                null,
                -1
        ));


        list.add(new Location(
                "Misr Train Station",
                "The city's main train terminal, Mahattat Misr, is about 1km south of Midan Ramla. If you're arriving in Alexandria and going to the city centre around Midan Saad Zaghloul, make sure you stay on until this stop.",
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                "Sidi Gaber Train Station",
                "Mahattat Sidi Gaber train station serves the eastern suburbs. Trains from Cairo stop at Sidi Gaber before Mahattat Misr station, and most locals get off here",
                null,
                null,
                null,
                null,
                -1
        ));


        list.add(new Location(
                "Misr Train Station",
                "The city's main train terminal, Mahattat Misr, is about 1km south of Midan Ramla. If you're arriving in Alexandria and going to the city centre around Midan Saad Zaghloul, make sure you stay on until this stop.",
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                "Sidi Gaber Train Station",
                "Mahattat Sidi Gaber train station serves the eastern suburbs. Trains from Cairo stop at Sidi Gaber before Mahattat Misr station, and most locals get off here",
                null,
                null,
                null,
                null,
                -1
        ));


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<Location> list = new ArrayList<>();
        this.initTransportList(list, getContext());

        LocationAdapter adapter = new LocationAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.locations_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }

}
