package com.javarush.test.level15.lesson12.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * JavaRush.ru
 * Level 15, Lesson 12, Home 09
 * <p/>
 * Парсер реквестов
 * Считать с консоли URl ссылку
 * Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются & , например, lvl=15)
 * URL содержит минимум 1 параметр
 * Если присутствует параметр obj, то передать его значение в нужный метод alert.
 * alert(double value) - для чисел (дробные числа разделяются точкой)
 * alert(String value) - для строк
 * <br>
 * Пример 1
 * Ввод:
 * http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
 * Вывод:
 * lvl view name
 * <br>
 * Пример 2
 * Ввод:
 * http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
 * Вывод:
 * obj name
 * double 3.14
 * <p/>
 * Date: 04.07.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String[] parameters = reader.readLine().split( "\\?" );

        if ( parameters.length < 2 )
        {
            return;
        }

        parameters = parameters[1].split( "&" );

        for ( String s : parameters )
        {
            System.out.print( s.split( "=" )[0] + " " );
        }
        System.out.println();

        for ( String s : parameters )
        {
            String[] nextParameter = s.split( "=" );

            if ( "obj".equals( nextParameter[0] ) )
            {
                try
                {
                    alert( Double.parseDouble( nextParameter[1] ) );
                }
                catch ( NumberFormatException e )
                {
                    alert( nextParameter[1] );
                }
            }
        }
    }

    public static void alert( double value )
    {
        System.out.println( "double " + value );
    }

    public static void alert( String value )
    {
        System.out.println( "String " + value );
    }
}
