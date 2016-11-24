package at.fh.swengb.android_homework_2_creaturesofmiddleearth;

import android.content.Intent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.android_homework_2_creaturesofmiddleearth.model.Elves;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    //create empty ElvesList
    private List<Elves> elvesList;
    //define output
    private ListView myListView;
    //define new adapter
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fill ElvesList with elves
        elvesList = new ArrayList<Elves>();
        elvesList.add(new Elves("Legolas" , "blond", 34, "Mirkwood", "Sindarin"));
        elvesList.add(new Elves("Thranduil" , "blond", 114, "Mirkwood", "Sindarin"));
        elvesList.add(new Elves("Galadriel" , "blond", 3457, "Lorien", "Eldar"));
        elvesList.add(new Elves("Elrond" , "black", 3124, "Imladris", "Half-Elve"));
        elvesList.add(new Elves("Gil-Galath" , "brown", 1024, "Imladris", "Half-Elve"));
        elvesList.add(new Elves("Arwen" , "black", 98, "Imladris", "Half-Elve"));

        //reference the ListView
        myListView = (ListView) findViewById(R.id.myElvesList);
        //create new Adapter
        myAdapter = new CustomAdapter(this,elvesList);
        //link adapter to view
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);
    }

    //from Moodle copied
    //what should happens if someone clicks on a item in the listView
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //which user is clicked?
        Elves selectedUser = elvesList.get(i);
        //explicid intent
        Intent intent = new Intent(view.getContext(),ShowUserActivity.class);
        intent.putExtra("elve",selectedUser);
        startActivity(intent);
    }
}
