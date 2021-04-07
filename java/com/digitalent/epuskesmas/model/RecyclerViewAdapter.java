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
import com.digitalent.epuskesmas.view.DescriptionPuskesmas;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<PuskesModel> mData;


    public RecyclerViewAdapter(Context mContext, List<PuskesModel> mData){
        this.mContext = mContext;
        this.mData = mData;
        }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.items_puskesmas_terdekat,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.puskesImage.setImageResource(mData.get(position).getPuskesImage());
        holder.puskesNama.setText(mData.get(position).getPuskesNama());
        holder.puskesAlamat.setText(mData.get(position).getPuskesAlamat());

        holder.puskesTerdekat.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, DescriptionPuskesmas.class);
            intent.putExtra("tv_puskesAtas",mData.get(position).getPuskesNama());
            intent.putExtra("img_headerPuskes",mData.get(position).getPuskesImage());
            intent.putExtra("tv_puskesNamaBawah",mData.get(position).getPuskesNama());
            intent.putExtra("tv_puskesAlamat",mData.get(position).getPuskesAlamat());
            mContext.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder{

        Context context = itemView.getContext();
        private ImageView puskesImage;
        private TextView puskesNama;
        private TextView puskesAlamat;
        private LinearLayout puskesTerdekat;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            puskesImage = itemView.findViewById(R.id.puskesImage);
            puskesNama = itemView.findViewById(R.id.puskesNama);
            puskesAlamat = itemView.findViewById(R.id.puskesAlamat);
            puskesTerdekat = itemView.findViewById(R.id.puskesTerdekat);

       }

    }

}
