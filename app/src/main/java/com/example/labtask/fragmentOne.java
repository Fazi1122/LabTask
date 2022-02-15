package com.example.labtask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class fragmentOne extends Fragment {

 View fragmentview;
 ListView listview;
 String[] system={"Q mobile","Infinx","Oppo","Apple","Redmi","One plus","Huawie","Samsung "};
 Integer[] images={R.drawable.apple,R.drawable.apple,R.drawable.apple,R.drawable.apple,R.drawable.apple};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fragmentview= inflater.inflate(R.layout.fragment_one, container, false);
       listview=fragmentview.findViewById(R.id.listview);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity().getApplication(), android.R.layout.simple_list_item_1,system);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                fragmenttwo two =(fragmenttwo) getFragmentManager().findFragmentById(R.id.fragment2);
               //two.setimage("Mobile:>"+system[i]);

            }
        });

        return fragmentview;
    }
}