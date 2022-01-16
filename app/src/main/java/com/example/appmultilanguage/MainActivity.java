package com.example.appmultilanguage;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
        ImageButton btnCoktail,btnMocktail,btnIndonesian_Food, btnWestren_food, btnTimurTengah;
public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
        }
private void inisialisasiView() {
        btnCoktail = findViewById(R.id.btn_buka_ras_Coktail);
        btnMocktail = findViewById(R.id.btn_buka_ras_Indonesian_dood);
        btnIndonesian_Food = findViewById(R.id.btn_buka_ras_Mocktail);
        btnWestren_food = findViewById(R.id.btn_buka_Wetren_food);
        btnTimurTengah = findViewById(R.id.btn_buka_Timur_Tengah);
        btnCoktail.setOnClickListener(view -> bukaGaleri("Coktails"));
        btnIndonesian_Food.setOnClickListener(view -> bukaGaleri("Indonesian Food"));
        btnMocktail.setOnClickListener(view -> bukaGaleri("Mocktails"));
        btnWestren_food.setOnClickListener(View -> bukaGaleri("Weatrean Food"));
        btnTimurTengah.setOnClickListener(View -> bukaGaleri("Middle Eastern eats"));
    }

private void bukaGaleri(String jenisMasakan) {
        Log.d("MAIN","Buka activity Coktail");
        Intent intent = new Intent(this, DaftarMasakanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisMasakan);
        startActivity(intent);
     }
public void Pindah(View  v){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
