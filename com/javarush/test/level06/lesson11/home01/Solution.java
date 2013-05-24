package com.javarush.test.level06.lesson11.home01;

/**
 * JavaRush.ru
 * Level 06, Lesson 11, home 01
 * <p/>
 * Создай класс кот - Cat. В нем создай статическую переменную catCount. Пусть при каждом создании кота эта переменная
 * увеличивается на 1. Создать 10 объектов Cat и вывести  значение переменной catCount на экран.
 * <p/>
 * Date: 27.01.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        for ( int i = 0; i < 10; i++ )
        {
            new Cat();
        }

        System.out.println( Cat.catCount );
    }

    public static class Cat
    {
        static int catCount;

        public Cat()
        {
            catCount++;
        }
    }

}
