package mx.edu.edwinponceittepic.tpdm_u1_practica1_edwinponce;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    EditText num1,num2;
    Button btnsum, btnres, btnmul, btndiv;
    TextView resultado;

    @SuppressLint("WrongViewCast")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 =(EditText) findViewById(R.id.textnum1);
        num2 =(EditText) findViewById(R.id.textnum2);

        btnsum =(Button) findViewById(R.id.botonsum);
        btnres =(Button) findViewById(R.id.botonres);
        btnmul =(Button) findViewById(R.id.botonmul);
        btndiv =(Button) findViewById(R.id.botondiv);
        resultado =(TextView) findViewById(R.id.resultado);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x1 = Integer.parseInt(num1.getText().toString());
                int x2 = Integer.parseInt(num2.getText().toString());
                int res = x1 + x2;
                resultado.setText(""+res);
            }
        });

        btnres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x1 = Integer.parseInt(num1.getText().toString());
                int x2 = Integer.parseInt(num2.getText().toString());
                int res = x1 - x2;
                resultado.setText(""+res);
            }
        });


        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x1 = Integer.parseInt(num1.getText().toString());
                int x2 = Integer.parseInt(num2.getText().toString());
                int res = x1 * x2;
                resultado.setText(""+res);
            }
        });


        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x1 = Integer.parseInt(num1.getText().toString());
                int x2 = Integer.parseInt(num2.getText().toString());
                int res = x1 / x2;
                resultado.setText(""+res);
            }
        });



    }
}
