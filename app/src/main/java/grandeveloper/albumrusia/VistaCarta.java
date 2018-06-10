package grandeveloper.albumrusia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class VistaCarta extends AppCompatActivity {

    ImageView iv;
    CargaImagen cargaImagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_carta);

        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();
        Integer recurso = bundle.getInt("RESOURCE");

        cargaImagen = new CargaImagen();
        iv = (ImageView) findViewById(R.id.imageview);

        iv.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),recurso,300,300));

    }
}
