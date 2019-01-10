package com.sholatyuk.sholatyuk;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnChangeLanguage;
    private TextView tvCurrentLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvCurrentLanguage = (TextView) findViewById(R.id.textview_current_language);
        btnChangeLanguage = (Button) findViewById(R.id.btn_change_language);

        tvCurrentLanguage.setText(getString(R.string.lbl_current_language) + "  " + Locale.getDefault().getDisplayLanguage());

        btnChangeLanguage.setOnClickListener(this);

        findViewById(R.id.btn_jadwal_sholat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v== btnChangeLanguage){
            Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intent);
        }
    }
}
