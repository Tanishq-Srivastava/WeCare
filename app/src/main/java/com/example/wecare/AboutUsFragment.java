package com.example.wecare;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import androidx.fragment.app.Fragment;

        import com.zoho.salesiqembed.ZohoSalesIQ;

        import java.util.Objects;


public class AboutUsFragment extends Fragment {


    public AboutUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_about_us, container, false);

        TextView txtView=(TextView)view.findViewById(R.id.team);
        txtView.setSelected(true);

        return view;
    }


}
