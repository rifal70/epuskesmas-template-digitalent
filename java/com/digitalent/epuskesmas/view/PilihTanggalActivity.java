package com.digitalent.epuskesmas.view;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.digitalent.epuskesmas.R;
import com.digitalent.epuskesmas.view.fragment.PilihDokterFragment;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class PilihTanggalActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private ImageView img_date;
    private ImageView img_headerPoli;
    private TextView tv_keterangan;
    private TextView tanggalTerpilih;
    LinearLayout pilihTanggal;
    ImageView iv_back;
    TextView tv_poliNama;

    String poliNama;
    FrameLayout frameLayout;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilih_tanggal);

        tanggalTerpilih = findViewById(R.id.tv_tanggalTerpilih);
        tv_poliNama = findViewById(R.id.tv_poliname);
        img_date = findViewById(R.id.ic_date);

        frameLayout = findViewById(R.id.pilihDokter_fLayout);
        pilihTanggal = findViewById(R.id.pilihTanggal_Layout);
        img_headerPoli = findViewById(R.id.img_headerPoli);
        tv_keterangan = findViewById(R.id.tv_keteranganPoli);



        iv_back =findViewById(R.id.iv_back);
        iv_back.setOnClickListener(v -> {
            Intent back = new Intent(this,DescriptionPuskesmas.class);
            startActivity(back);
            finish();
        });

        pilihTanggal.setOnClickListener(v -> {
            showDatePickerDialog();
        });

        poliNama = getIntent().getStringExtra("poliNama");
        tv_poliNama.setText(poliNama);

    }

    private void showDatePickerDialog() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = dayOfMonth + "/" + month + "/" + year;
        tanggalTerpilih.setText(date);

        getSupportFragmentManager().beginTransaction().replace(R.id.pilihDokter_fLayout,
                new PilihDokterFragment()).commit();
    }
}
