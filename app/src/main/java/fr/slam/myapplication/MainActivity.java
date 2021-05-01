package fr.slam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText etLogin;
    Button btnEnvoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLogin = (EditText) findViewById(R.id.idlogin);
        btnEnvoyer = (Button) findViewById(R.id.connexion);
    }


    public void connexion(View view) {

        String loginSaisie = etLogin.getText().toString();

        Bundle paquet = new Bundle();
        paquet.putString("idLogin", loginSaisie);

        String message = new String("Connexion réussie");
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();

        Intent connexion = new Intent(this, IndexVisiteurs.class);
        connexion.putExtras(paquet);
        startActivity(connexion);
    }

}