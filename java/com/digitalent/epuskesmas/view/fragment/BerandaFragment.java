package com.digitalent.epuskesmas.view.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.digitalent.epuskesmas.R;
import com.digitalent.epuskesmas.model.PuskesModel;
import com.digitalent.epuskesmas.repo.PuskesAdapter;

import java.util.ArrayList;

import static com.digitalent.epuskesmas.R.id.*;

public class BerandaFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<PuskesModel> puskesHolder;

    public BerandaFragment() {

    }

    public static BerandaFragment newInstance(String param1, String param2) {
        BerandaFragment fragment = new BerandaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_beranda, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        puskesHolder = new ArrayList<>();
//
//        PuskesModel puskes1 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes1);
//        PuskesModel puskes2 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes2);
//        PuskesModel puskes3 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes3);
//        PuskesModel puskes4 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes4);
//        PuskesModel puskes5 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes5);
//        PuskesModel puskes6 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes6);
//        PuskesModel puskes7 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes7);
//        PuskesModel puskes8 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes8);
//        PuskesModel puskes9 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes9);
//        PuskesModel puskes10 = new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Maju Mundur",
//                "Jalan Kebangsaan 12");
//        puskesHolder.add(puskes10);


        recyclerView.setAdapter(new PuskesAdapter(puskesHolder));


        return view;

    }
}