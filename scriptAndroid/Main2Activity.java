package johnkriegerinc.scripturestuff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        display();
    }
    public void display() {
        TextView displayScript = (TextView) findViewById(R.id.displayScript); // Creates a textview object of our textview
        Intent ni = getIntent(); // Makes an intent of the previous intent
        String script = ni.getExtras().getString("book")+ " " + ni.getExtras().getString("chap")+ ":" + ni.getExtras().getString("verse");
        // Merges the various strings into one giant string with an added space and colon
        displayScript.setText(script);
        //Displays the string on our textview
    }
}
