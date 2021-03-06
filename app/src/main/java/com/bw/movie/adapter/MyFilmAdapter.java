package com.bw.movie.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @Author：dell
 * @E-mail： 15001194794@163.com
 * @Date：2019/5/13 10:41
 * @Description：描述信息
 */
public class MyFilmAdapter extends FragmentPagerAdapter {
    List<Fragment> list;

    public MyFilmAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
