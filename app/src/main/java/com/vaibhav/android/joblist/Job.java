package com.vaibhav.android.joblist;

public class Job {
    String jobID;
    String jobTitle;

    public Job(String jobID, String jobTitle) {
        this.jobID = jobID;
        this.jobTitle = jobTitle;
    }

    public String getJobID() {
        return jobID;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
