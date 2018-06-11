package grandeveloper.albumrusia;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;


public class QrFragment extends Fragment {

    private ImageView image_qr;
    String codigo;
    private Button btnCancelar;
    private Button btnRecive;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View v = inflater.inflate(R.layout.fragment_qr, container, false);
        image_qr = (ImageView)v.findViewById(R.id.ivQR);
        btnCancelar = (Button)v.findViewById(R.id.btnCancel);
        btnRecive = (Button)v.findViewById(R.id.btnRecibir);

        codigo = "<code>458542</code><ids><id>10</id><id>7</id></ids>";
        generarQR();

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CompartirFragment cf = new CompartirFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,cf).commit();
            }
        });

        btnRecive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //aqui va la llamada al metodo de escanear el QR
                Intent intent = new Intent(getActivity(),Escanear.class);
                getActivity().startActivity(intent);
            }
        });
        return v;
    }

    private void generarQR(){
        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();

        try{
            //creo la matriz para generar el cogo QR
            BitMatrix bitMatrix = multiFormatWriter.encode(codigo,BarcodeFormat.QR_CODE, 500,500 ); // creo y doy dimenciones del qr
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
            image_qr.setImageBitmap(bitmap); // le el qr generado a la imagen que puse

        }catch (WriterException e){
            e.printStackTrace();
        }

    }



}
