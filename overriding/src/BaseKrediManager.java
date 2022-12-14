public class BaseKrediManager {
    public double hesapla(double tutar){  //hesapla braucht double tutar also deren wert um zu arbeiten

        return tutar * 1.18;
    }
}
 ///Hier eben wurde durch ogrencikredimanager die methode overirreded,also bei ogrenci auf 1.10
// wenn man aber neben public ein final hinschreiben würde, könnte man es nicht overriden