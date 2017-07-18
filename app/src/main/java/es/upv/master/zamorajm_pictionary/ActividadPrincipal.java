package es.upv.master.zamorajm_pictionary;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ActividadPrincipal extends Activity {
    List<String> palabras = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        palabras.add("Refugio antiaéreo");
        palabras.add("Hormiga");
        palabras.add("Luciérnaga");
        palabras.add("Chile");
        palabras.add("Tigre");
        palabras.add("Castor");
        palabras.add("Italia");
        palabras.add("Abuelo");
        palabras.add("Galaxia");
        palabras.add("Casa");
        palabras.add("Coche");
        palabras.add("Ordenador");
    }
}