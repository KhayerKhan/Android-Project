package com.example.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {



    TextView idView,nameView,depView;
    EditText studid;
    EditText studentname;
    EditText studentdep;
    EditText fistuid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        idView = (TextView) findViewById(R.id.studentID);
        nameView = (TextView) findViewById(R.id.viewname);
        depView = (TextView) findViewById(R.id.viewdep);

        studid = (EditText) findViewById(R.id.stduid);
        studentname = (EditText) findViewById(R.id.studentname);
        studentdep =
                (EditText) findViewById(R.id.studentdep);

        fistuid = (EditText) findViewById(R.id.fistuid);
    }

    public void newStudent (View view) {
        MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);

        String id=studid.getText().toString();
        String dep=studentdep.getText().toString();

        Student student =
                new Student(id,studentname.getText().toString(),dep);


        dbHandler.addStudent(student);
        studid.setText("");
        studentname.setText("");
        studentdep.setText("");
    }

    public void lookupStudent (View view) {
        MyDBHandler dbHandler = new MyDBHandler(this, null, null, 1);
        Student student =
                dbHandler.findStudent(fistuid.getText().toString());



        if (student != null) {
            idView.setText(student.getID());

            studentdep.setText(student.get_Dep());

            nameView.setText(student.get_StudentName());
            depView.setText(student.get_Dep());
        } else {
            idView.setText("No Match Found");
        }

    }
}


