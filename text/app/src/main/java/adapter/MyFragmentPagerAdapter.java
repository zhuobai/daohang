package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by del on 2017/10/8.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    //存储所有的fragment
    private List<Fragment>list;

    public MyFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment>list){
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int argO){
        return list.get(argO);
    }
    @Override
    public int getCount(){
        return list.size();
    }
}
