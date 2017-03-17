package edu.dtcc.hpeffley.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "HPeffley";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Activity onCreate is called");

        Toast.makeText(this, "onCreate: Activity onCreate is called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart: Activity onStart is called", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "onStart: Activity onStart is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume: Activity onResume is called", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "onResume: Activity onResume is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause: Activity onPause is called", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "onPause: Activity onPause is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onPause: Activity onPause is called", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "onStop: Activity onStop is called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart: Activity onRestart is called", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "onRestart: Activity onRestart is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy: Activity onDestroy is called", Toast.LENGTH_SHORT).show();

        Log.d(TAG, "onDestroy: Activity onDestroy is called");
    }
}
