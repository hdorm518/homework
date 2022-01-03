package M220103;

public class ComputerPart {
    public static void main(String[] args) {
        Cpu cp = new Cpu("i7-8700k", "5.0Ghz");
        Ram ra = new Ram("DDR4", "3200Mhz");
        Main ma = new Main("Asrock", "Z370");
        Vga vg = new Vga("Zotac2070S", "1800Mhz");
        Power po = new Power("Fsp", "650GP");
        Ssd ss = new Ssd("Samsung", "1Tb");

        System.out.printf(cp.name + " " + cp.spec+"\n");
        System.out.printf(ra.name + " " + ra.spec+"\n");
        System.out.printf(ma.name + " " + ma.spec+"\n");
        System.out.printf(vg.name + " " + vg.spec+"\n");
        System.out.printf(po.name + " " + po.spec+"\n");
        System.out.printf(ss.name + " " + ss.spec+"\n");
        System.out.println("제품 조립 가능합니다.");
    }
}

class Assemble {

    String name; // 제품이름
    String spec; // 제품스펙
}

// cpu
class Cpu extends Assemble {
    public Cpu(String name, String spec) {
        this.name = name;
        this.spec = spec;
        System.out.println();
    }
    public void name() {
    }
    public void spec(){
    }
}


// ram
class Ram extends Assemble {
    public Ram(String name, String spec) {
        this.name = name;
        this.spec = spec;
    }
    public void name1() {
    }
    public void spec1(){
    }
}

// Main
class Main extends Assemble {
    public Main(String name, String spec) {
        this.name = name;
        this.spec = spec;
    }
    public void name() {
    }
    public void spec(){
    }
}

// vga
class Vga extends Assemble {
    public Vga(String name, String spec) {
        this.name = name;
        this.spec = spec;
    }
    public void name() {
    }
    public void spec(){
    }
}

// power
class Power extends Assemble {
    public Power(String name, String spec) {
        this.name = name;
        this.spec = spec;
    }
    public void name() {
    }
    public void spec(){
    }
}

// ssd
class Ssd extends Assemble {
    public Ssd(String name, String spec) {
        this.name = name;
        this.spec = spec;
    }
    public void name() {
    }
    public void spec(){
    }
}