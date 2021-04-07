package com.digitalent.epuskesmas.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.digitalent.epuskesmas.R;
import com.digitalent.epuskesmas.view.fragment.AntrianFragment;
import com.digitalent.epuskesmas.view.fragment.PilihDokterFragment;

public class AmbilNomorAntrian extends AppCompatActivity {

    private TextView poliName;
    private ImageView dokterFoto;
    private TextView dokterNama;
    ImageView btn_back;
    Button btn_nomorAntrian;
    int foto;
    String namaDokter, namaPoli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ambil_nomor_antrian);

        poliName = findViewById(R.id.tv_poliname);
        dokterFoto = findViewById(R.id.iv_dokterFoto);
        dokterNama = findViewById(R.id.tv_dokterNama);

        btn_back = findViewById(R.id.iv_back);
        btn_back.setOnClickListener(v -> {
            onBackPressed();
        });

        foto = getIntent().getIntExtra("dokterFoto",0);
        namaDokter = getIntent().getStringExtra("dokterNama");


        dokterFoto.setImageResource(foto);
        dokterNama.setText(namaDokter);

        btn_nomorAntrian = findViewById(R.id.btn_nomorAntrian);
        btn_nomorAntrian.setOnClickListener(v -> {
            Intent intent = new Intent (this,HomeActivity.class);
            intent.putExtra("Nomor Antrian",01);
            startActivity(intent);

            Toast.makeText(this, "Anda telah berhasil mengambil nomor Antrian", Toast.LENGTH_SHORT).show();
        });

    }
}
