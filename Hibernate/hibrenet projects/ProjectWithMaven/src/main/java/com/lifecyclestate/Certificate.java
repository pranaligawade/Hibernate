package com.lifecyclestate;

import javax.persistence.Embeddable;

// class embeded with student
@Embeddable

public class Certificate {
   private   String course;
   private  String duration;

    public Certificate() {
    }

    public Certificate(String course, String duration) {
        this.course = course;
        this.duration = duration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
