package com.example.friends.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button click;
    Button reset;
    TextView label;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click=(Button)findViewById(R.id.clickbtn);
        reset=(Button)findViewById(R.id.resetbtn);
        label=(TextView)findViewById(R.id.lbl1);

        //int num=lbl1.getText();

click.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int num=Integer.parseInt(""+label.getText());
        num=num+1;
        label.setText(""+num);
    }
});

reset.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    label.setText("0");

    }
});




    }
}
