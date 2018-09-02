package com.sewa.mobil;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sewa.mobil.domain.Pelanggan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andito19 on 8/30/2018.
 */

public class ListPelangganAdapter extends BaseAdapter {

    private Context context;
    private List<Pelanggan> pelanggans=new ArrayList<>();
    private TextView lbNama, lbtlp;

    public ListPelangganAdapter(Context context,List<Pelanggan> pelanggans){
        this.context=context;
        this.pelanggans=pelanggans;
    }

    @Override
    public int getCount() {
        return pelanggans;
    }

    @Override
    public Object getItem(int position) {
        return pelanggans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }



}
