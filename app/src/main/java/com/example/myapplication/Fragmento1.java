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

public class Fragmento1 extends Fragment {

    public Fragmento1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Button bt1, bt2, bt3, bt4, bt5,bt6,bt7,bt8,bt9,bt0,btsoma,btsub,btmult,btdiv,btdel,btigual;
        EditText dig;

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmento1, container, false);

        bt1 = view.findViewById(R.id.b1);
        bt2 = view.findViewById(R.id.b2);
        bt3 = view.findViewById(R.id.b3);
        bt4 = view.findViewById(R.id.b4);
        bt5 = view.findViewById(R.id.b5);
        bt6 = view.findViewById(R.id.b6);
        bt7 = view.findViewById(R.id.b7);
        bt8 = view.findViewById(R.id.b8);
        bt9 = view.findViewById(R.id.b9);
        bt0 = view.findViewById(R.id.b0);
        btsoma = view.findViewById(R.id.bsoma);
        btsub = view.findViewById(R.id.bsub);
        btmult = view.findViewById(R.id.bmult);
        btdiv = view.findViewById(R.id.bdiv);
        btdel = view.findViewById(R.id.bdel);
        btigual = view.findViewById(R.id.bigual);
        dig = view.findViewById(R.id.editTextNumber);

        final double[] resultado = {0};
        final String[] op = {""};

        btsoma.setOnClickListener(new View.OnClickListener()
                                 {
                                     @Override
                                     public void onClick(View v)
                                     {
                                         if (op[0].equals("")){
                                             resultado[0] = Double.parseDouble(dig.getText().toString());
                                             dig.setText("0");
                                             op[0] = "soma";
                                         }else{
                                             Toast.makeText(getActivity(), "Operação não Permitida! Comece novamente!", Toast.LENGTH_LONG).show();
                                             dig.setText("0");
                                             resultado[0] = 0;
                                             op[0] = "";
                                         }

                                     }}
        );

        btsub.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View v)
                                      {
                                          if (op[0].equals("")) {
                                              resultado[0] = Double.parseDouble(dig.getText().toString());
                                              dig.setText("0");
                                              op[0] = "sub";
                                          }else{
                                              Toast.makeText(getActivity(), "Operação não Permitida! Comece novamente!", Toast.LENGTH_LONG).show();
                                              dig.setText("0");
                                              resultado[0] = 0;
                                              op[0] = "";
                                          }
                                      }}
        );

        btmult.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View v)
                                      {
                                          if (op[0].equals("")) {
                                              resultado[0] = Double.parseDouble(dig.getText().toString());
                                              dig.setText("0");
                                              op[0] = "mult";
                                          }else{
                                              Toast.makeText(getActivity(), "Operação não Permitida! Comece novamente!", Toast.LENGTH_LONG).show();
                                              dig.setText("0");
                                              resultado[0] = 0;
                                              op[0] = "";
                                          }
                                      }}
        );

        btdiv.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View v)
                                      {
                                          if (op[0].equals("")) {
                                              resultado[0] = Double.parseDouble(dig.getText().toString());
                                              dig.setText("0");
                                              op[0] = "div";
                                          }else{
                                              Toast.makeText(getActivity(), "Operação não Permitida! Comece novamente!", Toast.LENGTH_LONG).show();
                                              dig.setText("0");
                                              resultado[0] = 0;
                                              op[0] = "";
                                          }
                                      }}
        );

        btigual.setOnClickListener(new View.OnClickListener()
                                  {
                                      @Override
                                      public void onClick(View v)
                                      {
                                          if (op[0].equals("soma")){
                                              resultado[0] = resultado[0]+Double.parseDouble(dig.getText().toString());
                                              dig.setText(""+resultado[0]);
                                              resultado[0]=0;
                                              op[0]="";

                                          }else if(op[0].equals("sub")){
                                          resultado[0] = resultado[0]-Double.parseDouble(dig.getText().toString());
                                          dig.setText(""+resultado[0]);
                                          resultado[0]=0;
                                          op[0]="";

                                      }else if(op[0].equals("mult")){
                                              resultado[0] = resultado[0]*Double.parseDouble(dig.getText().toString());
                                              dig.setText(""+resultado[0]);
                                              resultado[0]=0;
                                              op[0]="";


                                      }else if(op[0].equals("div")) {
                                              if (Integer.parseInt(dig.getText().toString())==0){
                                                  Toast.makeText(getActivity(), "Operação não Permitida!", Toast.LENGTH_LONG).show();
                                                  resultado[0] = 0;
                                                  op[0] = "";
                                              }else{
                                              resultado[0] = resultado[0] / Double.parseDouble(dig.getText().toString());
                                              dig.setText("" + resultado[0]);
                                              resultado[0] = 0;
                                              op[0] = "";
                                              }
                                          }}}
        );


        btdel.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                           dig.setText("0");
                                            resultado[0] = 0;
                                             op[0] = "";

                                   }}
        );

        bt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (dig.getText().toString().equals("0")){
                    dig.setText(bt1.getText());
                }else{
                    dig.setText(dig.getText().toString()+bt1.getText());
                }

            }}
        );

        bt2.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if (dig.getText().toString().equals("0")){
                                           dig.setText(bt2.getText());
                                       }else{
                                           dig.setText(dig.getText().toString()+bt2.getText());
                                       }

                                   }}
        );
        bt3.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if (dig.getText().toString().equals("0")){
                                           dig.setText(bt3.getText());
                                       }else{
                                           dig.setText(dig.getText().toString()+bt3.getText());
                                       }

                                   }}
        );
        bt4.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if (dig.getText().toString().equals("0")){
                                           dig.setText(bt4.getText());
                                       }else{
                                           dig.setText(dig.getText().toString()+bt4.getText());
                                       }

                                   }}
        );
        bt5.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if (dig.getText().toString().equals("0")){
                                           dig.setText(bt5.getText());
                                       }else{
                                           dig.setText(dig.getText().toString()+bt5.getText());
                                       }

                                   }}
        );
        bt6.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if (dig.getText().toString().equals("0")){
                                           dig.setText(bt6.getText());
                                       }else{
                                           dig.setText(dig.getText().toString()+bt6.getText());
                                       }

                                   }}
        );
        bt7.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if (dig.getText().toString().equals("0")){
                                           dig.setText(bt7.getText());
                                       }else{
                                           dig.setText(dig.getText().toString()+bt7.getText());
                                       }

                                   }}
        );
        bt8.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if (dig.getText().toString().equals("0")){
                                           dig.setText(bt8.getText());
                                       }else{
                                           dig.setText(dig.getText().toString()+bt8.getText());
                                       }

                                   }}
        );
        bt9.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if (dig.getText().toString().equals("0")){
                                           dig.setText(bt9.getText());
                                       }else{
                                           dig.setText(dig.getText().toString()+bt9.getText());
                                       }

                                   }}
        );
        bt0.setOnClickListener(new View.OnClickListener()
                               {
                                   @Override
                                   public void onClick(View v)
                                   {
                                       if (dig.getText().toString().equals("0")){
                                           dig.setText(bt0.getText());
                                       }else{
                                           dig.setText(dig.getText().toString()+bt0.getText());
                                       }

                                   }}
        );




        return view;
    }
}