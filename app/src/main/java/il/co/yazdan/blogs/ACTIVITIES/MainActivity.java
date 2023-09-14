package il.co.yazdan.blogs.ACTIVITIES;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import il.co.yazdan.blogs.R;

public class MainActivity extends BaseActivity {

    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initliazeViews();
    }


    private void initliazeViews() {
        btnAddPost = findViewById(R.id. btnAddPost);

        setListeners();

    }

    protected void setListeners() {
        // Add listener to btnAddPost
    }

}