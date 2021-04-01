package com.digitalent.epuskesmas.view;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitalent.epuskesmas.R;
import com.digitalent.epuskesmas.view.fragment.DatePickerFragment;

public class PilihTanggalActivity extends AppCompatActivity {

    private ImageView img_date;
    private ImageView img_headerPoli;
    private TextView tv_keterangan;
    private EditText et_pilihTanggal;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pilih_tanggal);

        img_date = findViewById(R.id.date_picker);

        img_headerPoli = findViewById(R.id.img_headerPoli);
        tv_keterangan = findViewById(R.id.tv_keteranganPoli);
        et_pilihTanggal = findViewById(R.id.et_pilihTanggal);

        et_pilihTanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker();
            }
        });


    }

    private void DatePicker() {
        DatePickerFragment datePickerFragment = new DatePickerFragment();
        datePickerFragment.show(getSupportFragmentManager(), "data");
        datePickerFragment.setOnDateClickListener(new DatePickerFragment.onDateClickListener() {

            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                String tahun = "" + datePicker.getYear();
                String bulan = "" + (datePicker.getMonth()+1);
                String hari = ""+datePicker.getDayOfMonth();
                String text = hari+" / "+bulan+" / "+tahun;
                et_pilihTanggal.setText(text);
            }

        });
    }
}
