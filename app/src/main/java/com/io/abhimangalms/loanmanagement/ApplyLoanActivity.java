package com.io.abhimangalms.loanmanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ApplyLoanActivity extends AppCompatActivity {
    Spinner mLoanTypeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_loan);



        mLoanTypeSpinner = findViewById(R.id.loanTypeSpinner);

        String[] loanTypesArray = {"Select type of loan", "Personal loan", "Vehicle loan", "Home loan", "Marriage loan", "Educational loan"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,loanTypesArray);

        mLoanTypeSpinner.setAdapter(adapter);
    }
}
