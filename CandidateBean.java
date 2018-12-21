/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wipro.candidate.bean;

/**
 *
 * @author admin
 */
public class CandidateBean {

    private String id;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    private String result;
    private String grade;
    private String grade1;
    public void setName(String name1) {
         this.name=name1;
    }
    public String getName()
            {
                return name; 
            }
	
    public String getid()
            {
                return id; 
            }
    public void setid(String id1) {
         this.id=id1;
    }
    public String getResult()
            {
                   return result; 
            }
    public int getM1()
            {
                return m1; 
            }
    public void setM1(int M1) {
         this.m1=M1;
    }
    public int getM2()
            {
                return m2; 
            }
    public void setM2(int M2) {
         this.m2=M2;
    }
    public int getM3()
            {
                return m3; 
            }
    public void setM3(int M3) {
         this.m3=M3;
    }

    public void setResult() {
        int result1=(m1+m2+m3);
        if(result1>=240)
        {
            result="PASS";
            grade1="DISTINCTION";
        }
        if((result1>=180)&&(result1<240))
        {
            result="PASS";
            grade1="FIRST CLASS";
        }
        if((result1>=150)&&(result1<180))
        {
            result="PASS";
            grade1="THIRD CLASS";
        }
         if((result1>=105)&&(result1<150))
        {
            result="FAIL";
            grade1="-";
        }
    }
        public String getGrade()
            {
                return grade; 
            }
    public void setGrade() {
       this.grade=grade1;
    }
}