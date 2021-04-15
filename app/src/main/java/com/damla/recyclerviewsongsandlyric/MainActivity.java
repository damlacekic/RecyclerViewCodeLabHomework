package com.damla.recyclerviewsongsandlyric;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private LinkedList<String> listSingerName = new LinkedList<>();
    private LinkedList<String> listSongName = new LinkedList<>();
    private RecyclerView recyclerView ;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        makingListOfSingers();
        makingListOfSongs();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(this,listSingerName,listSongName);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
}

    public void makingListOfSingers(){
        listSingerName.addLast("Dua Lipa");
        listSingerName.addLast("Lady Gaga");
        listSingerName.addLast("Metalica");
        listSingerName.addLast("SOAD");
        listSingerName.addLast("Sofi Tucker");
        listSingerName.addLast("Lil Nas X");
        listSingerName.addLast("Evdeki Saat");
        listSingerName.addLast("Pinhani");
        listSingerName.addLast("Jehan Barbur");
        listSingerName.addLast("Lorde");
    }
    public void makingListOfSongs(){
        listSongName.addLast("New Rules");
        listSongName.addLast("Poker Face");
        listSongName.addLast("Master of Puppets");
        listSongName.addLast("Toxicity");
        listSongName.addLast("Purple Hat");
        listSongName.addLast("MONTERO (Call Me By Your Name)");
        listSongName.addLast("Uzunlar");
        listSongName.addLast("Dünyadan Uzak");
        listSongName.addLast("Gidersen");
        listSongName.addLast("Perfect Places");
    }

}

