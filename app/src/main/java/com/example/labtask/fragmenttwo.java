package com.example.labtask;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class fragmenttwo extends Fragment {

    ImageView imageView;
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_fragmenttwo, container, false);
        textView= (TextView) v.findViewById(R.id.textview);

        //imageView= (ImageView) v.findViewById(R.id.imageview);


        return v;
    }
    public  void setimage(String textstr)
    {
       textView.setText(textstr);

    }
   // public  void setimage1(int image)


   // {
     //   imageView.setImageResource(image);

    //}
}