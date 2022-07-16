package facci.erick.mera.pruebasunitariasmera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import facci.erick.mera.pruebasunitariasmera.Validaciones.Email;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText correo, contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo=findViewById(R.id.email);
        contraseña=findViewById(R.id.contra);
        btn=findViewById(R.id.bntEnviar);
    }
    public void Enviar(View view){
        Vacios();

    }




    private void Vacios() {
        if(Email.email(correo.getText().toString())){
            Toast.makeText(this,"Formato de Correo no valido", Toast.LENGTH_LONG).show();
        }else{
            if(Email.CamposVacios(contraseña.getText().toString())){
                Toast.makeText(this, "Contraseña Vacio, colocar su contraseña",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,"Enviado Correctamente",Toast.LENGTH_LONG).show();
            }
        }
    }

//    private void Vacios (){
//        if(correo.getText().toString().isEmpty()){
//            Toast.makeText(this, "campo de Correo vacio", Toast.LENGTH_LONG).show();
//        }else{
//            if(contraseña.getText().toString().isEmpty()){
//                Toast.makeText(this, "campo de contraeña vacio", Toast.LENGTH_LONG).show();
//            }else{
//                Toast.makeText(this, "Enviado Correctamente", Toast.LENGTH_LONG).show();
//            }
//        }
//    }
}