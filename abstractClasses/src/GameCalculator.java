public abstract class GameCalculator {
    public abstract void hesapla();         //wer das benutzt, muss das overriden also eigene hesapla schreiben
                                            //In dem Fall für jeden Spieler gibt es unterschiedliche Punkte, deswegen für jeden ein eigenes overriding
                                            //Also wer das inheritaded muss es auch overriden
    public final void gameover(){           //final bedeutet, gameover muss so benutzt werden, keine overriding also Veränderung
        System.out.println("Oyun bitti");
    }
}
