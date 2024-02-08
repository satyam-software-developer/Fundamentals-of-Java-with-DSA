
//Decision-making instructions in Java
//        If-Else Statement
//        Switch Statement
//        If-Else Statement
//        Syntax of If-else statement in Java :
//
///* if (condition-to-be-checked) {
//	statements-if-condition-true;
//}
//else {
//	statements-if-condition-false;
//} */

//if-else ladder :
//        Instead of using multiple if statements, we can also use else if along with if thus forming an if-else-if-else ladder.
//        Using such kind of logic reduces indents.
//        Last else is executed only if all the conditions fail.
///* if (condition1) {
//
//            //Statements;
//
//else if {
//
//            // Statements;
//
//}
//
//else {
//
//            //Statements
//
//} */





package com.satyam_java;

public class sat_16_conditionals {


    public static void main(String[] args) {

        int a = 29;
        if (a>18) {
            System.out.println("You can drive");
        }
        else{
            System.out.println("You are underage!");
        }

    }
}
