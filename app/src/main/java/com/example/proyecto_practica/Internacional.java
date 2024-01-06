package com.example.proyecto_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.TextView;

public class Internacional extends AppCompatActivity {

    private Spinner spi1,spi2,spi3, spi4, spi5, spi6;
    private Button botonlong,botonmasa,botonpres;
    private EditText valor1,valor2,valor3;
    private TextView res_long, res_masa, res_presion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional);

         spi1=findViewById(R.id.Spi_longdef);
         spi2=findViewById(R.id.Spi_longconver);
         spi3=findViewById(R.id.Spi_masadef);
         spi4=findViewById(R.id.Spi_masaconver);
         spi5=findViewById(R.id.Spi_predef);
         spi6=findViewById(R.id.Spi_preconver);
         botonlong=findViewById(R.id.convert_long);
         botonmasa=findViewById(R.id.convert_masa);
         botonpres=findViewById(R.id.convert_presion);
         valor1=findViewById(R.id.tx_valor1);
         valor2=findViewById(R.id.tx_valor2);
         valor3=findViewById(R.id.tx_valor3);
         res_long=findViewById(R.id.Result_long);
         res_masa=findViewById(R.id.Result_masa);
         res_presion=findViewById(R.id.Result_presion);


        // Opciones de Longitud masa y presion
        String[] opcion1={"Kilometro","Metro","Centimetro","Milimetro"};
        String[] opcion2={"Kilometro","Metro","Centimetro","Milimetro"};

        String[] opcion3={"Tonelada", "Kilogramo", "Gramo", "Miligramo"};
        String[] opcion4={"Tonelada", "Kilogramo", "Gramo", "Miligramo"};

        String[] opcion5={"Pascal", " Atmosfera","Libra x pulgada cuadrada","Bar","Torr"};
        String[] opcion6={"Pascal", " Atmosfera","Libra x pulgada cuadrada","Bar","Torr"};




        //Adaptador para cada Spinner
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcion1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcion2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcion3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcion4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcion5);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opcion6);


        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spi1.setAdapter(adapter1);
        spi2.setAdapter(adapter2);
        spi3.setAdapter(adapter3);
        spi4.setAdapter(adapter4);
        spi5.setAdapter(adapter5);
        spi6.setAdapter(adapter6);


        botonlong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                longitud();
            }
        });


        botonmasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masa();
            }
        });

    }


    public boolean longitud() {
        int valors1;
        double valors2;
        int resultado;
        valors1 = Integer.parseInt(valor1.getText().toString());

        String select = spi1.getSelectedItem().toString();
        String select1 = spi2.getSelectedItem().toString();

        if (select.equals("Kilometro") && select1.equals("Centimetro")){
            resultado= valors1 * 100000;
            res_long.setText(String.valueOf(resultado));
        }else {
           if (select.equals("Kilometro") && select1.equals("Metro")){
               resultado= valors1 * 1000;
               res_long.setText(String.valueOf(resultado));
           }else {
               if (select.equals("Kilometro") && select1.equals("Milimetro")){
                   resultado= valors1 * 1000000;
                   res_long.setText(String.valueOf(resultado));
               }else {
                   if (select.equals("Kilometro") && select1.equals("Kilometro")){
                       res_long.setText("Mismas unidades");
                   }
               }
           }

        }


        if (select.equals("Metro") && select1.equals("Kilometro")){
            valors2= 0.001;
            resultado= (int) (valors1 * valors2);
            res_long.setText(String.valueOf(resultado));
        }else{
            if (select.equals("Metro") && select1.equals("Centimetro")){
                resultado= valors1 *100;
                res_long.setText(String.valueOf(resultado));
            }else {
                if (select.equals("Metro") && select1.equals("Milimetro")){
                    resultado=valors1*1000;
                    res_long.setText(String.valueOf(resultado));
                }else {
                    if (select.equals("Metro") && select1.equals("Metro")){
                        res_long.setText("Mismas unidades");
                    }
                }
            }

        }

        if (select.equals("Centimetro") && select1.equals("Kilometro")){
            resultado= valors1 / 100000;
            res_long.setText(String.valueOf(resultado));
        }else {
            if (select.equals("Centimetro") && select1.equals("Metro")){
                valors2= 0.01;
                resultado=(int)(valors1 * valors2);
                res_long.setText(String.valueOf(resultado));
            }else {
                if (select.equals("Centimetro") && select1.equals("Milimetro")){
                    resultado=valors1 * 10;
                    res_long.setText(String.valueOf(resultado));
                }else {
                    if (select.equals("Centimetro") && select1.equals("Centimetro")){
                        res_long.setText("Mismas unidades");
                    }
                }
            }
        }



        if (select.equals("Milimetro") && select1.equals("Kilometro")){
            resultado= valors1 / 1000000;
            res_long.setText(String.valueOf(resultado));
        }else {
            if (select.equals("Milimetro") && select1.equals("Metro")){
                valors2 = 0.001;
                resultado= (int) (valors1 * valors2);
                res_long.setText(String.valueOf(resultado));
            }else {
                if (select.equals("Milimetro") && select1.equals("Centimetro")){
                    valors2= 0.1;
                    resultado= (int) (valors1 * valors2);
                    res_long.setText(String.valueOf(resultado));
                }else {
                    if (select.equals("Milimetor") && select1.equals("Milimetro")){
                        res_long.setText("Mismas unidades");
                    }
                }
            }
        }


        return false;

    }




    public boolean masa(){
        int valors1;
        double valors2;
        int resultado;
        valors1 = Integer.parseInt(valor2.getText().toString());

        String select = spi3.getSelectedItem().toString();
        String select1 = spi4.getSelectedItem().toString();


        if (select.equals("Tonelada") && select1.equals("Kilogramo")){
            resultado= valors1 *1000 ;
            res_masa.setText(String.valueOf(resultado));
        }else {
            if (select.equals("Tonelada") && select1.equals("Gramo")){
                resultado= valors1 * 1_000_000;
                res_masa.setText(String.valueOf(resultado));
            }else {
                if (select.equals("Tonelada") && select1.equals("Miligramo")){
                    resultado= valors1 * 1_000_000_000;
                    res_masa.setText(String.valueOf(resultado));
                }
            }
        }

        return false;
    }

}