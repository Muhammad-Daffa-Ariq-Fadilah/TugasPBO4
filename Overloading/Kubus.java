class Kubus{
    double sisi;
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    public double hitungVolume(){
        return sisi * sisi * sisi;
    }
    public double hitungLuasPermukaan(){
        return sisi * sisi * 6;
    }
}