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
public class FoodFragment extends Fragment {


    // public FoodFragment() {
    // Required empty public constructor
    // }
    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                "Balba Village",
                "fresh meet and seafood , very tasty .the place is clean and organized, the stuff is so helpful and friendly",
                "34-156 Al Sagh Mohamed Abd Al Salam, Sidi Beshr Qebli, Qism El-Montaza, Alexandria Governorate",
                "035546675",
                "9AM to 2AM",
                "$",
                R.drawable.balbaa
        ));

        list.add(new Location(
                "Wahat Khattab",
                "fresh meet and seafood , very tasty .the place is clean and organized, the stuff is so helpful and friendly",
                "34-156 Al Sagh Mohamed Abd Al Salam, Sidi Beshr Qebli, Qism El-Montaza, Alexandria Governorate",
                "035546675",
                "9AM to 2AM",
                "$$$",
                R.drawable.khattab
        ));

        list.add(new Location(
                "Hosny",
                "fresh meet and seafood , very tasty .the place is clean and organized, the stuff is so helpful and friendly",
                "34-156 Al Sagh Mohamed Abd Al Salam, Sidi Beshr Qebli, Qism El-Montaza, Alexandria Governorate",
                "035546675",
                "9AM to 2AM",
                "$",
                R.drawable.hosny
        ));

        list.add(new Location(
                "Balba Village",
                "fresh meet and seafood , very tasty .the place is clean and organized, the stuff is so helpful and friendly",
                "34-156 Al Sagh Mohamed Abd Al Salam, Sidi Beshr Qebli, Qism El-Montaza, Alexandria Governorate",
                "035546675",
                "9AM to 2AM",
                "$",
                R.drawable.balbaa
        ));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<Location> list = new ArrayList<>();
        this.initFoodsList(list, getContext());

        LocationAdapter adapter = new LocationAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.locations_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;
    }


}
