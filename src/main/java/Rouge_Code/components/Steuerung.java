package Rouge_Code.components;

public class Steuerung {
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

    public Room [] rooms ={Start, Finish, LshapeNW, LshapeNE, LshapeSE, LshapeSW,Cross,LineSN,LineWE,TshapeS,TshapeN,TshapeW,TshapeE};
}
