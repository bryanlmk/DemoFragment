package com.myapplicationdev.android.demofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.myapplicationdev.android.demofragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {

    Button btnAddText1;
    TextView tvFrag2;

    public FragmentSecond() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);

        tvFrag2 = (TextView) view.findViewById(R.id.tvFrag2);
        btnAddText1 = (Button) view.findViewById(R.id.btnAddTextFrag2);

        btnAddText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvFrag2.getText().toString() + "\n" + "New Data F2";
                tvFrag2.setText(data);
            }
        });
        return view;
    }

}
