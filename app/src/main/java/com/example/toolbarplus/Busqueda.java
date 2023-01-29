package com.example.toolbarplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Busqueda extends AppCompatActivity {
    SearchView busqueda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Busqueda");
                toolbar.setPopupTheme(androidx.appcompat.R.style.ThemeOverlay_AppCompat_Light);

    //Principal, Inicios,Musica, Perfil, Cardboard, así seras redirigido a las otras pantallas
              /*  List<Search> searchList= new ArrayList<Search>();
                searchList.add(new Search(("Principal",MainActivity.class));
                searchList.add(new Search("Musica",Musica.class));
                searchList.add(new Search("Perfil",Perfil.class));
                searchList.add(new Search("Cardboard", Cardboard.class));

                */
/*

                SearchView busqueda = findViewById(R.id.busqueda);

                busqueda.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        Object element = null;
                        for (Search search: searchList){
                        if ()}
                    }

                    @Override
                    public boolean onQueryTextChange(String newText) {
                        return false;
                    }
                });*/









    }
    class Search {
        String keyword;
        Class activity;
        public Search(String keyword, Class activity) {
            this.keyword = keyword;
            this.activity = activity;
        }
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            //Intents para poder ir a otras actividades desde los action buttons del toolbar
            case R.id.actionbtn_cardboard:
                Intent i = new Intent (Busqueda.this,Cardboard.class);
                startActivity(i);
                return true;
            case R.id.actionbtn_inicios:
                Intent i2 = new Intent (Busqueda.this, Inicio.class);
                startActivity(i2);
                return true;
            case R.id.actionbtn_paginaprincipal:
                Intent i3 = new Intent (Busqueda.this, MainActivity.class);
                startActivity(i3);
                return true;
            case R.id.actionbtn_musica:
                Intent i4 = new Intent( Busqueda.this, Musica.class);
                startActivity(i4);
                return true;
            case R.id.busqueda:
                Intent i5= new Intent(Busqueda.this,Busqueda.class);
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



}