package com.damla.recyclerviewsongsandlyric;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.LinkedList;

public class LyricActivity extends AppCompatActivity {

    private final String POSITION = "song_position";
    private LinkedList<Bitmap> listSingerPhoto = new LinkedList<>();
    private LinkedList<String> listSongLyric = new LinkedList<>();
    ImageView imageView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyric);
        Intent intent = getIntent();
        int lposition = intent.getIntExtra(POSITION,0);
        makingSingerPhotoList();
        imageView = findViewById(R.id.imageView);
        imageView.setImageBitmap(listSingerPhoto.get(lposition));
        makingsongLyrics();
        textView = findViewById(R.id.lyric);
        textView.setText(listSongLyric.get(lposition));

        Toolbar toolbar = findViewById(R.id.toolBarLyric);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }


    private void makingSingerPhotoList(){
        Bitmap duaLipa = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.dualipa);
        Bitmap ladyGaga = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.ladygaga);
        Bitmap metalica = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.metalica);
        Bitmap soad = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.soad);
        Bitmap sofiTukker = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.sofitukker);
        Bitmap lilNasX = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.lilnasx);
        Bitmap evdekiSaat = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.evdekisaat);
        Bitmap pinhani = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.pinhani);
        Bitmap jehanBarbur = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.jehanbarbur);
        Bitmap lorde = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.lorde);

        listSingerPhoto.addLast(duaLipa);
        listSingerPhoto.addLast(ladyGaga);
        listSingerPhoto.addLast(metalica);
        listSingerPhoto.addLast(soad);
        listSingerPhoto.addLast(sofiTukker);
        listSingerPhoto.addLast(lilNasX);
        listSingerPhoto.addLast(evdekiSaat);
        listSingerPhoto.addLast(pinhani);
        listSingerPhoto.addLast(jehanBarbur);
        listSingerPhoto.addLast(lorde);

    }
    public void makingsongLyrics(){
        listSongLyric.addLast(getResources().getString(R.string.newrules));
        listSongLyric.addLast(getResources().getString(R.string.pokerface));
        listSongLyric.addLast(getResources().getString(R.string.masterofpuppets));
        listSongLyric.addLast(getResources().getString(R.string.toxicity));
        listSongLyric.addLast(getResources().getString(R.string.purplehat));
        listSongLyric.addLast(getResources().getString(R.string.callmebyyourname));
        listSongLyric.addLast(getResources().getString(R.string.uzunlar));
        listSongLyric.addLast(getResources().getString(R.string.dunyadanuzak));
        listSongLyric.addLast(getResources().getString(R.string.gidersen));
        listSongLyric.addLast(getResources().getString(R.string.perfectplaces));


    }
}