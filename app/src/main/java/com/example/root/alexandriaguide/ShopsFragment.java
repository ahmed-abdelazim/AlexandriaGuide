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
public class ShopsFragment extends Fragment {


    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.shop_name_Queen_Home),
                context.getString(R.string.shop_description_Queen_Home),
                null,
                null,
                null,
                null,
                R.drawable.shop_queen
        ));

        list.add(new Location(
                context.getString(R.string.shop_name_EL_SHENNAWY_MOBILES),
                context.getString(R.string.shop_description_EL_SHENNAWY_MOBILES),
                null,
                null,
                null,
                null,
                R.drawable.shop_shennawy

        ));


        list.add(new Location(
                context.getString(R.string.shop_name_Select_Mobiles),
                context.getString(R.string.shop_description_Select_Mobiles),
                null,
                null,
                null,
                null,
                R.drawable.shop_select
        ));


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<Location> list = new ArrayList<>();
        this.initShopsList(list, getContext());

        LocationAdapter adapter = new LocationAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.locations_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        return view;

    }

}
