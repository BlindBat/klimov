package mobi.blindbat.feedthecat;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
//        Toast toast = Toast.makeText(getApplicationContext(),"Покормить кота", Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.TOP, 0, 0);
//        toast.show();

    /*    Toast toast3 = Toast.makeText(getApplicationContext(),"Hello Kitty",Toast.LENGTH_LONG);
        toast3.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout)toast3.getView();
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.pinkhellokitty);
        toastContainer.addView(catImageView, 0);
        toast3.show();*/

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_layout,
                (ViewGroup) findViewById(R.id.toast_layout));
        toast.setView(layout);
        toast.show();
    }
}
