package com.examplepvht.alertdialog;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RemoteViews;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Dialogalert {
    public static Dialog dialog=null;
    LinearLayout linearLayout;
    Button btonDelete;
    public static void Add(Context context){

         dialog =new Dialog(context,R.style.Theme_AlertDialog);
         dialog.setContentView(R.layout.dialogadd);
         LinearLayout linearLayout=dialog.findViewById(R.id.linearGround);
         Button buttonAdd=dialog.findViewById(R.id.btdd);
         Button btsubmit =dialog.findViewById(R.id.btsumit);

         buttonAdd.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              LayoutInflater vi = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
              View vvv = vi.inflate(R.layout.row_add, null);
              EditText editText=vvv.findViewById(R.id.editexOder);
              Button btonDelete=vvv.findViewById(R.id.btdelete);
              linearLayout.addView(vvv);

              btonDelete.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      linearLayout.removeView(vvv);

                  }
              });
          }
      });


      btsubmit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              MainActivity.arrayAdapter.clear();

              for (int i = 0; i <linearLayout.getChildCount() ; i++) {
                  View vieworder = linearLayout.getChildAt(i);
                  EditText editTextnameorder= vieworder.findViewById(R.id.editexOder);

                  if (!editTextnameorder.getText().toString().equals("")){

                       MainActivity.arrayList.add(editTextnameorder.getText().toString());

                  }
                  MainActivity.arrayAdapter.notifyDataSetChanged();
                  Log.d("BBB", editTextnameorder.getText().toString());
              dialog.dismiss();
              }
          }
      });
      dialog.show();
    }
}

