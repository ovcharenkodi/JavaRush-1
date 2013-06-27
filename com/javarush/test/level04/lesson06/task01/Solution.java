package com.javarush.test.level04.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 04, Lesson 06, Task 01
 * <br>
 * Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
 * <br>
 * Date: 20.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int firstNumber = Integer.parseInt( reader.readLine() );
        int secondNumber = Integer.parseInt( reader.readLine() );

        System.out.println( min( firstNumber, secondNumber ) );
    }

    private static int min( int a, int b )
    {
        return a < b ? a : b;
    }
}
