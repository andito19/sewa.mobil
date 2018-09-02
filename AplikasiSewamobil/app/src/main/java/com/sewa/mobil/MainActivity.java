package com.sewa.mobil;

import android.content.Intent;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.sewa.mobil.R.id.text;


public class    MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    private EditText txtNama, txtTelepon, txtEmail;
    private Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (EditText) findViewById(R.id.txt_nama);
        txtTelepon = (EditText) findViewById(R.id.txt_telepon);
        txtEmail = (EditText) findViewById(R.id.txt_email);


        btnSimpan = (Button) findViewById(R.id.btn_simpan);

        txtNama.setText("ANDITO");
        txtTelepon.setText("0802184");
        txtEmail.setText("DITO@gmail.com");
    }

    //validation
    private boolean adaError() {
        boolean ada = false;
        if (TextUtils.isEmpty(txtNama.getText().toString())) {
            ada = true;
            txtNama.setError("Tidak Boleh Kosong!!");
        }
        else if (TextUtils.isEmpty(txtTelepon.getText().toString())) {
            ada = true;
            txtTelepon.setError("Tidak Boleh Kosong!!");
        }
        else if (TextUtils.isEmpty(txtEmail.getText().toString())) {
            ada = true;
            txtEmail.setError("Tidak Boleh Kosong!!");
        }
        return ada;
    }



    public void daftar(View v){
        if(!adaError()) {
            Toast.makeText(
                    this,

                    txtNama.getText()+"\n"+ txtTelepon.getText()+"\n"+ txtEmail.getText(),
            Toast.LENGTH_SHORT).show();

            Bundle bundle =new Bundle();
            bundle.putString("nama",txtNama.getText().toString());
            bundle.putString("telepon",txtTelepon.getText().toString());
            bundle.putString("email",txtEmail.getText().toString());

            Intent i=new Intent(this,LoginActivity.class);
            i.putExtras(bundle);

            startActivity(i);

        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }


}
