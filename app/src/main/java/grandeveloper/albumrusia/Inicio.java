package grandeveloper.albumrusia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Inicio extends AppCompatActivity {
    private final int DURACION_SPLASH = 2000;
    private ImageView iv;
    private TextView tv;
    private LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inicio);

        iv = (ImageView)findViewById(R.id.logo);
        tv = (TextView)findViewById(R.id.vers);
        ll = (LinearLayout)findViewById(R.id.linearLayout);

        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.intro);
        iv.startAnimation(anim);
        tv.startAnimation(anim);
        ll.startAnimation(anim);
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(Inicio.this, MainActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
}
