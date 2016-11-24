package at.fh.swengb.android_homework_2_creaturesofmiddleearth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.android_homework_2_creaturesofmiddleearth.model.Elves;

/**
 * Created by Dominik on 23.11.2016.
 */

public class CustomAdapter extends BaseAdapter {
    //all from Moodle copied
    List<Elves> elvesList;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Elves> elvesList) {
        this.context = applicationContext;
        this.elvesList = elvesList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return elvesList.size();
    }

    @Override
    public Object getItem(int i) {
        return elvesList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }

        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewFrom=(TextView)view.findViewById(R.id.textViewListFrom);
        TextView viewWhatGroup=(TextView)view.findViewById(R.id.textViewListGroup);

        Elves elve = elvesList.get(i);
        viewName.setText(elve.getName()+", "+elve.getAge());
        viewFrom.setText(elve.getOrigin());
        viewWhatGroup.setText(elve.getGroup());

        return view;
    }
}
