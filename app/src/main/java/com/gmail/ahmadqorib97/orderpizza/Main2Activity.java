package com.gmail.ahmadqorib97.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tnama = (TextView)findViewById(R.id.txtNama);
        TextView tCount = (TextView) findViewById(R.id.txtCount);
        TextView tUkuran = (TextView)findViewById(R.id.txtUkuran);
        TextView tHUkuran = (TextView)findViewById(R.id.txtHargaUkuran);
        TextView tJenis = (TextView)findViewById(R.id.txtJenis);
        TextView tHJenis = (TextView)findViewById(R.id.txtHargaJenis);
        TextView total = (TextView)findViewById(R.id.txtTotal);

        Intent inten = getIntent();
        String nama = inten.getStringExtra("Nama");
        String textP = inten.getStringExtra("THargaP");
        String hargaP = inten.getStringExtra("HargaP");
        String count = inten.getStringExtra("Count");
        String textS = inten.getStringExtra("THargaS");
        String hargaS = inten.getStringExtra("HargaS");

        int qty = Integer.parseInt(count);
        int hrgT = Integer.parseInt(hargaP);
        int hrgS = Integer.parseInt(hargaS);
        int totalH = qty * (hrgT + hrgS);
        String hTotal = Integer.toString(totalH);

        tnama.setText(nama);
        tCount.setText(count);
        tUkuran.setText(textS);
        tHUkuran.setText(hargaS);
        tJenis.setText(textP);
        tHJenis.setText(hargaP);
        total.setText(hTotal);
    }
}
