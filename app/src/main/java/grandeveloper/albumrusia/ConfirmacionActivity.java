package grandeveloper.albumrusia;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ConfirmacionActivity extends AppCompatActivity {
    long codigo;
    long codigoRecibido;
    boolean ini;
    TextView tvcod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_confirmacion);
        ini = getIntent().getBooleanExtra("inicio",true);
        tvcod = (TextView)findViewById(R.id.tvCod);
        if(ini == true){
            long aux = (codigoRecibido/125) + 525;
            tvcod.setText("Código generado: "+ aux);
        }else {
            long aux = (codigoRecibido/240) + 1048;
            tvcod.setText("Código generado: "+ aux);
        }



    }
}
