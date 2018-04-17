package vishukumar.com.diaryapplayoutdesign;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Typeface grobold;
    Animation fadeIn, bounce;
    TextView title, subtitle;
    ImageView imageView;

    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_note_layout);

        // Logic to hide keyboard when user clicks on items other than edittext

        /*
        // Reference to elements from layout xml
        title = (TextView) findViewById(R.id.id_tv_title);
        subtitle = (TextView) findViewById(R.id.id_tv_subtitle);
        imageView = (ImageView) findViewById(R.id.id_iv_main);

        // Set values to title and subtitle
        title.setText(getString(R.string.main_title));
        subtitle.setText(getString(R.string.main_subtitle));

        // Set typeface
        grobold = Typeface.createFromAsset(getAssets(), "GROBOLD.ttf");
        title.setTypeface(grobold);

        // Set Animation
        fadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.subtitle);
        bounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        title.setAnimation(bounce);
        imageView.setAnimation(fadeIn);
        subtitle.setAnimation(fadeIn);
        */

        cardView1 = (CardView) findViewById(R.id.cv_id_1);
        cardView2 = (CardView) findViewById(R.id.cv_id_2);
        cardView3 = (CardView) findViewById(R.id.cv_id_3);
        cardView4 = (CardView) findViewById(R.id.cv_id_4);
        cardView5 = (CardView) findViewById(R.id.cv_id_5);
        cardView6 = (CardView) findViewById(R.id.cv_id_6);

    }

    public void cardClicked(View view) {
        switch (view.getId()) {
            case R.id.cv_id_1:
                cardView1.setBackgroundColor(Color.WHITE);
                cardView1.setPressed(true);
                break;
            case R.id.cv_id_2:
                cardView2.setBackgroundColor(Color.WHITE);
                cardView2.setPressed(true);
                break;
            case R.id.cv_id_3:
                cardView3.setBackgroundColor(Color.WHITE);
                cardView3.setPressed(true);
                break;
            case R.id.cv_id_4:
                cardView4.setBackgroundColor(Color.WHITE);
                cardView4.setPressed(true);
                break;
            case R.id.cv_id_5:
                cardView5.setBackgroundColor(Color.WHITE);
                cardView5.setPressed(true);
                break;
            case R.id.cv_id_6:
                cardView6.setBackgroundColor(Color.WHITE);
                cardView6.setPressed(true);
                break;
        }
    }

    public void hideKeyboard(View view) {
        Log.d("tag", "Hiding Keyboard");
        InputMethodManager inputMethodManager =(InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
