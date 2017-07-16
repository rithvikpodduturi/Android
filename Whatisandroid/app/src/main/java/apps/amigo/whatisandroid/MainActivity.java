package apps.amigo.whatisandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int resultnumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display (int number){
        TextView totalTextView = (TextView) findViewById(R.id.textView);
        totalTextView.setText(""+number);
    }

    public void submitcount (View view){
        resultnumber = resultnumber + 1;
        display(resultnumber);
    }
}
