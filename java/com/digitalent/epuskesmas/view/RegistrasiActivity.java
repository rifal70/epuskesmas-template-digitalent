package com.digitalent.epuskesmas.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.digitalent.epuskesmas.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegistrasiActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner_jk;
    Spinner spinner_provinsi;
    Spinner spinner_kota;
    String[] jeniskelamin = {"Jenis Kelamin","Laki - Laki", "Perempuan"};
    String[] provinsi = {"Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi",
            "Bengkulu", "Sumatera Selatan", "Kepulauan Bangka Belitung", "Lampung", "Banten", "Jawa Barat", "DKI Jakarta",
            "Jawa Tengah", "Daerah Istimewa Yogyakarta", "Jawa Timur", "Bali", "Nusa Tenggara Barat", "Nusa Tenggara Timur",
            "Kalimantan Barat", "Kalimantan Selatan", "Kalimantan Tengah", "Kalimantan Timur", "Kalimantan Utara",
            "Gorontalo", "Sulawesi Barat", "Sulawesi Selatan", "Sulawesi Tengah", "Sulawesi Tenggara", "Sulawesi Utara",
            "Maluku", "Maluku Utara", "Papua Barat", "Papua"};
    HashMap<String, String[]> hash_provinsi = new HashMap<String, String[]>();

    Button btn_daftar;
    ImageView iv_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        generateData();

        spinner_jk = findViewById(R.id.spinner_jk);

        ArrayAdapter<String> adapterJK = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, jeniskelamin);
        adapterJK.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_jk.setAdapter(adapterJK);
        spinner_jk.setOnItemSelectedListener(this);


        spinner_provinsi = findViewById(R.id.spinner_provinsi);

        ArrayAdapter<String> provinsiAdapter;
        provinsiAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, provinsi);
        provinsiAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_provinsi.setAdapter(provinsiAdapter);
        spinner_kota = findViewById(R.id.spinner_kota);

        btn_daftar = findViewById(R.id.btn_daftar);
        btn_daftar.setOnClickListener(v -> {
            Toast.makeText(this, "Anda Telah Berhasil Mendaftar", Toast.LENGTH_SHORT).show();
            Intent daftar = new Intent(this, LoginActivity.class);
            startActivity(daftar);
        });

        iv_back = findViewById(R.id.iv_back);
        iv_back.setOnClickListener(v -> {
            Intent kembali = new Intent(this, LoginActivity.class);
            startActivity(kembali);
            finish();
        });
    }

    public void onItemSelected(AdapterView<?> parent, View v, int position,	long id) {
        fillComboKota(provinsi[position]);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this, "Silahkan Pilih Provinsi", Toast.LENGTH_LONG).show();
    }

    private void generateData(){
        hash_provinsi.put("Aceh", new String[]{"Kabupaten Aceh Barat", "Kabupaten Aceh Barat Daya",
                "Kabupaten Aceh Besar", "Kabupaten Aceh Jaya", "Kabupaten Aceh Selatan", "Kabupaten Aceh Singkil",
                "Kabupaten Aceh Tamiang", "Kabupaten Aceh Tengah", "Kabupaten Aceh Tenggara", "Kabupaten Aceh Timur"
                , "Kabupaten Aceh Utara", "Kabupaten Bener Meriah", "Kabupaten Bireuen", "Kabupaten Gayo Lues", "Kabupaten Nagan Raya",
                "Kabupaten Pidie", "Kabupaten Pidie Jaya", "Kabupaten Simeulue", "Kota Banda Aceh", "Kota Langsa", "Kota Lhokseumawe"
                , "Kota Sabang", "Kota Subulussalam"});
    }
    private void fillComboKota(String snegara){
        String[] kota = null;
        String[] provinsi = null;
        ArrayAdapter<String> provinsiAdapter = null;
        try {
            provinsi = hash_provinsi.get(snegara);
            kota = hash_provinsi.get(snegara);
            provinsiAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, kota);

        } catch (NullPointerException e) {
            provinsiAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, new String[] {});
        }
        provinsiAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_kota.setAdapter(provinsiAdapter);
    }

}
