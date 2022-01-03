package M220103;

import java.util.Scanner;
import java.util.Random;

public class Soccer {
    static String name;
    public void setName(String name) {
        this.name = name;
    }
}

class Team1 extends Soccer {
    public void t1() {
        System.out.println("1팀");
    }
}

class Team2 extends Soccer {
    public void t2() {
        System.out.println("2팀");
    }
}

class Player1 extends Team1 {
    public void num1() { // 오버라이드 매개변수가 바뀌면 다르게인식 다만 자료형은 다르게
        System.out.println(this.name + "1팀소속");
    }

    class Player2 extends Team2 {
        public void num2() { // 오버라이드 매개변수가 바뀌면 다르게인식 다만 자료형은 다르게
            System.out.println("2팀소속");
        }
    }

    public static void main(String[] args) {
        M220103.num1 p1 = new num1();
        p1.setName("하");
    }
}