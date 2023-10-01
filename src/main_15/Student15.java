package main_15;

public class Student15 {

    String firstname, lastname, year, course, section;
    float midtermGrade, finalGrade;

    Student15(String firstname,
              String lastname,
              String year,
              String course,
              String section,
              float midtermGrade){

        this.firstname = firstname;
        this.lastname = lastname;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
    }

    void evaluateGrade(){

        float average = (midtermGrade + finalGrade) / 2;
        System.out.println("Full name : " + firstname + " " + lastname);
        System.out.println("Average   : " + average);

        String remark;

        if(average > 100) remark = "Invalid Garde";
        else if(average > 98) remark = "With Highest Honor";
        else if(average > 95) remark = "With High Honor";
        else if(average > 90) remark = "With Honor";
        else if(average > 75) remark = "Passed";
        else remark = "Failed";


        System.out.println("remark : " + remark);


    }
}