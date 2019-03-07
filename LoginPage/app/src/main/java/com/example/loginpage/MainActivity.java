package com.example.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;

    EditText uname,pass;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        uname=findViewById(R.id.eduname);
        pass=findViewById(R.id.edupas);




        login=findViewById(R.id.login);









        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = uname.getText().toString();
                String password = pass.getText().toString();

                if(name.equals("khayer")&&password.equals("1315")) {


                    Intent i=new Intent(MainActivity.this,ViewActivity.class);
                    startActivity(i);

                }
                else if(name.equals("sakib")&&password.equals("1000")) {


                    Intent i=new Intent(MainActivity.this,ViewActivity.class);
                    startActivity(i);

                }


                else {

                    Toast t=Toast.makeText(getApplicationContext(),"incorrect username or password",Toast.LENGTH_SHORT);
                    t.show();


                }

            }
        });


    }
}
