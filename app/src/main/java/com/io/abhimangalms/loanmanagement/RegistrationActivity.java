package com.io.abhimangalms.loanmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    TextView mLoginTextView;
    EditText mFullNameEditText, mEmailIdEditText, mPhoneNumberEditText, mAccountNumberEditText, mBranchNameEditText, mPasswordEditText;
    Button mRegisterButton;
    String fullName, emailId, phoneNumber, accountNumber, branchName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mRegisterButton = findViewById(R.id.registerButton);
        mFullNameEditText = findViewById(R.id.fullNameEditText);
        mEmailIdEditText = findViewById(R.id.emailIdEditText);
        mPhoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        mAccountNumberEditText = findViewById(R.id.accountNumberEditText);
        mBranchNameEditText = findViewById(R.id.branchNameEditText);
        mPasswordEditText = findViewById(R.id.passwordEditText);
        mLoginTextView = findViewById(R.id.loginTextView);

        mLoginTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);

            }
        });

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fullName = mFullNameEditText.getText().toString();
                emailId = mEmailIdEditText.getText().toString();
                phoneNumber = mPhoneNumberEditText.getText().toString();
                accountNumber = mAccountNumberEditText.getText().toString();
                branchName = mBranchNameEditText.getText().toString();
                password = mPasswordEditText.getText().toString();

                /**TODO:*/
//              Calling registration api

            }
        });
    }
}
