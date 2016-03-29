package mobi.blindbat.notificationjellybean;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendActionNotification(View view) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Intent intent = new Intent(this, SecondActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        Notification builder = new Notification.Builder(this)
                .setTicker("Пришла посылка!")
                .setContentTitle("Посылка")
                .setContentText("Это я, почтальон Печкин. Принес журнал ─ Мурзилка")
                .setSmallIcon(R.mipmap.ic_launcher).setContentIntent(pendingIntent)
                .addAction(R.mipmap.ic_launcher, "Открыть", pendingIntent)
                .addAction(R.mipmap.ic_launcher, "Отказаться", pendingIntent)
                .addAction(R.mipmap.ic_launcher, "Другой вариант", pendingIntent)
                .build();
        builder.flags |= Notification.FLAG_AUTO_CANCEL;
        notificationManager.notify(0, builder);
    }
}
