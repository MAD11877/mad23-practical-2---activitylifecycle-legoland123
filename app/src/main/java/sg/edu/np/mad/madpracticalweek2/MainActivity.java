package sg.edu.np.mad.madpracticalweek2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    final String TITLE = "Main Activity";
    User myUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TITLE, "On Create!");
        myUser = new User("Walter Tan", "this is a random text that is not as distracting, unpopular oppinion thiem vs tsitpas thiem will win 10/10 ", 1, false);
        TextView wlctext = findViewById(R.id.textView);
        TextView longtext = findViewById(R.id.textView2);
        wlctext.setText(myUser.name);
        longtext.setText(myUser.description);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TITLE, "On Start!");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TITLE, "On Pause!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TITLE, "On Resume!");

        Button myButton = findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TITLE, "Follow Button is pressed");
                if (myUser.followed) {
                    myButton.setText("FOLLOW");
                    myUser.followed = false;
                }
                else {
                    myButton.setText("UNFOLLOW");
                    myUser.followed = true;
                }
            }
        });

        Button myButton2 = findViewById(R.id.button2);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TITLE, "Message Button is pressed");
            }

        });

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TITLE, "On Stop!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TITLE, "On Destroy!");
    }
}