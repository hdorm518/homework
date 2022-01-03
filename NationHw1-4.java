package M220103;

public class NationHw {
    public static void main(String[] args) {
        Korea kr = new Korea("한국어","한국",3300,4400,"1.3조",1945);
        Japan jp = new Japan("일본어","일본",3300,4400,"1.8조",1945);
        India in = new India("힌디어","인도",3200,4500,"0.37조",1947);
    
        kr.setLang("한국어");
        kr.gdp = 1.631 + " 조USD";
        jp.setCap("도쿄");
        jp.area = 37790000;
        in.setMoney("루피");
        in.people = 1380000000;
      
        System.out.println("한국 언어 : " + kr.getLang());
        System.out.println("한국 국민총생산 : " + kr.gdp);
        System.out.println("일본 면적 : " + jp.area);
        System.out.println("일본 수도 : " + jp.getCap());
        System.out.println("인도 화폐단위 : " + in.getMoney());
        System.out.println("인도에서 관측가능한 행성 : " + in.plannet);
    }
}

/*
 * 과제1) Class Nation 을 만들고 나라이름, 면적, 인구수를 멤버 변수로 만들고, 나라이름변경(), 면적변경(), 인구수변경()
 * 메소드를 만드시오.
 * 과제2) Class Nation 을 상속한 나라를 3개 만들고, 나라별로 특수한 멤버변수 하나와 메소드 하나를 생성하시오.
 * 과제3) Class Nation 을 나라이름을 private로 지정하고, 면적과 인구수는 public 으로 지정하시오.
 * 과제4) Class Nation 을 만들고 행성이름을 만들고 static으로 지정하시오.
 */

class Nation {
    private String name; // 나라이름
    public int area; // 면적
    public int people; // 인구수
    String gdp; // 국민총생산
    int money; //화폐단위
    static String plannet = "Moon " + "Sun"; // 관측행성

    void setName(String name) {
        this.name = name;
    }

    void setArea(int area) {
        this.area = area;
    }

    void setPeople(int people) {
        this.people = people;
    }

    Nation(String name, int area, int people, String gdp, int indi) {
        this.name = name;
        this.area = area;
        this.people = people;
        this.gdp = gdp;
        this.money = indi;
    }
    
}

// 과제2 상속 3나라 한국 일본 인도
class Korea extends Nation {
    private String lang;
    Korea(String lang, String name, int area, int people, String gdp, int indi){
        super(name, area, people, gdp, indi);
        this.lang =lang;

    }
    public void setLang(String lang) {
        this.lang = lang;
    }
    public String getLang(){
        return lang;
    }
}

class Japan extends Nation {
    private String cap;
    Japan(String cap, String name, int area, int people, String gdp, int indi){
        super(name, area, people, gdp, indi);
    }

    public void setCap(String cap) {
        this.cap = cap;
    }
    public String getCap(){
        return cap;
    }
    
}

class India extends Nation {
    private String money;
    India(String money, String name, int area, int people, String gdp, int indi) {
        super(name, area, people, gdp, indi);
    }

    public void setMoney(String money) {
        this.money = money;
    }
    public String getMoney(){
        return money;
    }
}