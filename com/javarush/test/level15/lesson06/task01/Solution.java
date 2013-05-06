package com.javarush.test.level15.lesson06.task01;

import java.io.Serializable;

/**
 * JavaRush.ru
 * Level 15, Lesson 06, Task 01
 * <p/>
 * Максимально простой код. <b/>
 * Упрости код - убери все наследования классов, которые и так будут добавлены автоматически при компиляции
 * PS: Взаимосвязь между объектами me и zapp - Has-a (использует): http://ru.wikipedia.org/wiki/Has-a
 * <p/>
 * Date: 06.05.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println( me.askHubert( "What do you think about level15.lesson06.task01?" ) );
        System.out.println( me.askZapp( "When will be the next update?" ) );
    }

    public interface SpecificSerializable extends Serializable
    {
    }

    public static class JavaDev implements SpecificSerializable
    {
        String answerQuestion( String question )
        {
            return String.format( "I'll be thinking of [%s]", question );
        }
    }

    public static class JuniorJavaDev extends JavaDev
    {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp( String question )
        {
            return zapp.answerQuestion( question );
        }

        String askHubert( String question )
        {
            return hubert.answerQuestion( question );
        }
    }
}
