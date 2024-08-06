package org.example;

public class Course {

    protected String subName;
    protected int attScore;

    public String getGrade(){
            return "";
    }

    public Course(String subName){
        this.subName = subName;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getAttScore() {
        return attScore;
    }

    public void setAttScore(int attScore) {
        this.attScore = attScore;
    }

    @Override
    public String toString() {
        return "이름: " + subName + "\n" +
                "출석 점수: " + attScore;
    }
}
