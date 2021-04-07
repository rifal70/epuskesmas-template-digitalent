package com.digitalent.epuskesmas.view.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.digitalent.epuskesmas.R;
import com.digitalent.epuskesmas.model.DokterModel;
import com.digitalent.epuskesmas.model.DokterRVAdapter;
import com.digitalent.epuskesmas.model.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class PilihDokterFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<DokterModel> dokterModelList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_pilih_dokter, container, false);
        recyclerView = v.findViewById(R.id.list_dokter);
        DokterRVAdapter dokterRVAdapter = new DokterRVAdapter(getContext(),dokterModelList);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),4));
        recyclerView.setAdapter(dokterRVAdapter);

        return v;
    }
    @Override
    public void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dokterModelList = new ArrayList<>();
        dokterModelList.add(new DokterModel(R.drawable.dokter_example,"dr. Herbanu"));
        dokterModelList.add(new DokterModel(R.drawable.dokter_2,"dr. Dea"));
        dokterModelList.add(new DokterModel(R.drawable.dokter_3,"dr. Dila"));
        dokterModelList.add(new DokterModel(R.drawable.dokter_4,"dr. Aswinah"));
        dokterModelList.add(new DokterModel(R.drawable.dokter_5,"dr. Linda"));
        dokterModelList.add(new DokterModel(R.drawable.dokter_6,"dr. Cahyo"));
    }
}