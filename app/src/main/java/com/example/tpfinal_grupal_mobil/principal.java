package com.example.tpfinal_grupal_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tpfinal_grupal_mobil.entidades.categoria.PantallaPrincipalCategoria;
import com.example.tpfinal_grupal_mobil.entidades.distribuidora.PantallaPrincipalDistribuidora;
import com.example.tpfinal_grupal_mobil.entidades.entornodedatos;
import com.example.tpfinal_grupal_mobil.entidades.usuario.UsuarioBuscar;

public class principal extends AppCompatActivity implements View.OnClickListener{

    Button BotonIrADistribuidora;
    Button BotonIrACategoria;
    Button BotonIraUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        BotonIrADistribuidora = findViewById(R.id.BotonIraDistribuidora);
        BotonIrADistribuidora.setOnClickListener(this);

        BotonIrACategoria = findViewById(R.id.BotonIraCategoria);
        BotonIrACategoria.setOnClickListener(this);
        BotonIraUsuario=findViewById(R.id.BotonIraUsuario);
        entornodedatos.BuscarDistribuidora(getApplicationContext()," ");
        BotonIraUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iradistribuidora = new Intent(getApplicationContext(), UsuarioBuscar.class);
                startActivity(iradistribuidora);
            }
        });


    }

    @Override
    public void onClick(View v)
    {
        if (v.getId()==BotonIrADistribuidora.getId())
        {
            Intent iradistribuidora = new Intent(this, PantallaPrincipalDistribuidora.class);
            startActivity(iradistribuidora);
        }

        if (v.getId()==BotonIrACategoria.getId())
        {
            Intent iracategoria = new Intent(this, PantallaPrincipalCategoria.class);
            startActivity(iracategoria);
        }
    }
}
