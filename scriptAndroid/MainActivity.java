package johnkriegerinc.scripturestuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void changePage(View v) {
        EditText book = (EditText) findViewById(R.id.book);
        EditText verse = (EditText) findViewById(R.id.verse);
        EditText chap = (EditText) findViewById(R.id.chap); //Gets the text from the different boxes

        Intent i = new Intent(MainActivity.this, Main2Activity.class); //Creates an intent of the second activity

        i.putExtra("book", book.getText().toString());
        i.putExtra("verse",verse.getText().toString());
        i.putExtra("chap", chap.getText().toString());
        // Puts the text into the intent
        startActivity(i);
        // Starts the second activity

    }
}
