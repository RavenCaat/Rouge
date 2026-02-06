package Rouge_Code.components;

public class Level {
    Room Level[][];

    private int size, difficulty;

    public Level(int pSize, int pDifficulty) {
        this.size = pSize;
        this.difficulty = pDifficulty;
    }
    Room Start = new Room(5,5,1,0,0,3,0);
    Room Finish = new Room(5,5,1,3,0,0,0);
    Room LshapeNW = new Room(5,5,2,3,0,0,3);
    Room LshapeNE = new Room(5,5,2,3,3,0,0);
    Room LshapeSE = new Room(5,5,2,0,3,3,0);
    Room LshapeSW = new Room(5,5,2,0,0,3,3);
    Room Cross = new Room(5,5,4,3,3,3,3);
    Room LineSN = new Room(5,5,2,3,0,3,0);
    Room LineWE = new Room(5,5,2,0,3,0,3);
    Room TshapeS = new Room(5,5,3,0,3,3,3);
    Room TshapeN = new Room(5,5,3,3,3,0,3);
    Room TshapeW = new Room(5,5,3,3,3,3,0);
    Room TshapeE = new Room(5,5,3,3,0,3,3);

    //Arrays für alle Räume die einen Weg in eine bestimte richtung haben
    //roomsN hat also alle Räume mit einem Weg richtung Norden
    public Room [] roomsN ={LshapeNW,LshapeNE,Cross,LineSN,TshapeN,TshapeW,TshapeE};
    public Room [] roomsS ={LshapeSE,LshapeSW,Cross,LineSN,TshapeS,TshapeW,TshapeE};
    public Room [] roomsE ={LshapeSE,LshapeNE,Cross,LineWE,TshapeS,TshapeE,TshapeN};
    public Room [] roomsW ={LshapeSW,LshapeNW,Cross,LineWE,TshapeS,TshapeW,TshapeN};


    public void createLevel() {
        Level[3][3] = Start;
    }
}