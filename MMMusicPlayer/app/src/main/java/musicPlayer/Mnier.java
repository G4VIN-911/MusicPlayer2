package musicPlayer;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;

import com.example.mmmusicplayer.R;




public class Mnier extends AppCompatActivity{
    private final int REQUEST_CODE = 1;


    //---------------------------------------------
    private LinearLayout frameSwitch;
    boolean f=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miner);


        frameSwitch = (LinearLayout) findViewById(R.id.frameSwitch);
        Button btnSwitch = (Button) findViewById(R.id.btnSwitch);
        Button btnre = (Button) findViewById(R.id.btnre);
        if (f){
            f=false;
            getViewRe();
        }


//---------------------------------------
        btnre.setOnClickListener(new View.OnClickListener() {
            boolean boo = false;

            @Override
            public void onClick(View v) {
                Log.i("d","c8");
                if (!f) {
                    getViewRe();
                }

            }
        });

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            boolean boo = false;

            @Override
            public void onClick(View v) {
                Log.i("d","cl");

                getViewOne();

            }
        });

        Button btnScreen = (Button) findViewById(R.id.btnScreen);
        btnScreen.setOnClickListener(new View.OnClickListener() {
            boolean isScreen = false;

            @Override
            public void onClick(View v) {
                getViewSecond();
            }
        });
        //----------------------------

        //播放按钮点击事件

    }
    public void getViewRe() {
        View view = getLayoutInflater().inflate(R.layout.activity_miner, null);

        frameSwitch.removeAllViews();
        frameSwitch.addView(view, ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT);
    }
    public void getViewOne() {
        View viewOne = getLayoutInflater().inflate(R.layout.fragment_first, null);
        frameSwitch.removeAllViews();
        frameSwitch.addView(viewOne, ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT);
    }

    public void getViewSecond() {
        View viewSecond = getLayoutInflater().inflate(R.layout.fragment_second, null);
//        Button btn = (Button) viewSecond.findViewById(R.id.btnSecond);
//        btn.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(ZzzAndroidActivity.this, "hello world",
//                        Toast.LENGTH_LONG).show();
//            }
//        });
        frameSwitch.removeAllViews();
        frameSwitch.addView(viewSecond, ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT);
    }
}
