package application.example.prueba_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ActivityActualizar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar);

        final EditText etidentificadorA= findViewById(R.id.etIdentificadorA),
                        etNombreA=findViewById(R.id.etNombreA),
                       etTelefonoA= findViewById(R.id.etTelefonoA);


    }
}