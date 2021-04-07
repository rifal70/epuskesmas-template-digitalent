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
import com.digitalent.epuskesmas.view.PilihTanggalActivity;

import java.util.List;

public class PoliRVAdapter extends RecyclerView.Adapter<PoliRVAdapter.PoliViewHolder> {

    private Context mContext;
    private List<PoliModel> mData;

    public PoliRVAdapter(Context mContext, List<PoliModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public PoliViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        v = layoutInflater.inflate(R.layout.item_poli,parent, false);

        return new PoliViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PoliViewHolder holder, int position) {

        holder.poliImage.setImageResource(mData.get(position).getPoliImage());
        holder.poliNama.setText(mData.get(position).getPoliNama());

        holder.poliItem.setOnClickListener(v -> {
            Intent intent = new Intent(mContext, PilihTanggalActivity.class);
            intent.putExtra("poliNama",mData.get(position).getPoliNama());
            intent.putExtra("poliImage",mData.get(position).getPoliImage());
            mContext.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class PoliViewHolder extends RecyclerView.ViewHolder {

        TextView poliNama;
        ImageView poliImage;
        LinearLayout poliItem;

        public PoliViewHolder(@NonNull View itemView) {
            super(itemView);

            poliImage = itemView.findViewById(R.id.poliImage);
            poliNama = itemView.findViewById(R.id.poliNama);
            poliItem = itemView.findViewById(R.id.poliItem);
        }
    }

}
