package level8;//https://www.codewars.com/kata/5808dcb8f0ed42ae34000031

public class SwitchNumbers {

    // Variant 1 (switch)
    public static String switchItUp(int number)    {
        String result = "";
        switch (number) {
            case 0: result = "Zero";
            break;
            case 1: result = "One";
            break;
            case 2: result = "Two";
            break;
            case 3: result = "Three";
            break;
            case 4: result = "Four";
            break;
            case 5: result = "Five";
            break;
            case 6: result = "Six";
            break;
            case 7: result = "Seven";
            break;
            case 8: result = "Eight";
            break;
            case 9: result = "Nine";
            break;
        }
        return result;
    }

    // Variant 2 (array)
    public static String switchItUp2(int number2)    {
        String[] result2 ={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"  };
        return result2 [number2];
    }


    public static void main(String[] args) {
        System.out.println(switchItUp(4));      // Variant 1 test
        System.out.println(switchItUp2(5));    // Variant 2 test
    }

}
