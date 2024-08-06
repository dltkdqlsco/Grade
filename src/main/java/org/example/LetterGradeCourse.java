package org.example;

public class LetterGradeCourse extends Course{

    int assignScore;
    int examScore;

    public LetterGradeCourse(String cname){
        super(cname);
        assignScore = 0;
        examScore = 0;
    }

    public double getTotal(int attend, int assign, int exam){
        return ((attend * 0.2) + (assign * 0.3) + (exam * 0.5));
    }

    public String getGrade(double grade){
        if(grade >= 90){
            return "학점: A";
        } else if (grade >= 80 && grade < 90) {
            return "학점: B";
        } else if (grade >= 70 && grade < 80) {
            return "학점: C";
        } else if (grade >= 60 && grade < 70) {
            return "학점: D";
        } else{
            return "학점: F";
        }

    }

    public int getAssignScore() {

        return assignScore;
    }

    public void setAssignScore(int assignScore) {
        this.assignScore = assignScore;
    }

    public int getExamScore() {
        return examScore;
    }

    public void setExamScore(int examScore) {
        this.examScore = examScore;
    }

    @Override
    public String toString() {
        return "이름: " + super.subName + "\n" +
                "출석 점수: " + attScore + "\n" +
                "시험 점수: " + examScore + "\n";
    }
}
