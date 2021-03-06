package mobi.blindbat.trafficlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonRed :
                mInfoTextView.setText(R.string.red);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;
            case R.id.buttonYellow :
                mInfoTextView.setText(R.string.yellow);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                break;
            case R.id.buttonGreen :
                mInfoTextView.setText(R.string.green);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                break;
        }
    }
}
