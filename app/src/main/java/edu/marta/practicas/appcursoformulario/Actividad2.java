package edu.marta.practicas.appcursoformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity {

    private TextView tvnombre;
    private TextView tvapellidos;
    private TextView tvfechanac;
    private TextView tvLocalidad;
    private TextView tvCodigoPostal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        this.tvnombre = findViewById(R.id.textViewNombre);
        this.tvapellidos = findViewById(R.id.textViewApellidos);
        this.tvfechanac = findViewById(R.id.textViewFechaNac);
        this.tvLocalidad = findViewById(R.id.textViewLocalidad);
        this.tvCodigoPostal = findViewById(R.id.textViewCodigoPostal);

        InfoUsuario infoUsuario = getIntent().getParcelableExtra("info_usuario");
        Log.d("MIAPP", "ACTIVIDAD 2 " + infoUsuario.toString());

        this.tvnombre.setText("Nombre: " +infoUsuario.getNombre());
        this.tvapellidos.setText("Apellidos: " +infoUsuario.getApellido());
        this.tvfechanac.setText("Fecha de nacimiento: " +infoUsuario.getFecha());
        this.tvLocalidad.setText("Localidad: " +infoUsuario.getLocalidad());
        this.tvCodigoPostal.setText("Código Postal: " +infoUsuario.getCodigo_postal());


    }

    public void botonCancelarPulsado(View view) {
        finish();//cierro esta ventana
    }

    public void botonConfirmarPulsado(View view) {
        Toast toast = Toast.makeText(this, "DATOS GUARDADOS", Toast.LENGTH_LONG);
        toast.show();
    }
}