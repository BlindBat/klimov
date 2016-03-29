package mobi.blindbat.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mCrowsCounterButton;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cat);
        mCrowsCounterButton = (Button) findViewById(R.id.buttonCrowsCounter);
        mHelloTextView = (TextView) findViewById(R.id.textView);
        mNameEditText = (EditText) findViewById(R.id.editText);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView mInfoTextView = (TextView) findViewById(R.id.infoTextView);
                mInfoTextView.setText("Я насчитал " + ++mCount + " ворон(-ы,-у)");
            }
        });
    }

    private TextView mHelloTextView;
    private EditText mNameEditText;
    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Hello Kitty!");
        } else {
            mHelloTextView.setText("Привет, "+mNameEditText.getText());
        }
    }

    public void onClickButton(View view) {
        TextView helloTextView = (TextView) findViewById(R.id.helloTextView);
        helloTextView.setText("Hello Kitty!");
    }

    public void onAboutButtonClick(View view) {
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
}
