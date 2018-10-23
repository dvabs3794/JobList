package com.vaibhav.android.joblist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<Job> jobList = new ArrayList<>();
        jobList.add(new Job("1", "Android Developer"));
        jobList.add(new Job("2", "Web Developer"));
        jobList.add(new Job("3", "Python Developer"));
        jobList.add(new Job("4", "PHP Developer"));
        jobList.add(new Job("5", "MySQL Developer"));
        jobList.add(new Job("6", "Java Developer"));

        JobAdapter jobAdapter = new JobAdapter(this, jobList);

        ListView lv_job = findViewById(R.id.lv_job);
        lv_job.setAdapter(jobAdapter);

        lv_job.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Job job = (Job) adapterView.getAdapter().getItem(i);

                String jobID = job.getJobID();
                String jobTitle = job.getJobTitle();

                Intent intent = new Intent(ListActivity.this, DetailActivity.class);
                intent.putExtra("job_id", jobID);
                intent.putExtra("job_title", jobTitle);
                startActivity(intent);
            }
        });
    }
}
