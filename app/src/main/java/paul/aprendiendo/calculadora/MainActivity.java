package paul.aprendiendo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView myTextView,myTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        myTextView = findViewById(R.id.myTextView);
        myTextView2 = findViewById(R.id.myTextView2);

        myTextView.setText("");
        myTextView2.setText("");

        Button boton1 = findViewById(R.id.button1);
        boton1.setOnClickListener(this);
        Button boton2 = findViewById(R.id.button2);
        boton2.setOnClickListener(this);
        Button boton3 = findViewById(R.id.button3);
        boton3.setOnClickListener(this);
        Button boton4 = findViewById(R.id.button4);
        boton4.setOnClickListener(this);
        Button boton5 = findViewById(R.id.button5);
        boton5.setOnClickListener(this);
        Button boton6 = findViewById(R.id.button6);
        boton6.setOnClickListener(this);
        Button boton7 = findViewById(R.id.button7);
        boton7.setOnClickListener(this);
        Button boton8 = findViewById(R.id.button8);
        boton8.setOnClickListener(this);
        Button boton9 = findViewById(R.id.button9);
        boton9.setOnClickListener(this);
        Button boton0 = findViewById(R.id.button0);
        boton0.setOnClickListener(this);
        Button botonSuma = findViewById(R.id.buttonSuma);
        botonSuma.setOnClickListener(this);
        Button botonResta = findViewById(R.id.buttonResta);
        botonResta.setOnClickListener(this);
        Button botonMultiplica = findViewById(R.id.buttonMultiplica);
        botonMultiplica.setOnClickListener(this);
        Button botonDivide = findViewById(R.id.buttonDivide);
        botonDivide.setOnClickListener(this);
        Button botonPunto = findViewById(R.id.buttonPunto);
        botonPunto.setOnClickListener(this);
        Button botonBorra = findViewById(R.id.buttonBorra);
        botonBorra.setOnClickListener(this);
        Button botonIgual = findViewById(R.id.buttonIgual);
        botonIgual.setOnClickListener(this);
    }

    double result, m1 = 0, m2 = 0;
    char op1 = '+';


    public void onClick(View v){

        if(v.getId() == R.id.button1)
            myTextView.append("1");
        else if(v.getId() == R.id.button2)
            myTextView.append("2");
        else if(v.getId() == R.id.button3)
            myTextView.append("3");
        else if(v.getId() == R.id.button4)
            myTextView.append("4");
        else if(v.getId() == R.id.button5)
            myTextView.append("5");
        else if(v.getId() == R.id.button6)
            myTextView.append("6");
        else if(v.getId() == R.id.button7)
            myTextView.append("7");
        else if(v.getId() == R.id.button8)
            myTextView.append("8");
        else if(v.getId() == R.id.button9)
            myTextView.append("9");
        else if(v.getId() == R.id.button0)
            myTextView.append("0");
        else if(v.getId() == R.id.buttonPunto)
            myTextView.append(".");
        else if(v.getId() == R.id.buttonBorra){
            myTextView2.setText("");
            myTextView.setText("");
            m1=0;
            op1='+';
        }

        else if(v.getId() == R.id.buttonSuma) Calcula('+');
        else if(v.getId() == R.id.buttonResta) Calcula('-');
        else if(v.getId() == R.id.buttonDivide) Calcula('/');
        else if(v.getId() == R.id.buttonMultiplica) Calcula('*');
        else if(v.getId() == R.id.buttonIgual) Calcula('=');

    }

    public void Calcula(char op){
        double result = m1;
        String cadena = myTextView.getText().toString();
        try{
            m2 = Double.parseDouble(cadena);
            if(op1 == '+')result = m1+m2;
            else if(op1=='-')result = m1-m2;
            else if(op1=='*')result = m1*m2;
            else if(op1=='/')result = m1/m2;
            m1=result; op1 = op;

            if(op=='='){
                myTextView.setText(""+m1);
                myTextView2.setText(""+m1);
            }else{
                myTextView.setText("");
                myTextView2.setText(""+m1+op1);
            }

        }catch(NumberFormatException nfe){
            Toast.makeText(this,"tecla incorrecta",Toast.LENGTH_LONG).show();
        }
    }
}
