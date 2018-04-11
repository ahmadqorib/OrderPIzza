package com.gmail.ahmadqorib97.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    public static String textS;
    public static String hargaS;
//    public static int Total = 0;
    public static String textP;
    public static String hargaP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




//        Total = jum + hargaP + hargaS;

        Button tombol = (Button)findViewById(R.id.button);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText nama = (EditText)findViewById(R.id.txtNama);
                EditText jumlah = (EditText)findViewById(R.id.txtJumlah);

                CheckBox cbVe = (CheckBox)findViewById(R.id.cbV);
                CheckBox cbMe = (CheckBox)findViewById(R.id.cbM);

                final String getNama = nama.getText().toString();
                final String getJumlah = jumlah.getText().toString();
//        final int jum = Integer.parseInt(getJumlah);

                boolean pilihV = cbVe.isChecked();
                boolean pilihM = cbMe.isChecked();

                if(pilihV && !pilihM){
                    hargaP = "5000";
                    textP = "Vegetables";
                }
                if(pilihM && !pilihV){
                    hargaP = "10000";
                    textP = "Meat";
                }
                if(pilihM && pilihV){
                    hargaP = "15000";
                    textP = "Vegetables + Meat";
                }
                Intent halamanDetOr = new Intent(MainActivity.this, Main2Activity.class);
                halamanDetOr.putExtra("THargaP", textP);
                halamanDetOr.putExtra("HargaP", hargaP);
                halamanDetOr.putExtra("Nama", getNama);
                halamanDetOr.putExtra("Count", getJumlah);
                halamanDetOr.putExtra("THargaS", textS);
                halamanDetOr.putExtra("HargaS", hargaS);
                startActivity(halamanDetOr);
            }
        });
    }

    public void klikRB(View view){
        boolean pilih = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.rbSmall:
                if(pilih) {
                    hargaS = "5000";
                    textS = "Small";
                }
                break;
            case R.id.rbMedium:
                if(pilih) {
                    hargaS = "7500";
                    textS = "Medium";
                }
                break;
            case R.id.rbLarge:
                if(pilih) {
                    hargaS = "10000";
                    textS = "Large";
                }
                break;
        }
    }
}
