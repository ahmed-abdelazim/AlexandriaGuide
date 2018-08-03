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
                context.getString(R.string.food_title_balbaa),
                context.getString(R.string.food_desc_balbaa),
                context.getString(R.string.food_address_balbaa),
                context.getString(R.string.food_phone_balbaa),
                context.getString(R.string.food_sched_balbaa),
                context.getString(R.string.food_price_balbaa),
                R.drawable.balbaa
        ));

        list.add(new Location(
                context.getString(R.string.food_title_wahat),
                context.getString(R.string.food_desc_wahat),
                context.getString(R.string.food_address_wahat),
                context.getString(R.string.food_phone_wahat),
                context.getString(R.string.food_sched_wahat),
                context.getString(R.string.food_price_wahat),
                R.drawable.khattab
        ));

        list.add(new Location(
                context.getString(R.string.food_title_hosny),
                context.getString(R.string.food_desc_hosny),
                context.getString(R.string.food_address_hosny),
                context.getString(R.string.food_phone_hosny),
                context.getString(R.string.food_sched_hosny),
                context.getString(R.string.food_price_hosny),
                R.drawable.hosny
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
