package id.inixindosurabaya.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Message", "onCreate State");
        Toast.makeText(this, "onCreate State",
                Toast.LENGTH_LONG).show();
    }

    protected void onStart() {
        super.onStart();
        Log.d("Message", "onStart State");
        Toast.makeText(this, "onStart State",
                Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Log.d("Message", "onResume State");
        Toast.makeText(this, "onResume State",
                Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Log.d("Message", "onPause State");
        Toast.makeText(this, "onPause State",
                Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Log.d("Message", "onStop State");
        Toast.makeText(this, "onStop State",
                Toast.LENGTH_LONG).show();
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("Message", "onRestart State");
        Toast.makeText(this, "onRestart State",
                Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("Message", "onDestroy State");
        Toast.makeText(this, "onDestroy State",
                Toast.LENGTH_LONG).show();
    }
}
