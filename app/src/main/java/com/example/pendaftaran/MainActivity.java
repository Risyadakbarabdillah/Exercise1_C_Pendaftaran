package com.example.pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText edfirstname, edlastname, edtmptl, edtgll, addres, edemail, edtlp, edpassword, edpassword2;
    Button kembali, daftar;
    DatePickerDialog picker;
    RadioGroup  RadioGroupagama, RadioGroup1, RadioGroup2, RadioGroup3, RadioGroup4;
    RadioButton islam, kristen, konghucu, buddha, aliran, katolik, hindu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edfirstname = findViewById(R.id.edND);
        edlastname = findViewById(R.id.edNB);
        edtmptl = findViewById(R.id.edtl);
        edtgll = findViewById(R.id.ttl);
        edemail = findViewById(R.id.edemail);
        edtlp = findViewById(R.id.edtlp);
        edpassword = findViewById(R.id.edpass);
        edpassword2 = findViewById(R.id.edelpass2);
        kembali = findViewById(R.id.kembali);
        daftar = findViewById(R.id.daftar);
        addres =  findViewById(R.id.edalm);
        RadioGroup1 = findViewById(R.id.RadioGroup1);
        RadioGroup2 = findViewById(R.id.RadioGroup2);
        RadioGroup3 = findViewById(R.id.RadioGroup3);
        RadioGroup4 = findViewById(R.id.RadioGroup4);
        RadioGroupagama = findViewById(R.id.RadioGroupagama);
        islam = findViewById(R.id.islam);
        kristen = findViewById(R.id.kristen);
        katolik = findViewById(R.id.katolik);
        hindu = findViewById(R.id.hindu);
        buddha = findViewById(R.id.buddha);
        konghucu = findViewById(R.id.konghucu);
        aliran = findViewById(R.id.aliran_kepercayaan);

        edtgll.setInputType(InputType.TYPE_NULL);
        edtgll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                edtgll.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edfirstname.getText().toString().length() == 0) {
                    edfirstname.setError("Nama depan Harus diisi");
                } else {

                }
                if (edlastname.getText().toString().length() == 0) {
                    edlastname.setError("Nama belakang Harus diisi");
                } else {

                }
                if (edtmptl.getText().toString().length() == 0) {
                    edtmptl.setError("Tempat Lahir Harus diisi");
                } else {

                }
                if (edtgll.getText().toString().length() == 0) {
                    edtgll.setError("Tanggal Harus diisi");
                } else {

                }
                if (addres.getText().toString().length() == 0) {
                    addres.setError("Alamat Harus diisi");
                } else {

                }

                if (edtlp.getText().toString().length() == 0) {
                    edtlp.setError("No Telp Harus diisi");
                } else {

                }
                if (edemail.getText().toString().length() == 0) {
                    edemail.setError("Email Harus diisi");
                } else {

                }
                if (edpassword.getText().toString().length() == 0) {
                    edpassword.setError("Password Harus diisi");
                } else {

                }
            }
        });
    }


}
