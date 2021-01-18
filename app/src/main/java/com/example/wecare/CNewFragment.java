package com.example.wecare;
import android.content.Context;
        import android.os.Bundle;
        import android.os.Handler;
        import android.view.ContextThemeWrapper;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class CNewFragment extends Fragment {


    public CNewFragment() {
        // Required empty public constructor
    }

    EditText name,code;
    Button addProfile;
    DatabaseReference db;
    DatabaseEntries firebase;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final Context contextThemeWrapper=new ContextThemeWrapper(getActivity(),R.style.yourCustomTheme);
        LayoutInflater localInflater=inflater.cloneInContext(contextThemeWrapper);
        View view = localInflater.inflate(R.layout.fragment_createnewprofile, container, false);

        name = view.findViewById(R.id.pn);
        code = view.findViewById(R.id.bac);
        addProfile = (Button)view.findViewById(R.id.button2);
        firebase = new DatabaseEntries();
        db = FirebaseDatabase.getInstance().getReference().child("Mobile App Development Project");

        addProfile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String pname = name.getText().toString().trim();
                String bcode=code.getText().toString().trim();
                if(!pname.isEmpty() && bcode.length() == 9 && bcode.startsWith("XN3")) {
                    firebase.setName(pname);
                    firebase.setBeltCode(bcode);
                    db.push().setValue(firebase);
                    Toast.makeText(getContext(), "Profile added successfully!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getContext(), "Profile could not added! Please try again", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}