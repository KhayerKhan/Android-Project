package khayerkhan.com.positive;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edmt.dev.androidgridlayout.R;

public class Labaid extends AppCompatActivity implements View.OnClickListener {
     ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labaid);
        actionBar=getSupportActionBar();
        actionBar.setTitle("Labaid Hospital");
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        final String s3="services.html";
        final String s4="location.html";
        int id= view.getId();
        switch (id) {

            case R.id.button:
                Intent intent = new Intent(Labaid.this, LabaidDepartment.class);
                startActivity(intent);
                // Write your code here first button

                break;

            case R.id.button2:

                Intent i=new Intent(Labaid.this,Serviceview.class);
                i.putExtra("Q",s3);
                startActivity(i);

                // Write your code here for second button

                break;

            case R.id.button3:

                Intent j=new Intent(Labaid.this,Serviceview.class);
                j.putExtra("Q",s4);
                startActivity(j);

                // Write your code here for second button

                break;

        }
    }
}
