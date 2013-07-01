package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * JavaRush.ru
 * Level 09, Lesson 11, Home 09
 * <p/>
 * Создать класс кот - Cat, с полем "имя" (String). Создать словарь Map(<String, Cat>) и добавить туда 10 котов в
 * виде "Имя"-"Кот". Получить из Map множество (Set) всех имен и вывести его на экран.
 * <p/>
 * Date: 19.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet( map );

        printCatSet( set );
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put( "Murka", new Cat( "Murka" ) );
        map.put( "Murzik", new Cat( "Murzik" ) );
        map.put( "Vas'ka", new Cat( "Vas'ka" ) );
        map.put( "Pushok", new Cat( "Pushok" ) );
        map.put( "Bobik", new Cat( "Bobik" ) );
        map.put( "Zhuchka", new Cat( "Zhuchka" ) );
        map.put( "Koteg", new Cat( "Koteg" ) );
        map.put( "Dymka", new Cat( "Dymka" ) );
        map.put( "Tom", new Cat( "Tom" ) );
        map.put( "Begemot", new Cat( "Begemot" ) );

        return map;
    }

    public static Set<Cat> convertMapToSet( Map<String, Cat> map )
    {
        return new HashSet<Cat>( map.values() );
    }

    public static void printCatSet( Set<Cat> set )
    {
        for ( Cat cat : set )
        {
            System.out.println( cat );
        }
    }

    public static class Cat
    {
        private String name;

        public Cat( String name )
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat " + this.name;
        }
    }
}
