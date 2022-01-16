package com.example.appmultilanguage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appmultilanguage.model.Coktail;
import com.example.appmultilanguage.model.Indonesian_Food;
import com.example.appmultilanguage.model.Masakan;
import com.example.appmultilanguage.model.Mocktail;
import com.example.appmultilanguage.model.Timur_Tengah_Food;
import com.example.appmultilanguage.model.Westren_Food;

import java.util.List;

public class DaftarMasakanActivity extends AppCompatActivity {
    public final static String MASAKAN_TERPILIH = "masakan_obj_key";
    List<Masakan> masakans;
    ListView listView;
    String jenisMasakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_masakan);
        Intent intent = getIntent();
        jenisMasakan = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        masakans = DataProvider.getMasakansByTipe(this, jenisMasakan);
        TextView txJudul = findViewById(R.id.text_title_daftar_masakan);
        String judul ="";
        if(masakans.get(0)instanceof Coktail){
            judul = getString(R.string.coktail_list);
        }else if(masakans.get(0)instanceof Indonesian_Food){
            judul = getString(R.string.masaIndo_list);
        }else if(masakans.get(0)instanceof Mocktail){
            judul = getString(R.string.minummok_list);
        }else if(masakans.get(0)instanceof Westren_Food){
            judul = getString(R.string.masBarat_list);
        }else if(masakans.get(0)instanceof Timur_Tengah_Food){
            judul = getString(R.string.masTimTum_list);
        }
        txJudul.setText(judul);
        setupListView();
    }
    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_hewan);
        DafatarMasakanAdapter adapter = new DafatarMasakanAdapter(this, masakans);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Masakan terpilih = masakans.get(position);
            bukaProfileMasakan(terpilih);
        }
    };
    public void bukaProfileMasakan(Masakan masakanterpilih) {
        Log.d("MAIN","Buka activity galeria");
        Intent intent = new Intent(this, DetailMasakan.class);
        intent.putExtra(MASAKAN_TERPILIH, masakanterpilih);
        startActivity(intent);
    }
}