package com.example.toolbarplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Inicio");
        toolbar.setPopupTheme(androidx.appcompat.R.style.ThemeOverlay_AppCompat_Light);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);






    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            //Intents para poder ir a otras actividades desde los action buttons del toolbar
            case R.id.actionbtn_cardboard:
                Intent i = new Intent (Inicio.this,Cardboard.class);
                startActivity(i);
                return true;
            case R.id.actionbtn_inicios:
                Intent i2 = new Intent (Inicio.this, Inicio.class);
                startActivity(i2);
                return true;
            case R.id.actionbtn_paginaprincipal:
                Intent i3 = new Intent (Inicio.this, MainActivity.class);
                startActivity(i3);
                return true;
            case R.id.actionbtn_musica:
                Intent i4 = new Intent( Inicio.this, Musica.class);
                startActivity(i4);
                return true;
            case R.id.busqueda:
                Intent i5= new Intent(Inicio.this,Busqueda.class);
                startActivity(i5);
            case R.id.action_item_listentomusic:
                String url2="https://www.youtube.com/watch?v=p8fho0Nvgy8";
                Intent i6 = new Intent (Intent.ACTION_VIEW);
                i6.setData(Uri.parse(url2));
                startActivity(i6);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }





}
