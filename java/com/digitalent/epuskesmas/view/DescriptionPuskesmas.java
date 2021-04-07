package com.digitalent.epuskesmas.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.digitalent.epuskesmas.R;
import com.digitalent.epuskesmas.model.PoliModel;
import com.digitalent.epuskesmas.model.PoliRVAdapter;
import com.digitalent.epuskesmas.model.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


public class DescriptionPuskesmas extends AppCompatActivity {

    TextView tv_puskesAtas;
    TextView tv_puskesNamaBawah;
    ImageView iv_puskesImage;
    TextView tv_puskesAlamat;
    TextView tv_puskesNomor;
    ImageView iv_back;
    String puskesAtas, puskesNamaBawah, puskesAlamat, puskesNomor;
    int puskesImage;

    RecyclerView recyclerView;
    List<PoliModel> poliModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_puskesmas);

        tv_puskesAtas = findViewById(R.id.tv_puskesAtas);
        tv_puskesNamaBawah = findViewById(R.id.tv_puskesNamaBawah);
        iv_puskesImage = findViewById(R.id.img_headerPuskes);
        tv_puskesAlamat = findViewById(R.id.tv_puskesAlamat);
        tv_puskesNomor = findViewById(R.id.tv_puskesNomor);
        iv_back = findViewById(R.id.iv_back);


        puskesAtas = getIntent().getStringExtra("tv_puskesAtas");
        puskesNamaBawah = getIntent().getStringExtra("tv_puskesNamaBawah");
        puskesAlamat = getIntent().getStringExtra("tv_puskesAlamat");
        puskesImage = getIntent().getIntExtra("img_headerPuskes",0);

        tv_puskesAtas.setText(puskesAtas);
        tv_puskesNamaBawah.setText(puskesNamaBawah);
        tv_puskesAlamat.setText(puskesAlamat);
        tv_puskesNomor.setText("(021) 8350632");
        iv_puskesImage.setImageResource(puskesImage);


        iv_back.setOnClickListener(v -> {
            Intent kembali = new Intent (DescriptionPuskesmas.this,HomeActivity.class);
            startActivity(kembali);
            finish();
        });



        poliModelList = new ArrayList<>();
        poliModelList.add(new PoliModel(R.drawable.ic_poli_anak, "Poli Anak"));
        poliModelList.add(new PoliModel(R.drawable.ic_poli_penyakit_dalam, "Poli Penyakit Dalam"));
        poliModelList.add(new PoliModel(R.drawable.ic_poli_umum, "Poli Umum"));
        poliModelList.add(new PoliModel(R.drawable.ic_poli_gigi, "Poli Gigi"));

        recyclerView = findViewById(R.id.rv_poliklinik);
        PoliRVAdapter recyclerViewAdapter = new PoliRVAdapter(this,poliModelList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,4));
        recyclerView.setAdapter(recyclerViewAdapter);
    }


}