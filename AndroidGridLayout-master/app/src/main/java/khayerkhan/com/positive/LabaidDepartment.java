package khayerkhan.com.positive;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import edmt.dev.androidgridlayout.R;

public class LabaidDepartment extends AppCompatActivity {
    ActionBar actionBar;

    ListView lst;
    String[] departmentname = {"Medicine", "Internal Medicine", "Cardiology", "Gastroenterology", "Colorectal Surgery", "General sergery", "Orthopedic", "Urology", "Pulmonology", "Rheumatology"};
    Integer[] imgid = {R.drawable.medicine, R.drawable.medicine, R.drawable.cardiac, R.drawable.gastro, R.drawable.surgery, R.drawable.surgery, R.drawable.orthopedics, R.drawable.urologys, R.drawable.pulmonolgy, R.drawable.rhematoloy};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labaid_department);
        actionBar=getSupportActionBar();
        actionBar.setTitle("Labaid Hospital Department List");

        MyListAdapter adapter=new MyListAdapter(this, departmentname,imgid);
        lst=(ListView)findViewById(R.id.listview);
        lst.setAdapter(adapter);

        final String s1="medicine.html";

        final String s2="internal.html";
        final String s3="index.html";

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Intent i=new Intent(LabaidDepartment.this,LabaidView.class);
                    i.putExtra("Q",s1);
                    startActivity(i);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Intent i=new Intent(LabaidDepartment.this,LabaidView.class);
                    i.putExtra("Q",s2);
                    startActivity(i);
                }

                else if(position == 2) {

                    Intent i=new Intent(LabaidDepartment.this,LabaidView.class);
                    i.putExtra("Q",s3);
                    startActivity(i);

                    //Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
                }
                else if(position == 5) {

                    Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
                }
                else if(position == 6) {

                    Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
                }
                else if(position == 7) {

                    Toast.makeText(getApplicationContext(),"Under construction",Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
}




class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] departmentname;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] departmentname, Integer[] imgid) {
        super(context, R.layout.customlist, departmentname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.departmentname=departmentname;
        this.imgid=imgid;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.customlist, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.textid);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageid);

        titleText.setText(departmentname[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;

    };
}









