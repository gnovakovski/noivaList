package com.example.nunes.noivalist;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> ItemNoivaArray = new ArrayList<String> ();
        ItemNoivaArray.add("Bolo de casamento");
        ItemNoivaArray.add("Convites");
        ItemNoivaArray.add("Contratar Buffet");
        ItemNoivaArray.add("Contratar Sonorização");
        ItemNoivaArray.add("Contratar Golfinhos");
        ItemNoivaArray.add("Flores");
        ItemNoivaArray.add("Festa");
        ItemNoivaArray.add("Carro com latinhas");
        ItemNoivaArray.add("Lua de mel");
        ItemNoivaArray.add("Item 7");
        ItemNoivaArray.add("Item 7");
        ItemNoivaArray.add("Item 7");


        final ArrayAdapter<String> mNoivaAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_noiva,
                R.id.list_item_noiva_textview,
                ItemNoivaArray);

        ListView listView =(ListView) rootView.findViewById(
                R.id.listview_noiva);
        listView.setAdapter(mNoivaAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String list = mNoivaAdapter.getItem(position);
                // Toast.makeText(getActivity(), forecast , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), NewListActivity.class)
                        .putExtra(Intent.EXTRA_TEXT, list);
                startActivity(intent);

            }
        });


        return rootView;
    }
}
