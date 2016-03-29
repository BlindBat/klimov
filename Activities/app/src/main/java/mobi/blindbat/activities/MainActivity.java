package mobi.blindbat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        EditText userEditText = (EditText)findViewById(R.id.userEditText);
        EditText giftEditText = (EditText)findViewById(R.id.giftEditText);
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("username",userEditText.getText().toString());
        intent.putExtra("gift",giftEditText.getText().toString());
        startActivity(intent);
    }
}
