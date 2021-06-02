package br.com.rockarolla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MediaPlayer extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView nameGroup, nameMusic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        seekBar.findViewById(R.id.card_seek_bar);
        seekBar.getThumb().setColorFilter(Color.BLACK, PorterDuff.Mode.SRC_IN);

        nameGroup = findViewById(R.id.card_group_name);
        nameGroup.setText(R.string.name_group);

        nameMusic = findViewById(R.id.card_music_name);
        nameMusic.setText(R.string.music_moment);
    }
}