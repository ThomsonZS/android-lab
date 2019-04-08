package lab.android_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> target;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] values = new String[] {
                "pies", "kon", "gołąb", "kruk", "dzik", "karp",
                "osiol", "chomik", "mysz", "jez", "kraluch"};
        this.target = new ArrayList<String>();
        this.target.addAll(Arrays.asList(values));
        this.adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,this.target);
        ListView listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(this.adapter);
        setContentView(R.layout.activity_main);

    }
}
