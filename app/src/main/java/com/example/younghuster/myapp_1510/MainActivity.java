package com.example.younghuster.myapp_1510;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import java.net.URI;
import java.net.URL;
//import android.widget.ToggleButton;

//import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button sendnores;
    private Button sendforres;
    private TextView textView2;
    private AutoCompleteTextView acTV;
    private MultiAutoCompleteTextView mtv;
    private String link;
    private String[] res = {"beijing", "shanghai","shanghai1","beijing2"};
//    private ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*used for test webview function

        link = "http://www.baidu.com";
        Uri uri = Uri.parse(link);
        Intent intentUri = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intentUri);
*/

        sendnores = (Button) findViewById(R.id.faBtn1);
        sendforres = (Button) findViewById(R.id.faBtn2);
        textView2 = (TextView) findViewById(R.id.textView2);

        sendnores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
        sendforres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 1);
            }
        });


//        button = (Button) findViewById(R.id.send_btn);
        acTV = (AutoCompleteTextView) findViewById(R.id.ACText);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, res);
        acTV.setAdapter(adapter);

        mtv = (MultiAutoCompleteTextView) findViewById(R.id.multiAcTv);
        mtv.setAdapter(adapter);

        mtv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == 2) {
            String info = data.getStringExtra("data");
            textView2.setText(info);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
