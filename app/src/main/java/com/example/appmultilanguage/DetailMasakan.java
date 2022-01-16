package com.example.appmultilanguage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmultilanguage.model.Coktail;
import com.example.appmultilanguage.model.Indonesian_Food;
import com.example.appmultilanguage.model.Masakan;
import com.example.appmultilanguage.model.Mocktail;
import com.example.appmultilanguage.model.Timur_Tengah_Food;
import com.example.appmultilanguage.model.Westren_Food;

public class DetailMasakan extends AppCompatActivity {
    Masakan masakan;
    TextView txJudul, txName, txbahan, txCaraMebuat;
    ImageView photodrawableMas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        masakan = (Masakan) intent.getSerializableExtra(DaftarMasakanActivity.MASAKAN_TERPILIH);
        inisialisasiView();
        tampilProfile(masakan);
    }
    private void inisialisasiView(){
        txJudul = findViewById(R.id.txJudul);
        txName = findViewById(R.id.txName);
        txbahan = findViewById(R.id.txBahan);
        txCaraMebuat = findViewById(R.id.txCaraMembuat);
        photodrawableMas = findViewById(R.id.gambarMasakan);
    }
    private void tampilProfile(Masakan masakan){
        Log.d("Profile", "Menampilkan" + masakan.getMasakan());
        if(masakan instanceof Coktail){
            txJudul.setText(getString(R.string.coktail));
        }else if(masakan instanceof Indonesian_Food){
            txJudul.setText(getString(R.string.masakan_indonesia));
        }else if(masakan instanceof Mocktail){
            txJudul.setText(getString(R.string.mocktail));
        }else if(masakan instanceof Westren_Food){
            txJudul.setText(getString(R.string.masakan_barat));
        }else if(masakan instanceof Timur_Tengah_Food){
            txJudul.setText(getString(R.string.masakan_timur_tengah));
        }

        txName.setText(masakan.getNama());
        txbahan.setText(masakan.getBahan());
        txCaraMebuat.setText(masakan.getCaraMebuat());
        photodrawableMas.setImageDrawable(this.getDrawable(masakan.getDrawableRes()));

    }
}