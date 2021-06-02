package br.com.rockarolla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.rockarolla.adapter.AdapterMusics;
import br.com.rockarolla.model.Musics;

public class MainActivity extends AppCompatActivity {

    private TextView nameGroup;
    private RecyclerView recView;
    private List<Musics> listMusics = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Listagem de filmes
        this.createMusics();

        nameGroup = findViewById(R.id.name_group);
        nameGroup.setText(R.string.name_group);

        recView = findViewById(R.id.rec_list_musics);

        //configurar Adapter
        AdapterMusics adapter = new AdapterMusics(listMusics);

        //configurar recycler view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recView.setLayoutManager(layoutManager);
        recView.setHasFixedSize(true);
        recView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recView.setAdapter(adapter);


    }

    public void createMusics() {
        Musics music = new Musics("Homiranha", "Comedia");
        this.listMusics.add(music);

        music = new Musics("Marveu Mundo", "Acao");
        this.listMusics.add(music);

        music = new Musics("Os desincriveis", "trama");
        this.listMusics.add(music);

        music = new Musics("Todo mundo com fome", "Desepspero");
        this.listMusics.add(music);

        music = new Musics("Tá chovendo Acaí", "Gordos");
        this.listMusics.add(music);

        music = new Musics("Xangricá", "Ironico");
        this.listMusics.add(music);

        music = new Musics("4", "numérico");
        this.listMusics.add(music);

        music = new Musics("Remédio", "9494");
        this.listMusics.add(music);

        music = new Musics("4xt243t43t", "sla");
        this.listMusics.add(music);
    }
}