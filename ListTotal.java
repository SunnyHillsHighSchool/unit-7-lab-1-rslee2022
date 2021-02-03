//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Rachel Lee
//Date - 02/03/2021

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{

 //Method that totals up the values in a list
 //Take in Integer ArrayList called NumList as parameter: ArrayList<Integer> numList
 public static int total( List<Integer> ray )
 {
    //Create an integer sum, set equal to 0
    int sum = 0;
    //Use a for-each loop: integer i as loop control variable
    for(int i : ray) {
      //set total equal to total plus i
      sum += i;
    }
    //return total
    return sum;
 }

}