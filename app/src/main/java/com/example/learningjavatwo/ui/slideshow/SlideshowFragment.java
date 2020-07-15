package com.example.learningjavatwo.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.example.learningjavatwo.R;
import com.google.android.material.textfield.TextInputEditText;

public class SlideshowFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View obj =  inflater.inflate(R.layout.fragment_slideshow, container, false);
        final TextInputEditText editText1 = obj.findViewById(R.id.text1);
        final TextInputEditText editText3 = obj.findViewById(R.id.text3);
        Button button1 = obj.findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("message/html");
                intent.putExtra(Intent.EXTRA_EMAIL,new String("naveencooljhinjer@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback from aap");
                intent.putExtra(Intent.EXTRA_TEXT,"Name:"+editText1.getText()+"\n Feedback:"+editText3.getText());
                try {
                    startActivity(Intent.createChooser(intent,"Please Select Email"));
                }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(getActivity(), "There are no email Clients", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return obj;
    }

}
