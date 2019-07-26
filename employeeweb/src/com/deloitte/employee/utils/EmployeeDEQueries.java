package com.deloitte.employee.utils;

public class EmployeeDEQueries {

      public static final String INSERTQUERY ="insert into employee values(?,?,?,?,?)";
      public static final String UPDATEQUERY = "update employee set empname=?,job=?,salary=?,datejoin=? where empcode=?";
      public static final String DELETEQUERY = "delete from employee where empcode=?";
      public static final String GETEMPLSQUERY = "select * from employee";

}
