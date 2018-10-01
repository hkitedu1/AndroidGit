package com.example.user.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_hellow=null, tv_name= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_hellow = findViewById(R.id.tv_hellow);
        tv_name = findViewById(R.id.tv_name);

        tv_hellow.setText(R.string.change);
        tv_name.setText("희철씨는 지렁이왕");

    }
}
