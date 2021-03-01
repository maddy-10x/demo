package com.todo.app.service;

import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class SonarProblemService {

    private int numberOne;
    private int numberTwo;
    private int numberThree;

    private String name;

    public int getSum(){
        numberThree = numberOne + numberTwo;
        return numberThree;
    }

    public int calculateSum(){
        numberThree = numberOne + numberTwo;
        return numberThree;
    }

    public String getFirstName(){
        String firstName = this.name.split(",")[0];
        return firstName;
    }

    public String getLastName(){
        String lastName = this.name.split(",")[1];
        return lastName;
    }

    public String greet(){
        // Some logic on how to greet
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        boolean monday = cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY;
        if(monday){
            return "Hello, " + this.name + "  Let's start the week";
        }
        this.name = null;

        // Some more logic on if it's Friday
        cal = Calendar.getInstance();
        cal.setTime(new Date());
        boolean friday = cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;
        if(friday){
            return "Hello, " + this.name + "  Have a nice weekend.";
        }



            String firstName = this.name.split(",")[0];
            String lastName = this.name.split(",")[1];
            return "Hello " + firstName + " " + lastName;

    }

}
