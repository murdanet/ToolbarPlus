package com.example.toolbarplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        



    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            //Bucle e Intents para poder ir a otras actividades desde los action buttons del toolbar
            case R.id.actionbtn_cardboard:
                Intent i = new Intent (Perfil.this,Cardboard.class);
                startActivity(i);
                return true;
            case R.id.actionbtn_inicios:
                Intent i2 = new Intent (Perfil.this, Inicio.class);
                startActivity(i2);
                return true;
            case R.id.actionbtn_paginaprincipal:
                Intent i3 = new Intent (Perfil.this, MainActivity.class);
                startActivity(i3);
                return true;
            case R.id.actionbtn_musica:
                Intent i4 = new Intent( Perfil.this, Musica.class);
                startActivity(i4);
                return true;
            case R.id.busqueda:
                Intent i5= new Intent(Perfil.this,Busqueda.class);
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

