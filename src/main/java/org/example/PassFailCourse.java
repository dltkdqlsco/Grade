package org.example;

import java.sql.PseudoColumnUsage;

public class PassFailCourse extends Course{
    int reportScore;
    int ptScore;

    public PassFailCourse(String cname){
        super(cname);
        reportScore = 0;
        ptScore = 0;
    }

    public double getTotal(int attend, int report, int pt){
        return (attend * 0.2) + (report * 0.6) + (pt * 0.2);
    }

    public String getGrade(double grade){
        if(grade >= 60){
            return "학점: CR";
        }else{
            return "학점: NC";
        }
    }

    public int getReportScore() {
        return reportScore;
    }

    public void setReportScore(int reportScore) {
        this.reportScore = reportScore;
    }

    public int getPtScore() {
        return ptScore;
    }

    public void setPtScore(int ptScore) {
        this.ptScore = ptScore;
    }

    @Override
    public String toString() {
        return "이름: " + super.subName + "\n" +
                "출석 점수: " + reportScore + "\n" +
                "발표 점수: " + ptScore + "\n";
    }
}
