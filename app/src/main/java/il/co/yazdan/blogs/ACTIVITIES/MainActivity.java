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

        initializeViews();
    }

    @Override
    protected void initializeViews() {
        btnAdd = findViewById(R.id. btnAdd);


        setListeners();
    }

    @Override
    protected  void setListeners(){
        btnAdd.callOnClick();
    }
}