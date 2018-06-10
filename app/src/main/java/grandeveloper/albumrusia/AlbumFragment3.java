package grandeveloper.albumrusia;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class AlbumFragment3 extends Fragment {
    @Nullable

    private LinearLayout l1;
    private ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,btn1,btn2;
    private TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8;
    int i;
    CargaImagen cargaImagen;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_album2,container,false);
        l1 = (LinearLayout) v.findViewById(R.id.ll1);
        iv1 = (ImageView)v.findViewById(R.id.image1);
        iv2 = (ImageView)v.findViewById(R.id.image2);
        iv3 = (ImageView)v.findViewById(R.id.image3);
        iv4 = (ImageView)v.findViewById(R.id.image4);
        iv5 = (ImageView)v.findViewById(R.id.image5);
        iv6 = (ImageView)v.findViewById(R.id.image6);
        iv7 = (ImageView)v.findViewById(R.id.image7);
        iv8 = (ImageView)v.findViewById(R.id.image8);
        btn1 = (ImageView)v.findViewById(R.id.btnadelante);
        btn2 = (ImageView)v.findViewById(R.id.btnatras);
        cargaImagen = new CargaImagen();
        tx1 = (TextView) v.findViewById(R.id.nombre1);
        tx2 = (TextView) v.findViewById(R.id.nombre2);
        tx3 = (TextView) v.findViewById(R.id.nombre3);
        tx4 = (TextView) v.findViewById(R.id.nombre4);
        tx5 = (TextView) v.findViewById(R.id.nombre5);
        tx6 = (TextView) v.findViewById(R.id.nombre6);
        tx7 = (TextView) v.findViewById(R.id.nombre7);
        tx8 = (TextView) v.findViewById(R.id.nombre8);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(getContext(),"bd_jugadores",null,1);
        SQLiteDatabase bd = conn.getWritableDatabase();

        for(i=17;i<25;i++){
            Cursor c=bd.rawQuery("SELECT inventario FROM jugadores WHERE id ='"+i+"'",null);
            c.moveToFirst();

            if(i==17){
                if (c.getInt(0)>=1 ){
                    iv1.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id17,200,200));
                    iv1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id17);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv1.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                    tx1.setBackgroundColor(getResources().getColor(R.color.negro));
                    tx1.setText(R.string.id17);
                }
            }

            else if(i==18){
                if (c.getInt(0)>=1 ){
                    iv2.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id18,200,200));
                    iv2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id18);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv2.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                    tx2.setBackgroundColor(getResources().getColor(R.color.negro));
                    tx2.setText(R.string.id18);
                }
            }

            else if(i==19){
                if (c.getInt(0)>=1 ){
                    iv3.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id19,200,200));
                    iv3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id19);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv3.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                    tx3.setBackgroundColor(getResources().getColor(R.color.negro));
                    tx3.setText(R.string.id19);
                }
            }

            else if(i==20){
                if (c.getInt(0)>=1 ){
                    iv4.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id20,200,200));
                    iv4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id20);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv4.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                    tx4.setBackgroundColor(getResources().getColor(R.color.negro));
                    tx4.setText(R.string.id20);
                }
            }

            else if(i==21){
                if (c.getInt(0)>=1 ){
                    iv5.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id21,200,200));
                    iv5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id21);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv5.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                    tx5.setBackgroundColor(getResources().getColor(R.color.negro));
                    tx5.setText(R.string.id21);
                }
            }

            else if(i==22){
                if (c.getInt(0)>=1 ){
                    iv6.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id22,200,200));
                    iv6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id22);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv6.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                    tx6.setBackgroundColor(getResources().getColor(R.color.negro));
                    tx6.setText(R.string.id22);
                }
            }

            else if(i==23){
                if (c.getInt(0)>=1 ){
                    iv7.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id23,200,200));
                    iv7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id23);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv7.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                    tx7.setBackgroundColor(getResources().getColor(R.color.negro));
                    tx7.setText(R.string.id23);
                }
            }

            else if(i==24){
                if (c.getInt(0)>=1 ){
                    iv8.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id24,200,200));
                    iv8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id24);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv8.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                    tx8.setBackgroundColor(getResources().getColor(R.color.negro));
                    tx8.setText(R.string.id24);
                }
            }

        }

        conn.close();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlbumFragment4 f = new AlbumFragment4();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlbumFragment2 f = new AlbumFragment2();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
            }
        });

        return v;
    }
}
