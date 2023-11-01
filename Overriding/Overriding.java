public class Overriding{
    public static void main(String[] args){
        Balok2 balok1 = new Balok2(3, 4, 5);
        Kubus2 kubus1 = new Kubus2(4);
        System.out.println("Volume Balok: " + balok1.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + balok1.hitungLuasPermukaan());
        System.out.println("Volume Kubus: " + kubus1.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus1.hitungLuasPermukaan());
    }
}
