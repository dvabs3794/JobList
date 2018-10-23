package com.vaibhav.android.joblist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class JobAdapter extends ArrayAdapter<Job> {
    public JobAdapter(@NonNull Context context, @NonNull List<Job> jobList) {
        super(context, 0, jobList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_job, parent, false);
        }

        Job job = getItem(position);

        String jobTitle = job.getJobTitle();

        TextView tv_job_title = convertView.findViewById(R.id.tv_job_title);
        tv_job_title.setText(jobTitle);

        return convertView;
    }
}
