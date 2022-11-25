package edu.marta.practicas.appcursoformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etnombre;
    private EditText etapellidos;
    private EditText etfechanac;
    private EditText etLocalidad;
    private EditText etCodigoPostal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.etnombre = findViewById(R.id.textViewNombre);
        this.etapellidos = findViewById(R.id.textViewApellidos);
        this.etfechanac = findViewById(R.id.textViewFechaNac);
        this.etLocalidad = findViewById(R.id.textViewLocalidad);
        this.etCodigoPostal = findViewById(R.id.textViewCodigoPostal);
    }

    public void botonAceptarPulsado(View view) {
        //TODO obtener los valores
        //CAMBIAR A OTRA PANTALLA CON ELLOS
        //1 obtener infoUsuario
        String nombre = this.etnombre.getText().toString();
        String apellidos = this.etapellidos.getText().toString();
        String fecha_nac = this.etfechanac.getText().toString();
        String localidad = this.etLocalidad.getText().toString();
        String cp_string = this.etCodigoPostal.getText().toString();
        //pasamos de String a número el codigo postal
        int cp_numerico = Integer.parseInt(cp_string);

        //construimos el objeto InfoUsuario
        InfoUsuario infoUsuario = new InfoUsuario(nombre, apellidos, fecha_nac, localidad, cp_numerico);
        Log.d("MIAPP", infoUsuario.toString());

        //intent
        //para ir de la pantalla 1 a la 2, necesito tirar el INtent
        Intent intent = new Intent(this, Actividad2.class);
        intent.putExtra("info_usuario", infoUsuario);
        startActivity(intent);//transitando a la pantalla 2
    }

    /**ENUNCIADO
     *
     * El alumno debe crear un nuevo proyecto de aplicación en el que aparezca un formulario que pida los datos personales del usuario
     * , mínimo: nombre, apellidos, fecha de nacimiento, localidad y código postal,
     * aparecerá un botón que pida Aceptar y una vez pulsado este botón aparecerán los datos rellenos en una nueva pantalla en blanco
     * como en el siguiente ejemplo:
     *
     * Nombre: Antonio
     *
     * Apellidos: Ramos García
     *
     * Fecha de nacimiento: 25/02/2000
     *
     * Localidad: Íllora
     *
     * Código postal: 18260
     *
     * En esta misma pantalla también estarán los botones de Confirmar,
     * para indicar que los datos son correctos o Cancelar para que vuelvan a rellenarse los datos de nuevo.
     *
     *
     * **/
}