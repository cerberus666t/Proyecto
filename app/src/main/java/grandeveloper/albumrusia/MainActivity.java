package grandeveloper.albumrusia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {
    private BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);


        mBottomBar = BottomBar.attach(this, savedInstanceState);

        mBottomBar.setItems(R.menu.bottombar_menu);
        mBottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if (menuItemId == R.id.bb_home) {

                    // The user selected item number one.
                    HomeFragment hm = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,hm).commit();

                }

                if (menuItemId == R.id.bb_album) {
                    // The user selected item number one.
                    AlbumFragment f = new AlbumFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();

                }

                if (menuItemId == R.id.bb_avance) {
                    // The user selected item number one.
                    AvanceFragment af = new AvanceFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,af).commit();
                }

                if (menuItemId == R.id.bb_comprar) {
                    // The user selected item number one.
                    CompraFragment compra = new CompraFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,compra).commit();

                }

                if (menuItemId == R.id.bb_compartir) {
                    // The user selected item number one.

                    CompartirFragment cf = new CompartirFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,cf).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
                if (menuItemId == R.id.bb_home) {
                    // The user reselected item number one, scroll your content to top.
                }

                if (menuItemId == R.id.bb_album) {
                    // The user reselected item number one, scroll your content to top.
                }

                if (menuItemId == R.id.bb_avance) {
                    // The user reselected item number one, scroll your content to top.
                }

                if (menuItemId == R.id.bb_comprar) {
                    // The user reselected item number one, scroll your content to top.
                }

                if (menuItemId == R.id.bb_compartir) {
                    // The user reselected item number one, scroll your content to top.
                    Intent intent = new Intent(MainActivity.this, Compartir.class);
                    startActivity(intent);
                }
            }


        });

        // Setting colors for different tabs when there's more than three of them.
        // You can set colors for tabs in three different ways as shown below.
        mBottomBar.mapColorForTab(0, ContextCompat.getColor(this, R.color.barra1));
        mBottomBar.mapColorForTab(1, ContextCompat.getColor(this, R.color.barra2));
        mBottomBar.mapColorForTab(2, ContextCompat.getColor(this, R.color.barra3));
        mBottomBar.mapColorForTab(3, "#FF5252");
        mBottomBar.mapColorForTab(4, "#FF9800");
        /*
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Para poder continuar ingresa tu nombre.");
        builder.setTitle("¡Bienvedido!");
        builder.setCancelable(false);
        builder.setNeutralButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        }); builder.show();*/
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Necessary to restore the BottomBar's state, otherwise we would
        // lose the current tab on orientation change.
        mBottomBar.onSaveInstanceState(outState);
    }
}