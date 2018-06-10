package grandeveloper.albumrusia;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class Escanear extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    Button btn;
    private ZXingScannerView mScannerView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escanear);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (ActivityCompat.checkSelfPermission(Escanear.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    //Si el permiso no se encuentra concedido se solicita
                    ActivityCompat.requestPermissions(Escanear.this, new String[]{Manifest.permission.CAMERA}, 1002);
                } else {
                    //Si el permiso esá concedico prosigue con el flujo normal
                    mScannerView = new ZXingScannerView(Escanear.this);
                    setContentView(mScannerView);
                    mScannerView.setResultHandler(Escanear.this);
                    mScannerView.startCamera();
                }

            }
        });

    }

    @Override
    public void handleResult(Result result) {

        //Esto se ejecuta una vez escaneado el codigo
        Log.v("HandlerResult",result.getText());
        AlertDialog.Builder builder = new AlertDialog.Builder(Escanear.this);
        builder.setTitle("Resultado del scan:");
        builder.setMessage(result.getText());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        //La instruccion de abajo es por si queremos seguir escaneando
        //mScannerView.resumeCameraPreview(Escanear.this);

    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        //Se obtiene el resultado de los permisos con base en la clave
        switch (requestCode) {
            case 1002:
                //Se verifica si existen resultados y se valida si el permiso fue concedido o no
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //Si el permiso está concedido prosigue con el flujo normal
                    permissionGranted();
                } else {
                    //Si el permiso no fue concedido no se puede continuar
                    permissionRejected();
                }
                break;
        }
    }

    private void permissionGranted() {
        Toast.makeText(Escanear.this, getString(R.string.permission_granted), Toast.LENGTH_SHORT).show();
    }

    private void permissionRejected() {
        Toast.makeText(Escanear.this, getString(R.string.permission_rejected), Toast.LENGTH_SHORT).show();
    }

}
