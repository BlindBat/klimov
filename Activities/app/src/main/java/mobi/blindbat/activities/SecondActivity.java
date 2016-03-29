package mobi.blindbat.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String user = "ЖЫвотное";
        String gift = "Дырку от бублика";
        user = getIntent().getStringExtra("username");
        gift = getIntent().getStringExtra("gift");
        TextView infoTextView = (TextView) findViewById(R.id.infoTextView);
        infoTextView.setText(user + ", вам передали " + gift);
    }

}
