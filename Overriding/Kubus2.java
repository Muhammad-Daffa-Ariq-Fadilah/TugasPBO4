class Kubus2 extends Balok2{
    public Kubus2(double sisi){
        super(sisi, sisi, sisi);
    }
    public double hitungVolume(){
        return panjang * panjang * panjang;
    }
    public double hitungLuasPermukaan(){
        return 6 * panjang * panjang;
    }
}