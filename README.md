# Практична робота "Створення і використання статичних методів"

# Виконання:

## Я описав завдання номер 23 "Розрахунок числа долі за заданою датою народження".

# Код:

## CLASS Exercise:
```java
package domain;
public class Exercise {
    public static String Calculate(String s) {
        while (s.length() > 1) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += (c - '0');
                }
            }
            s = String.valueOf(sum);
        }
        return s;
    }
}
``` 
## CLASS TestResult:
```java
package test;
import domain.Exercise;
public class TestResult {
    public static void main(String[] args) {
        String s = "17.01.2003";
        System.out.println("You number of fate = "+ Exercise.Calculate(s));
    }
}
``` 
## Скріншоти

![Done](https://github.com/ppc-ntu-khpi/35---static-methods-KyshynetsVlad/blob/master/Scrins/1.png "Done")
![Done](https://github.com/ppc-ntu-khpi/35---static-methods-KyshynetsVlad/blob/master/Scrins/2.png "Done")

## Документація
[Сайт](https://ppc-ntu-khpi.github.io/35---static-methods-KyshynetsVlad/)
