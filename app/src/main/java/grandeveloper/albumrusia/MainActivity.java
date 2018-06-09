package grandeveloper.albumrusia;

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

                }

                if (menuItemId == R.id.bb_album) {
                    // The user selected item number one.
                    AlbumFragment f = new AlbumFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();

                }

                if (menuItemId == R.id.bb_avance) {
                    // The user selected item number one.
                }

                if (menuItemId == R.id.bb_comprar) {
                    // The user selected item number one.
                    CompraFragment compra = new CompraFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,compra).commit();

                }

                if (menuItemId == R.id.bb_compartir) {
                    // The user selected item number one.
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
                }
            }


        });

        // Setting colors for different tabs when there's more than three of them.
        // You can set colors for tabs in three different ways as shown below.
        mBottomBar.mapColorForTab(0, ContextCompat.getColor(this, R.color.colorAccent));
        mBottomBar.mapColorForTab(1, 0xFF5D4037);
        mBottomBar.mapColorForTab(2, "#7B1FA2");
        mBottomBar.mapColorForTab(3, "#FF5252");
        mBottomBar.mapColorForTab(4, "#FF9800");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Necessary to restore the BottomBar's state, otherwise we would
        // lose the current tab on orientation change.
        mBottomBar.onSaveInstanceState(outState);
    }
}