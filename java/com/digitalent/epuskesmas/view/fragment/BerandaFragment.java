 package com.digitalent.epuskesmas.view.fragment;

 import android.os.Bundle;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;

 import androidx.annotation.Nullable;
 import androidx.fragment.app.Fragment;
 import androidx.recyclerview.widget.GridLayoutManager;
 import androidx.recyclerview.widget.RecyclerView;

 import com.digitalent.epuskesmas.R;
 import com.digitalent.epuskesmas.model.PuskesModel;
 import com.digitalent.epuskesmas.model.RecyclerViewAdapter;

 import java.util.ArrayList;
 import java.util.List;

 import static com.digitalent.epuskesmas.R.id.recyclerView_puskes;

public class BerandaFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<PuskesModel> puskesModelList;
    public  BerandaFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_beranda, container, false);
        recyclerView = v.findViewById(recyclerView_puskes);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),puskesModelList);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setAdapter(recyclerViewAdapter);

        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        puskesModelList = new ArrayList<>();
        puskesModelList.add(new PuskesModel(R.drawable.puskesmas_tebet,"Puskesmas Tebet","Jalan Raya Tebet"));
        puskesModelList.add(new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Tebet","Jalan Raya Tebet"));
        puskesModelList.add(new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Tebet","Jalan Raya Tebet"));
        puskesModelList.add(new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Tebet","Jalan Raya Tebet"));
        puskesModelList.add(new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Tebet","Jalan Raya Tebet"));
        puskesModelList.add(new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Tebet","Jalan Raya Tebet"));
        puskesModelList.add(new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Tebet","Jalan Raya Tebet"));
        puskesModelList.add(new PuskesModel(R.drawable.ic_frame_login,"Puskesmas Tebet","Jalan Raya Tebet"));
    }


}
