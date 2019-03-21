package classes;

public class ClassDetails {
    private String name;
    private String roomNumber;

    //constructor and getters and setters
    public ClassDetails(String name, String roomNumber) {
        this.setName(name);
        this.setRoomNumber(roomNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return name + " " + roomNumber;
    }
}
