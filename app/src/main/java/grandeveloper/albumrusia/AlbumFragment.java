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


public class AlbumFragment extends Fragment {
    @Nullable

    private LinearLayout l1;
    private ImageView iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,btn1;
    int i;
    CargaImagen cargaImagen;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_album,container,false);
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
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(getContext(),"bd_jugadores",null,1);
        SQLiteDatabase bd = conn.getWritableDatabase();

        cargaImagen = new CargaImagen();
        for(i=1;i<9;i++){
            Cursor c=bd.rawQuery("SELECT inventario FROM jugadores WHERE id ='"+i+"'",null);
            c.moveToFirst();

            if(i==1){
                if (c.getInt(0)>=1 ){
                    iv1.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id1,200,200));
                    iv1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id1);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv1.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                }
            }

            else if(i==2){
                if (c.getInt(0)>=1 ){
                    iv2.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id2,200,200));
                    iv2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id2);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv2.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                }
            }

            else if(i==3){
                if (c.getInt(0)>=1 ){
                    iv3.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id3,200,200));
                    iv3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id3);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv3.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                }
            }

            else if(i==4){
                if (c.getInt(0)>=1 ){
                    iv4.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id4,200,200));
                    iv4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id4);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv4.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                }
            }

            else if(i==5){
                if (c.getInt(0)>=1 ){
                    iv5.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id5,200,200));
                    iv5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id5);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv5.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                }
            }

            else if(i==6){
                if (c.getInt(0)>=1 ){
                    iv6.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id6,200,200));
                    iv6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id6);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv6.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                }
            }

            else if(i==7){
                if (c.getInt(0)>=1 ){
                    iv7.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id7,200,200));
                    iv7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id7);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }else{
                    iv7.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                }
            }

            else if(i==8){
                if (c.getInt(0)>=1 ){
                    iv8.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.id8,200,200));
                    iv8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("RESOURCE",R.drawable.id8);
                            Intent intent = new Intent(getActivity(), VistaCarta.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                }
                else{
                    iv8.setImageBitmap(cargaImagen.decodeSampledBitmapFromResource(getResources(),R.drawable.desconocido,200,200));
                }
            }

        }
        conn.close();


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlbumFragment2 f = new AlbumFragment2();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();

            }
        });
        return v;
    }
}
