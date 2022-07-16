package facci.erick.mera.pruebasunitariasmera.Validaciones;

import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static boolean email(String textField){

        Pattern pattern = Pattern.compile("/[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}/g", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(textField);

        return textField.isEmpty() || matcher.find();

    }
    public static boolean CamposVacios (String usuarios){
            if(usuarios.length()>0){
                return false;
            }else{
                return true;
            }
        }
    }

//    public static boolean Vacios(String toString) {
//    }

