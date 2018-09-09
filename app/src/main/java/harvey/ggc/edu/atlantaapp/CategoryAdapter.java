package harvey.ggc.edu.atlantaapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new MuseumsFragment();
        } else {
            return new TourFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Attractions);
        } else if (position == 1) {
            return mContext.getString(R.string.foodTitle);
        } else if (position == 2) {
            return mContext.getString(R.string.ArtPlace);

        } else {
            return mContext.getString(R.string.Tour);
        }

    }
}