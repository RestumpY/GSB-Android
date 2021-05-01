package fr.slam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SaisirCompteRendu extends AppCompatActivity {

    Button bRetour;
    Button bValider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisir_compte_rendu);

        bRetour = (Button) findViewById(R.id.idRetour);
        bValider = (Button) findViewById(R.id.idValider);
    }

    public void bRetour(View vue){
        Intent intentRetour = new Intent(this, IndexVisiteurs.class);
        startActivity(intentRetour);

        String message;
        message = new String("Retour à l'index");
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void bValider(View vue){
        Intent intentValider = new Intent(this, ConfirmationCompteRendu.class);
        startActivity(intentValider);

        String message;
        message = new String("Saisie du compte rendu confirmée");
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

}