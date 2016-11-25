package sh.dfm.lc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showToast(String text){
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        showToast("App Start");
        super.onStart();
    }

    @Override
    protected void onResume() {
        showToast("App Resume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        showToast("App Pause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        showToast("App Stop");
        super.onStop();
    }

//    @Override
//    protected void onDestroy() {
//        showToast("App Destroy");
//        super.onDestroy();
//    }
}
