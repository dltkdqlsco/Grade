package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LetterGradeCourse CourseOne;
        PassFailCourse CourseTwo;
        String grade;

        CourseOne = new LetterGradeCourse("자료구조");
        CourseOne.setAttScore(95);
        CourseOne.setAssignScore(98);
        CourseOne.setExamScore(83);

        System.out.println(CourseOne.toString());
        System.out.println(CourseOne.getGrade(CourseOne.getTotal(CourseOne.getAttScore(), CourseOne.getAssignScore(), CourseOne.getExamScore())));
        System.out.println();

        CourseTwo = new PassFailCourse("교양세미나");
        CourseTwo.setAttScore(85);
        CourseTwo.setReportScore(92);
        CourseTwo.setPtScore(78);

        System.out.println(CourseTwo.toString());
        System.out.println(CourseTwo.getGrade(CourseTwo.getTotal(CourseTwo.getAttScore(), CourseTwo.getReportScore(), CourseTwo.getPtScore())));
    }
}