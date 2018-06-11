package grandeveloper.albumrusia.entidades;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import grandeveloper.albumrusia.ConfirmacionActivity;
import grandeveloper.albumrusia.MainActivity;
import grandeveloper.albumrusia.R;

public class Qruser2Activity extends AppCompatActivity {
    private ImageView image_qr;
    String codigo;
    private Button btnCancelar;
    private Button btnRecive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_qruser2);

        image_qr = (ImageView) findViewById(R.id.ivQR2);
        btnCancelar = (Button) findViewById(R.id.btnCancel2);
        btnRecive = (Button) findViewById(R.id.btnRecibir2);

        codigo = "<code>458542</code><ids><id>10</id><id>7</id></ids>";
        generarQR();

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Qruser2Activity.this, MainActivity.class);
                Qruser2Activity.this.startActivity(intent);
            }
        });

        btnRecive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aqui va la llamada al metodo de escanear el QR
                Intent intent = new Intent(Qruser2Activity.this, ConfirmacionActivity.class);
                intent.putExtra("inicio", false);
                Qruser2Activity.this.startActivity(intent);
            }
        });
    }


    private void generarQR() {
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();

        try {
            //creo la matriz para generar el cogo QR
            BitMatrix bitMatrix = multiFormatWriter.encode(codigo, BarcodeFormat.QR_CODE, 500, 500); // creo y doy dimenciones del qr
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
            image_qr.setImageBitmap(bitmap); // le el qr generado a la imagen que puse

        } catch (WriterException e) {
            e.printStackTrace();
        }
    }
}
