package at.fh.swengb.android_homework_2_creaturesofmiddleearth;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.android_homework_2_creaturesofmiddleearth.model.Elves;

public class ShowUserActivity extends AppCompatActivity {

    private Elves elve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_user);

        Intent intent = getIntent();
        elve = (Elves) intent.getExtras().get("elve");

        TextView viewName = (TextView) findViewById(R.id.viewName);
        TextView viewAge = (TextView) findViewById(R.id.viewAge);
        TextView viewFrom = (TextView) findViewById(R.id.viewFrom);
        TextView viewGroup = (TextView) findViewById(R.id.viewGroup);

        viewName.setText(elve.getName());
        String ageString = String.valueOf(elve.getAge());
        viewAge.setText(ageString);
        viewFrom.setText(elve.getOrigin());
        viewGroup.setText(elve.getGroup());
    }

    public void google(View view) {
        Uri uri = Uri.parse("http://www.google.com/?gws_rd=ssl#q="+elve.getName()); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
