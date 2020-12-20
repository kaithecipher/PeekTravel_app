package edu.golson.khari;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[ ] attraction={"Philadelphia Museum of Art", "The Library Bell", "Love Park", "Brooklyn Bridge Park", "Times Square", "Milwaukee County Zoo", "Milwaukee Art Museum", "Milwaukee Botanical Gardens"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, attraction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artafterfive.philamuseum.org/")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.nps.gov/inde/learn/historyculture/stories-libertybell.htm")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://myphillypark.org")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.brooklynbridgepark.org")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.nycgo.com/attractions/times-square")));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("http://www.milwaukeezoo.org/")));
                break;
            case 6:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://mam.org")));
                break;
            case 7:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://boernerbotanicalgardens.org/")));
                break;
        }
    }
}
