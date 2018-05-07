package unidad3.gio.tala.examena3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class op extends AppCompatActivity {
public TextView operacion;
public TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op);
        operacion=(TextView)findViewById(R.id.txtOperacion);
        resultado=(TextView)findViewById(R.id.txtResultado);
        Intent i = getIntent();
        String opr=i.getStringExtra("resultado");
        String res=i.getStringExtra("operacion");
        operacion.setText(opr);
        resultado.setText("Resultado; "+res);
    }
}
