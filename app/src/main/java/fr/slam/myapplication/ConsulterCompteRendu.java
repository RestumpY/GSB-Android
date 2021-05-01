package fr.slam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConsulterCompteRendu extends AppCompatActivity {

    DatePicker date;
    Button validez;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulter_compte_rendu);

        validez = (Button) findViewById(R.id.bValidez);

    }

    public void bValidez(View vue){
        Intent intentValidez = new Intent(this, AfficheCompteRendu.class);
        startActivity(intentValidez);

    }

}
