package me.jingbin.webprogress;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import me.jingbin.progress.WebProgress;

/**
 * @author jingbin
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WebProgress mProgress = findViewById(R.id.progress);
        final WebProgress mProgressShader = findViewById(R.id.progressShader);
        final WebProgress mProgress2 = findViewById(R.id.progress2);
        final WebProgress mProgressShader2 = findViewById(R.id.progressShader2);
        final WebProgress mProgress3 = findViewById(R.id.progress3);
        final WebProgress mProgressShader3 = findViewById(R.id.progressShader3);
        final WebProgress mProgress4 = findViewById(R.id.progress4);
        final WebProgress mProgressShader4 = findViewById(R.id.progressShader4);

        mProgress.setColor(getCompatColor(R.color.colorAccent));
        mProgress.show();
        mProgress.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress.hide();
            }
        }, 2000);
        mProgressShader.setColor(getCompatColor(R.color.colorAccentTranslate), getCompatColor(R.color.colorAccent));
        mProgressShader.show();
        mProgressShader.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgressShader.hide();
            }
        }, 2000);


        mProgress2.show();
        mProgress2.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress2.hide();
            }
        }, 4000);
        mProgressShader2.show();
        mProgressShader2.setColor("#002483D9", "#2483D9");
        mProgressShader2.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgressShader2.hide();
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
        mProgressShader3.setColor("#001aad19", "#1aad19");
        mProgressShader3.show();
        mProgressShader3.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgressShader3.hide();
            }
        }, 6000);


        mProgress4.show();
        mProgress4.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress4.hide();
            }
        }, 10000);
        mProgressShader4.show();
        mProgressShader4.setColor("#002483D9", "#2483D9");
        mProgressShader4.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgressShader4.hide();
            }
        }, 10000);
    }

    private int getCompatColor(int id) {
        return ContextCompat.getColor(this, id);
    }
}
