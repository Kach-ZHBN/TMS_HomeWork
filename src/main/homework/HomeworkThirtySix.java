package homework;

import java.util.*;

public class HomeworkThirtySix {
    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));

        System.out.println("---------------------------");

        System.out.println(pairs(new String[]{"code", "bug"}));
        System.out.println(pairs(new String[]{"man", "moon", "main"}));
        System.out.println(pairs(new String[]{"man", "moon", "good", "night"}));

        System.out.println("---------------------------");

        System.out.println(isBalanced("[(]"));
    }


    /*
    Задача 1:
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
    строка является ключом, и ее значение равно true, если эта строка встречается в массиве
    2 или более раз.
     */
    public static Map<String, Boolean> wordMultiple(String[] inputStrings) {
        Map<String, Boolean> resultMap = new HashMap<>();
        for (String inputString : inputStrings) {
            if (resultMap.containsKey(inputString)) {
                resultMap.put(inputString, true);
            } else {
                resultMap.put(inputString, false);
            }
        }
        return resultMap;
    }


    /*
    На вход поступает массив непустых строк, создайте и верните Map<String,
    String> следующим образом: для каждой строки добавьте ее первый символ в
    качестве ключа с последним символом в качестве значения.
     */
    public static Map<String, String> pairs(String[] inputStrings) {
        Map<String, String> resultMap = new HashMap<>();
        for (String inputString : inputStrings) {
            resultMap.put(String.valueOf(inputString.charAt(0)), String.valueOf(inputString.charAt(inputString.length() - 1)));
        }
        return resultMap;
    }

    /*
    Задача *:
    Задана строка, которая может иметь внутри себя скобки. Скобкой считается
    любой из следующих символов — «(«, «)», «[«, «]», «{«, «}». Проверить
    сбалансированность расстановки скобок в этой строке. Набор скобок считается
    сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
    соответствующей закрывающей скобки ")", "]" и "} ", соответственно. Строка,
    содержащая пары скобок, не сбалансирована, если набор заключенных в нее
    скобок не совпадает
     */
    public static boolean isBalanced(String inputStrings) {
        char[] symbols = inputStrings.toCharArray();
        Map<Character, Character> oppositeSymbol = new HashMap<>();
        oppositeSymbol.put('(', ')');
        oppositeSymbol.put(')', '(');
        oppositeSymbol.put('{', '}');
        oppositeSymbol.put('}', '{');
        oppositeSymbol.put('[', ']');
        oppositeSymbol.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char symbol : symbols) {

                if(stack.isEmpty()){
                    stack.push(symbol);
                    continue;
                }

                if(stack.peek().equals(oppositeSymbol.get(symbol))){
                    stack.pop();
                }else{
                    stack.push(symbol);
                }
        }
        return stack.isEmpty();
    }
}