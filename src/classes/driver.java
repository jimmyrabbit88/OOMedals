package classes;

import java.sql.Time;

public class driver {
    public static void main(String[] args) {
        ClassDetails cla = new ClassDetails("Eng", "205");
        TimeTable tt = new TimeTable();
        tt.set(0,0, cla);
        tt.set(0,1, cla);
        tt.set(0,2, cla);
        tt.set(0,3, cla);
        tt.set(2,7, cla);
        tt.set(3,4, cla);
        tt.set(3,5, cla);
        tt.set(4,6, cla);
        tt.set(4,0, cla);

        tt.display();


    }
}
