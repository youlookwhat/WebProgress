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
        final WebProgress progressShader = findViewById(R.id.progressShader);
        final WebProgress mProgress2 = findViewById(R.id.progress2);
        final WebProgress progressShader2 = findViewById(R.id.progressShader2);
        final WebProgress mProgress3 = findViewById(R.id.progress3);
        final WebProgress progressShader3 = findViewById(R.id.progressShader3);
        final WebProgress mProgress4 = findViewById(R.id.progress4);
        final WebProgress progressShader4 = findViewById(R.id.progressShader4);

        mProgress.setColor(getCompatColor(R.color.colorAccent));
        mProgress.show();
        mProgress.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress.hide();
            }
        }, 2000);
        progressShader.setColor(getCompatColor(R.color.colorAccentTranslate), getCompatColor(R.color.colorAccent));
        progressShader.show();
        progressShader.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressShader.hide();
            }
        }, 2000);

        mProgress2.show();
        mProgress2.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress2.hide();
            }
        }, 4000);
        progressShader2.show();
        progressShader2.setColor("#002483D9", "#2483D9");
        progressShader2.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressShader2.hide();
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
        progressShader3.setColor("#001aad19", "#1aad19");
        progressShader3.show();
        progressShader3.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressShader3.hide();
            }
        }, 6000);

        mProgress4.show();
        mProgress4.postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgress4.hide();
            }
        }, 10000);
        progressShader4.show();
        progressShader4.setColor("#002483D9", "#2483D9");
        progressShader4.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressShader4.hide();
            }
        }, 10000);
    }

    private int getCompatColor(int id) {
        return ContextCompat.getColor(this, id);
    }
}
