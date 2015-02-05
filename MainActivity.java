package com.example.maxim_ignatiuc.helloworldbutton;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /////

    @Override
    protected void onCreate(Bundle bundle) {

        super.onCreate(bundle);
        setContentView(R.layout.activity_main);//attaches the layout to activity

        final ViewGroup vg1 = (ViewGroup) findViewById(R.id.root1);
        float w1 = vg1.getWidth();
        float h1 = vg1.getHeight();

        final Button b1 = new Button(this);

//      b1.setWidth((int) 100);
//        b1.setHeight((int) 30);

        b1.setText("Hello");


        //float left = (w1 - vg1.getWidth())/2;
        //float top = (h1 - vg1.getHeight())/2;

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
       // layoutParams.addRule(100,30);

        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);

//        layoutParams.setMargins( (int)left,  (int)top, (int)(left+w1/2), (int)(top+h1/2));
//        layoutParams.gravity = Gravity.CENTER;

        b1.setLayoutParams(layoutParams);
        vg1.addView(b1);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("Hello")) {
                    b1.setText("World");
                } else {
                    b1.setText("Hello");
                }

            }
        });
    }
}
