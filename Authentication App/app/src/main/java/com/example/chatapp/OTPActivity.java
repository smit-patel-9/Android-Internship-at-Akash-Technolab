package com.example.chatapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.example.chatapp.databinding.ActivityOTPBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.mukesh.OnOtpCompletionListener;

import java.util.concurrent.TimeUnit;

public class OTPActivity extends AppCompatActivity {

    ActivityOTPBinding binding;
    FirebaseAuth auth;

    String verificationId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        auth = FirebaseAuth.getInstance();

        binding = ActivityOTPBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String phoneNumber = getIntent().getStringExtra("phoneNumber");

        binding.phoneLbl.setText("Verify +91" + phoneNumber);

        PhoneAuthOptions options = PhoneAuthOptions.newBuilder(auth)
                .setPhoneNumber(phoneNumber)
                .setTimeout(60L, TimeUnit.SECONDS)
                .setActivity(OTPActivity.this)
                .setCallbacks(new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    @Override
                    public void onVerificationCompleted(@NonNull PhoneAuthCredential credential) { //phoneAuthCredential to credential

//                        signInWithPhoneAuthCredential(credential); //add

                    }

                    @Override
                    public void onVerificationFailed(@NonNull FirebaseException e) {

                    }

                    @Override
                    public void onCodeSent(@NonNull String verifyId, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                        super.onCodeSent(verifyId, forceResendingToken);

//                        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
//                        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
//                        binding.otpView.requestFocus();

                        verificationId = verifyId;
                    }
                }).build();

        PhoneAuthProvider.verifyPhoneNumber(options);

        binding.otpView.setOtpCompletionListener(new OnOtpCompletionListener() {
            @Override
            public void onOtpCompleted(String otp) {
                PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId, otp);

                auth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Toast.makeText(OTPActivity.this, "Logged In.", Toast.LENGTH_SHORT).show();
                        if (task.isSuccessful()) {
                            Toast.makeText(OTPActivity.this, "Logged In.", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(OTPActivity.this,MainActivity.class);
                            startActivity(intent);

                            FirebaseUser user = task.getResult().getUser();
                        }else {
                            Toast.makeText(OTPActivity.this, "Failed.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }

}