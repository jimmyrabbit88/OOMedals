package classes;

public class TimeTable {
    private final int DAYS = 5;
    private final int HOURS = 9;
    private ClassDetails [][] grid;
    private String[] days = new String[]{"Mon","Tue","Wed","Thu","Fri"};
    private String[] time = new String[]{"9-10","10-11","11-12","12-1","1-2","2-3","3-4","4-5","5-6"};

    public TimeTable(){
        grid = new ClassDetails[DAYS][HOURS];
    }

    public void set(int day, int hour, ClassDetails details){
        grid[day][hour] = details;

    }

    public void display(){

        for(String t : time){
            System.out.print("          " + t);
        }
        for(int i=0; i<DAYS; i++){
            System.out.print("\n" + days[i]);
            for(int j=0; j<HOURS; j++){
                System.out.print("        " + grid[i][j]);
            }
        }
    }

    public ClassDetails get(int day, int hour){
        ClassDetails cd = grid[day][hour];
        return cd;
    }

    public int getNumberOfClassesFor(String name){
        //
        return 0;
    }

    public int getNumberOfFreeSlots(){
        return 0;
    }
}
