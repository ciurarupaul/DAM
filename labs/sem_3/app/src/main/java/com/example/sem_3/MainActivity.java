package com.example.sem_3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private final String MainActivityTag = getClass().getName().toLowerCase();

    public MainActivity(){
        Log.i(MainActivityTag, "MainActivity");
        registerActivityLifecycleCallbacks(new MyApp());
    }

    private ActivityResultLauncher<Intent> launcher;

    public void btnClick(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        launcher.launch(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),

                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult o) {

                }
        });

//        alt + enter - quick/suggested fixes
        Log.i(MainActivityTag, "onCreate");
    }

//    scope == context in android

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(MainActivityTag, "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(MainActivityTag, "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MainActivityTag, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(MainActivityTag, "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf(MainActivityTag, "onDestroy");
    }
}