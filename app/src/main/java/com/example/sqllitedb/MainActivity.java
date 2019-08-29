package com.example.sqllitedb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.SQLData;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editRollno,editName,editMarks;
    Button btnAdd,btnDelete,btnModify,btnView,btnViewAll,btnShowInfo;
    SQLData sqlData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editRollno=findViewById(R.id.editRollNo);
        editName=findViewById(R.id.editName);
        editMarks=findViewById(R.id.editmarks);
        btnAdd=findViewById(R.id.btnadd);
        btnDelete=findViewById(R.id.btndelete);
        btnModify=findViewById(R.id.btnmodify);
        btnView=findViewById(R.id.btnview);
        btnViewAll=findViewById(R.id.btnviewall);
        btnShowInfo=findViewById(R.id.btnshow);
        btnAdd.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnModify.setOnClickListener(this);
        btnView.setOnClickListener(this);
        btnViewAll.setOnClickListener(this);
        btnShowInfo.setOnClickListener(this);
        //sqlData=openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE,null);
        //sqlData.execSQL("CREAT TABLE IF NOT EXISTS student(rollno VARCHAR)");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnadd:
                Toast.makeText(this, "add"+btnAdd.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.btndelete:
                Toast.makeText(this, "delete"+btnDelete.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnmodify:
                Toast.makeText(this, "modify"+btnModify.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnview:
                Toast.makeText(this, "view"+btnView.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnviewall:
                Toast.makeText(this, "viewall"+btnViewAll.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnshow:
                Toast.makeText(this, "show"+btnShowInfo.getText(), Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
