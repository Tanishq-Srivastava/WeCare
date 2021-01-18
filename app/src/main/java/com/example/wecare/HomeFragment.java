package com.example.wecare;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.Toast;

        import androidx.fragment.app.Fragment;
        import com.ramotion.foldingcell.FoldingCell;

public class HomeFragment extends Fragment{

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        final FoldingCell e1FoldingCell = view.findViewById(R.id.e1foldingcell);
        e1FoldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1FoldingCell.toggle(false);
            }
        });

        final FoldingCell e2FoldingCell = view.findViewById(R.id.e2foldingcell);
        e2FoldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2FoldingCell.toggle(false);
            }
        });

        Button b1 = (Button) view.findViewById(R.id.e1View);
        b1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Loading monitoring system", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getContext(),MapFragment.class);
                getActivity().startActivity(intent);
            }
    });

        Button b2 = (Button) view.findViewById(R.id.e2View);
        b2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Loading monitoring system", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getContext(),MapFragment.class);
                getActivity().startActivity(intent);
            }
        });

        return view;
    }
}
