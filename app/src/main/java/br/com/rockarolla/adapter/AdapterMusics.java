package br.com.rockarolla.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.rockarolla.R;
import br.com.rockarolla.model.Musics;

public class AdapterMusics extends RecyclerView.Adapter<AdapterMusics.MyViewHolder> {

    private List<Musics> listMusics;
    public AdapterMusics(List<Musics> list){
        this.listMusics = list;
    }


    @NonNull
    @Override
    public AdapterMusics.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_rec_items_list, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMusics.MyViewHolder holder, int position) {
        Musics music = listMusics.get(position);
        holder.group.setText(music.getGroupName());
        holder.music.setText(music.getMusicName());
    }

    @Override
    public int getItemCount() {
        return listMusics.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView group;
        TextView music;
//        TextView genere;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            group = itemView.findViewById(R.id.music_name);
            music = itemView.findViewById(R.id.music_desc);
//            genere = itemView.findViewById(R.id.txt_genere);
        }
    }
}
