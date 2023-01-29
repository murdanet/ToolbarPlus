package com.example.toolbarplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button albumcompleto;
Button comenzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

      //Poniendo titulo a mi Toolbar
        toolbar.setTitle("Superdog");
        setSupportActionBar(toolbar);


        //Asociar boton inicio y pasar a siguiente activity
        comenzar= findViewById(R.id.btn_comenzar);
        comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a= new Intent (MainActivity.this,Inicio.class);
                startActivity(a);
            }
        });







        //Metodo para que asociar boton y que abra el link de Superdog en youtube

        albumcompleto= findViewById(R.id.btn_album);
        albumcompleto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/watch?v=p8fho0Nvgy8";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }


        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            //Intents para poder ir a otras actividades desde los action buttons del toolbar
            case R.id.actionbtn_cardboard:
                Intent i = new Intent (MainActivity.this,Cardboard.class);
                startActivity(i);
                return true;
            case R.id.actionbtn_inicios:
                Intent i2 = new Intent (MainActivity.this, Inicio.class);
                startActivity(i2);
                return true;
            case R.id.actionbtn_paginaprincipal:
                Intent i3 = new Intent (MainActivity.this, MainActivity.class);
                startActivity(i3);
                return true;
            case R.id.actionbtn_musica:
                Intent i4 = new Intent( MainActivity.this, Musica.class);
                startActivity(i4);
                return true;
            case R.id.busqueda:
                Intent i5= new Intent(MainActivity.this,Busqueda.class);
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