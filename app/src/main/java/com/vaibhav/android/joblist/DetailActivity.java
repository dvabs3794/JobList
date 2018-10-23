package com.vaibhav.android.joblist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String jobID = intent.getStringExtra("job_id");
        String jobTitle = intent.getStringExtra("job_title");

        TextView tv_job_id = findViewById(R.id.tv_job_id);
        tv_job_id.setText("Job ID: " + jobID);

        TextView tv_job_title = findViewById(R.id.tv_job_title);
        tv_job_title.setText("Job Title: " + jobTitle);
    }
}
