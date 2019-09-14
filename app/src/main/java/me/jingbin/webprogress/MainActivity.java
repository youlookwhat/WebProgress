package me.jingbin.webprogress;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import me.jingbin.library.WebProgress;

/**
 * @author jingbin
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WebProgress mProgress = findViewById(R.id.progress);
        final WebProgress mProgress2 = findViewById(R.id.progress2);
        final WebProgress mProgress3 = findViewById(R.id.progress3);
        final WebProgress mProgress4 = findViewById(R.id.progress4);

        mProgress.setColor(ContextCompat.getColor(this, R.color.colorAccent));
        mProgress.show();
        mProgress.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress.hide();
            }
        }, 2000);

        mProgress2.show();
        mProgress2.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress2.hide();
            }
        }, 4000);

        mProgress3.setColor("#1aad19");
        mProgress3.show();
        mProgress3.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress3.hide();
            }
        }, 6000);

        mProgress4.show();
        mProgress4.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress4.hide();
            }
        }, 10000);
    }
}
