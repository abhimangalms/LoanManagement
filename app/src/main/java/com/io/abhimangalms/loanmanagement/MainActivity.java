package com.io.abhimangalms.loanmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button mLoanButton, mLoanStatusButton, mViewProfileButton, mLogoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLoanButton = findViewById(R.id.loanButton);
        mLoanStatusButton = findViewById(R.id.loanStatusButton);
        mViewProfileButton = findViewById(R.id.viewProfileButton);
        mLogoutButton = findViewById(R.id.logoutButton);


        mLoanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ApplyLoanActivity.class);
                startActivity(intent);
            }
        });

    mLoanStatusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoanStatusActivity.class);
                startActivity(intent);
            }
        });

    mViewProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyProfileActivity.class);
                startActivity(intent);
            }
        });



    }
}
