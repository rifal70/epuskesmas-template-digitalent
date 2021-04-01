package com.digitalent.epuskesmas.repo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.digitalent.epuskesmas.R;
import com.digitalent.epuskesmas.model.PuskesModel;

import java.util.ArrayList;

public class PuskesAdapter extends RecyclerView.Adapter<PuskesAdapter.Viewholder> {

    private Context context;
    private ArrayList<PuskesModel> puskesModelArrayList;



    public PuskesAdapter(ArrayList<PuskesModel> puskesModelArrayList) {
        this.context = context;
        this.puskesModelArrayList = puskesModelArrayList;
    }

    @NonNull
    @Override
    public PuskesAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_puskesmas_terdekat, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PuskesAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        holder.iv_Puskes.setImageResource(puskesModelArrayList.get(position).getIv_Puskes());
        holder.tv_Puskes.setText(puskesModelArrayList.get(position).getTv_Puskes());
        holder.tv_alamatPuskes.setText (puskesModelArrayList.get(position).getTv_alamatPuskes());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return 0;
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView iv_Puskes;
        private TextView tv_Puskes, tv_alamatPuskes;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            iv_Puskes = itemView.findViewById(R.id.puskesImage);
            tv_Puskes = itemView.findViewById(R.id.puskesNama);
            tv_alamatPuskes = itemView.findViewById(R.id.puskesAlamat);
        }
    }
}
