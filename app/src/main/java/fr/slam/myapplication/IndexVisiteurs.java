package fr.slam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class IndexVisiteurs extends AppCompatActivity {

    TextView tvLogin;
    Button btnConsulter;
    Button btnSaisir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_visiteurs);

        tvLogin = (TextView) findViewById(R.id.tvLogin);
        btnConsulter = (Button) findViewById(R.id.btnConsulter);
        btnSaisir = (Button) findViewById(R.id.btnSaisir);

        Bundle paquet = this.getIntent().getExtras();
        String Login = paquet.getString("idLogin");

        tvLogin.setText("Bienvenue , "+Login);
    }

    public void consulter(View view) {

        String message = new String("Consultation des comptes rendu");
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

        Intent consulter = new Intent(this, ConsulterCompteRendu.class);
        startActivity(consulter);
    }

    public void saisir(View view) {

        String message = new String("Consultation des comptes rendu");
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

        Intent saisir = new Intent(this, SaisirCompteRendu.class);
        startActivity(saisir);
    }



}