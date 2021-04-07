package com.digitalent.epuskesmas.model;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.digitalent.epuskesmas.R;
import com.digitalent.epuskesmas.view.AmbilNomorAntrian;

import java.util.List;

public class DokterRVAdapter extends RecyclerView.Adapter<DokterRVAdapter.DokterViewHolder> {

    private Context mContext;
    private List<DokterModel> mData;


    public DokterRVAdapter(Context mContext, List<DokterModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public DokterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        v = layoutInflater.inflate(R.layout.item_dokter,parent,false);

        return new DokterViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DokterViewHolder holder, int position) {
        holder.dokterFoto.setImageResource(mData.get(position).getDokterFoto());
        holder.dokterNama.setText(mData.get(position).getDokterNama());

        holder.pilihDokter.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, AmbilNomorAntrian.class);
            intent.putExtra("dokterFoto",mData.get(position).getDokterFoto());
            intent.putExtra("dokterNama",mData.get(position).getDokterNama());
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class DokterViewHolder extends RecyclerView.ViewHolder{

        TextView dokterNama;
        ImageView dokterFoto;
        LinearLayout pilihDokter;

        public DokterViewHolder(@NonNull View itemView) {
            super(itemView);

            dokterFoto = itemView.findViewById(R.id.iv_dokterFoto);
            dokterNama = itemView.findViewById(R.id.tv_namaDokter);
            pilihDokter = itemView.findViewById(R.id.item_Dokter);
        }
    }
}
