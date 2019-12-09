package com.example.butterknifetest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Nullable
    @BindView(R.id.txtName)
    EditText textUserName;

    @BindView(R.id.txtPhone)
    EditText textPhone;

    @BindView(R.id.txtAddress)
    EditText textAddress;

    @BindView(R.id.txtAge)
    EditText textAge;

    @BindView(R.id.btnSave)
    Button btnSave;

    @BindView(R.id.btnReset)
    Button btnReset;

    private String username;
    private String phone;
    private String address;
    private String age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    private void getDataFromEditTextField(){
        username = textUserName.getText().toString();
        phone = textPhone.getText().toString();
        address = textAddress.getText().toString();
        age = textAge.getText().toString();
    }

    private void clearUserEnteredValues(){
        textUserName.setText("");
        textPhone.setText("");
        textAddress.setText("");
        textAge.setText("");

    }

    @OnClick(R.id.btnSave)
    public void showUserEnteredValue(){
        getDataFromEditTextField();
        Toast.makeText(MainActivity.this,"Username : " + username + " \nPhone : " + phone + " \nAddress : " + address + " \nAge : " + age,Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.btnReset)
    public void resetUserValues(){
        clearUserEnteredValues();
    }

}
