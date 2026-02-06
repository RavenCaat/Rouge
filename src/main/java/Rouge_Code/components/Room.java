package Rouge_Code.components;
public class Room {
    private int laenge;
    private int breite;
    //Anzahl an eingängen
    private int Gates;
    //Pro Raum gibt es maximal eine Tür in jede Richtung die jeweilige variabel legtfest auf welcher länge bzw. breite diese liegen.
    //z.B. wenn GN = 5 dann liegt die nördliche Tür auf breite 5.
    //Wenn der Wert 0 entspricht exestiert die Tür nicht.
    private int GN, GW, GS, GE;


    public Room(int plaenge, int pbreite, int pGates, int pGN, int pGW, int pGS, int pGE){
        this.laenge = plaenge;
        this.breite = pbreite;
        this.Gates = pGates;
        this.GN = pGN;
        this.GW = pGW;
        this.GS = pGS;
        this.GE = pGE;
    }

    public int getLaenge(){
        return this.laenge;
    }
    public int getBreite(){
        return this.breite;
    }
    public int getGates(){
        return this.Gates;
    }
    public int getGN(){
        return this.GN;
    }
    public int getGW(){
        return this.GW;
    }
    public int getGS(){
        return this.GS;
    }
    public int getGE(){
        return this.GE;
    }
}
