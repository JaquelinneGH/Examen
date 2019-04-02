package mx.edu.tesoem.itics.jaquelinne.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resta extends AppCompatActivity {

    EditText val1, val2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);

        val1 = (EditText) findViewById(R.id.txtval1);
        val2 = (EditText) findViewById(R.id.txtval2);
        result = (TextView) findViewById(R.id.lblresult);
    }

    public void calculaSuma(View v){
        int a,b,r;
        a = Integer.parseInt(val1.getText().toString());
        b = Integer.parseInt(val2.getText().toString());
        r = a-b;
        result.setText(String.valueOf(r));
    }
}
