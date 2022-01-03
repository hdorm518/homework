package M220103;

import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] game = { "가위", "바위", "보" };
        Random rd = new Random();
        int com = rd.nextInt(3) + 1;
        int user = rd.nextInt(3) + 1;
        System.out.println("유저1 : " + game[user - 1]);
        System.out.println("유저2 : " + game[com - 1]);
        String result;
        result = "무승부~!!";
        if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1))
            result = "유저2가 이겼습니다.";
        if ((user == 2 && com == 1) || (user == 3 && com == 2) || (user == 1 && com == 3))
            result = "유저1이 이겼습니다.";
        System.out.println(">> 승자 : " + result);
    }
}