package Latihan2_Inheritance;

public class Employ extends Person {
    private String noKaryawan;

    public Employ (String noKaryawn, String name, int age) {
        super(name, age);    
        this.noKaryawan = noKaryawn;
    }
    
    public void info () {
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
