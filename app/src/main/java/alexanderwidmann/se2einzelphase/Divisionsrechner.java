package alexanderwidmann.se2einzelphase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
public class Divisionsrechner extends AppCompatActivity {
    //Benötigte Felder laden (2 Input felder und das Output Feld)
    EditText divisor= (EditText) findViewById(R.id.eTDivisor);
    EditText dividend= (EditText) findViewById(R.id.eTDividend);
    TextView output=(TextView)findViewById(R.id.tVShowOutput);;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisionsrechner);
    }

    protected void divide(View view){
       try{
           //a/b = c
           double a = Double.parseDouble(dividend.getText().toString());//Umformungen nur für Java nötig(da input typ Zahlen sind)
           double b = Double.parseDouble(divisor.getText().toString());
           double c = a/b;
           output.setText(c+"");
       }catch(Exception e){
           //standard exception handling -> Exception message wird im output feld angezeigt falls eine solche auftreten sollte
           output.setText(e.getMessage());
       }
    }
}
