package com.sewa.mobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PelangganActivity extends AppCompatActivity {

    private ListView lvpelanggan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelanggan);

        lvpelanggan=(ListView) findViewById(R.id.lv_pelanggan);

        String[] arrPelanggan={"Dito","Fikri","Sendi"};

        ArrayAdapter adapter= new ArrayAdapter( this,android.R.layout.simple_list_item_1,arrPelanggan);

        lvpelanggan.setAdapter(adapter);

    }





}
