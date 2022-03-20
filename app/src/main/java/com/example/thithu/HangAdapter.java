package com.example.thithu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class HangAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<Hang> hangList;

    public HangAdapter(Context context, int layout, List<Hang> hangList) {
        this.context = context;
        this.layout = layout;
        this.hangList = hangList;
    }

    @Override
    public int getCount() {
        return hangList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public class ViewHolder{
        TextView txtName, txtDanhgia, txtGia, txtTile;
        RatingBar txtSoSao;
        ImageView imgHinh;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            viewHolder = new ViewHolder();

            viewHolder.txtName = view.findViewById(R.id.ten);
            viewHolder.txtDanhgia = view.findViewById(R.id.danhGIa);
            viewHolder.txtSoSao = view.findViewById(R.id.soSao);
            viewHolder.txtGia = view.findViewById(R.id.gia);
            viewHolder.txtTile = view.findViewById(R.id.tiLe);
            viewHolder.imgHinh = view.findViewById(R.id.hinh);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.txtName.setText(hangList.get(i).ten);
        viewHolder.txtSoSao.setRating(hangList.get(i).soSao);
        viewHolder.txtDanhgia.setText(hangList.get(i).danhGia);
        viewHolder.txtGia.setText(hangList.get(i).gia);
        viewHolder.txtTile.setText(hangList.get(i).tile);
        viewHolder.imgHinh.setImageResource(hangList.get(i).hinh);
        return view;
    }
}
