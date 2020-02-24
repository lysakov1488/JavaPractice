import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        Scanner in = new Scanner(System.in);
        String skobo4ki = in.next();
        boolean flag = true;

        for (int i = 0; i < skobo4ki.length(); i++) {

            char bracket = skobo4ki.charAt(i);

            if ( bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
                break;
            }

            if (stack.size() == 0) {
                flag = false;
                break;
            }

            switch (bracket) {

                case '}':

                    if ((stack.peek().toString() != "{")) {
                        flag = false;
                    } else {
                        stack.pop();
                    }
                    break;

                case ']':

                    if ((stack.peek().toString() != "[")) {
                        flag = false;
                    } else {
                        stack.pop();
                    }
                    break;

                case ')':

                    if ((stack.peek().toString() != "(")) {
                        flag = false;
                    } else {
                        stack.pop();
                    }
                    break;

            }

            if (!flag) {
                break;
            }

        }
        if (flag && stack.size() == 0) System.out.println("Правильная последовательность");
        else System.out.println("Неправильная последовательность");
    }
}