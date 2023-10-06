package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Fragmento2 extends Fragment {
    public Fragmento2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Button bt;
        EditText tn1;
        EditText tn2;
        EditText tn3;
        TextView tv;

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmento2, container, false);

        bt = view.findViewById(R.id.btcalcmedia);
        tn1 =  view.findViewById(R.id.tnnota1);
        tn2 =  view.findViewById(R.id.tnnota2);
        tn3 =  view.findViewById(R.id.tnnota3);
        tv  = view.findViewById(R.id.tvexibesituacao);


        tn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(tn1.getText().toString().equals("Insira nota 01")){
                    tn1.setText("");
                }

            }}
        );

        tn2.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if(tn2.getText().toString().equals("Insira nota 02")){
                                           tn2.setText("");
                                       }

                                   }}
        );

        tn3.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if(tn3.getText().toString().equals("Insira nota 03")){
                                           tn3.setText("");
                                       }

                                   }}
        );

        tn1.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if(tn1.getText().toString().equals("Insira nota 01")){
                                           tn1.setText("");
                                       }

                                   }}
        );

        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String t1 = tn1.getText().toString();
                String t2 = tn2.getText().toString();
                String t3 = tn3.getText().toString();

                double n1 = 0;
                double n2 = 0;
                double n3 = 0;
                double media = 0;

                if (t1.equals("") || t1.equals("Insira nota 01") ){
                    tv.setText( "Você precisa informar ao menos a nota da primeira unidade!");
                }else if (!(t1.equals("") || t1.equals("Insira nota 01")) && (t2.equals("") || t2.equals("Insira nota 02")) && (t3.equals("") || t3.equals("Insira nota 03"))){
                    n1 = Double.parseDouble(t1);
                    tv.setText( "Com "+ ((21 - n1)/2) +" na 2ª e na 3ª você será aprovado por média e com "+((15 - n1)/2)+"na 2ª e na 3ª você será aprovado por nota");
                }else if (!(t1.equals("") || t1.equals("Insira nota 01")) && !(t2.equals("") || t2.equals("Insira nota 02")) && (t3.equals("") || t3.equals("Insira nota 03"))){
                    n1 = Double.parseDouble(t1);
                    n2 = Double.parseDouble(t2);
                    tv.setText( "Com "+ (21 - (n1+n2)) +" na 3ª você será aprovado por média e com "+(15 - (n1+n2))+" na 3ª você será aprovado por nota");
                }else if (!(t1.equals("") || t1.equals("Insira nota 01")) && !(t2.equals("") || t2.equals("Insira nota 02")) && !(t3.equals("") || t3.equals("Insira nota 03"))){
                    n1 = Double.parseDouble(t1);
                    n2 = Double.parseDouble(t2);
                    n3 = Double.parseDouble(t3);
                    media = (n1+n2+n3)/3;
                    if(media>=7){
                        tv.setText( "Aprovado com média "+media);
                        Toast.makeText(getActivity(), "Aprovado", Toast.LENGTH_LONG).show();
                    }else if(media<7 && media>=5){
                        tv.setText( "Aprovado por nota com média "+media);
                        Toast.makeText(getActivity(), "Aprovado por nota", Toast.LENGTH_LONG).show();
                    }else{
                        tv.setText( "Reprovado: "+media);
                        Toast.makeText(getActivity(), "Reprovado", Toast.LENGTH_LONG).show();
                    }
                    }
            }
        });

        return view;
    }
}