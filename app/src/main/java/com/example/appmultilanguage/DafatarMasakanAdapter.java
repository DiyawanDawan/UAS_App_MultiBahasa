package com.example.appmultilanguage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appmultilanguage.model.Coktail;
import com.example.appmultilanguage.model.Indonesian_Food;
import com.example.appmultilanguage.model.Masakan;
import com.example.appmultilanguage.model.Mocktail;
import com.example.appmultilanguage.model.Timur_Tengah_Food;
import com.example.appmultilanguage.model.Westren_Food;

import java.util.List;

public class DafatarMasakanAdapter extends ArrayAdapter<Masakan> {
    Context context;

    public DafatarMasakanAdapter(Context context, List<Masakan> masakans){
        super(context, R.layout.row_daftar_masakan, masakans);
        this.context = context;
    }
    private static class ViewHolder{
        TextView textMasakan;
        TextView textname;
        ImageView photo;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Masakan masakan = getItem(position);
        ViewHolder viewHolder;
        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_masakan, parent, false);
            viewHolder.textMasakan = convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textname = convertView.findViewById(R.id.row_text_name);
            viewHolder.photo = convertView.findViewById(R.id.row_image_masakan);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textMasakan.setText(masakan.getMasakan());
//        if(masakan instanceof Coktail){
//            viewHolder.equals(context.getString(R.string.coktail));
//        }else if(masakan instanceof Indonesian_Food){
//            viewHolder.equals(context.getString(R.string.masakan_indonesia));
//        }else if(masakan instanceof Mocktail){
//            viewHolder.equals(context.getString(R.string.mocktail));
//        }else if(masakan instanceof Westren_Food){
//            viewHolder.equals(context.getString(R.string.masakan_barat));
//        }else if(masakan instanceof Timur_Tengah_Food){
//            viewHolder.equals(context.getString(R.string.masakan_timur_tengah));
//        }
        viewHolder.textname.setText(masakan.getNama());
        viewHolder.photo.setImageDrawable(context.getDrawable(masakan.getDrawableRes()));
        return convertView;
    }
}
