package androidlabs.com.tourlviv;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);
        Log.d("ViewPager","view pager created");
        PlaceViewPager placeViewPager = new PlaceViewPager(getSupportFragmentManager());
        Log.d("PlaceViewPager", "new instance of PlaceViewPager created");

        viewPager.setAdapter(placeViewPager);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);


    }
}
