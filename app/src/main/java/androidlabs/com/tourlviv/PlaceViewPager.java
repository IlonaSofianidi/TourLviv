package androidlabs.com.tourlviv;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PlaceViewPager extends FragmentPagerAdapter {
    private final int PAGES_COUNT=3;
    private final String[] tabs = {"Beer", "Cafe","Souvenirs"};


    public PlaceViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

       switch (i){
           case 0 : return  new BeerFragment();
           case 1: return  new CafeFragment();
           case 2 :return  new SouvenirsFragment();
           default:return null;
       }
    }

    @Override
    public int getCount() {
        return PAGES_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
