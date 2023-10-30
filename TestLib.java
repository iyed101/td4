public class TestLib {
    public static void main(String args[]){
        Librairie lib = new Librairie(4);
        Livree L1= new Roman("Rom1", 123, "dom1", 50, "iyed", "moh");
        Livree L2= new Magazine("Mag1", 147, "dom2", 60, 5);
        Livree L3= new Roman("Rom2", 369, "dom3", 70, "iyed", "mih");
        Livree L4= new Magazine("Mag2", 789, "dom4", 80, 7);
        lib.ajoutLive(L1);
        lib.ajoutLive(L2);
        lib.ajoutLive(L3);
        lib.ajoutLive(L4);
        lib.inventaire();
        System.out.println("*****************************************************************************************************");
        lib.inventaire("Roman");
        System.out.println("*****************************************************************************************************");
        lib.inventaire("Magazine");
        System.out.println("*****************************************************************************************************");
        System.out.println(lib.sommeRom());
    }
}
