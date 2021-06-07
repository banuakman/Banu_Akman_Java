## Exercise 1: Converter Interface

1. Create your solution in an IntelliJ project called `ConverterInterface`.

2. Create two implementations of the below interface.

3. The first implementation must use if/else if/else statements and be called `ConverterIf`.

4. The second implementation must use switch statements and be called `ConverterSwitch`.

5. Create a class called `ConverterApplication` which has your main method.

6. Instantiate and use both the `ConverterIf` and `ConverterSwitch` classes in that main method.

7. Implement the interface of ` ConverterIf and ConverterSwitch` classes by using the code below:

```java
public interface Converter {

    /**
     * This method converts the given number into its corresponding month.
     * @param monthNumber the number you wish to convert to a month
     * @return the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
     */
    String convertMonth(int monthNumber);

    /**
     * This method converts the given number into its corresponding day of the week.
     * @param dayNumber number you wish to convert to a day of the week
     * @return the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
     * The first day of the week is Sunday
     */
    String convertDay(int dayNumber);

}