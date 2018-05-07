package unidad3.gio.tala.examena3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
   public EditText txtA;
   public  EditText txtB;
   public RadioButton suma;
   public RadioButton resta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtA=(EditText)findViewById(R.id.txtA);
        txtB=(EditText)findViewById(R.id.txtB);
    }
    public void cal(View x){
        int a=Integer.parseInt(txtA.getText().toString());
        int b=Integer.parseInt(txtB.getText().toString());
        int r;
        r=a+b;
        Intent m=new Intent(this,op.class);
      //  m.putExtra("resultado"=r.toString());
    }
}
