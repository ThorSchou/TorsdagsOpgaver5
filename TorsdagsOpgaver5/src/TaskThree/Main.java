package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<Room>();

        Room room1 = new Room(1, 1);
        rooms.add(room1);
        Room room2 = new Room(2, 2);
        rooms.add(room2);
        Room room3 = new Room(3, 3);
        rooms.add(room3);

        Building building = new Building(rooms, 3);

        System.out.println(countLampsInBuilding(building));
        System.out.println(countWindowsInBuilding(building));
        System.out.println(countRoomsInBuilding(building));

        System.out.println(isNormal(building));
    }

    static boolean isNormal(Building building){
        if(building.getNumberOfFloors() >= countRoomsInBuilding(building)){
            return true;
        }else{
            return false;
        }
    }

    static int countLampsInBuilding(Building building) {

        int lamps = 0;
        for (Room r : building.getRooms()) {
            lamps += r.getNumberOfLamps();
        }
        return lamps;
    }

    static int countWindowsInBuilding(Building building) {

        int windows = 0;
        for (Room r : building.getRooms()){
            windows += r.getNumberOfWindows();
        }
        return windows;
    }

    static int countRoomsInBuilding(Building building) {

        int rooms = 0;
        for (Room r : building.getRooms()){
            rooms++;
        }
        return rooms;
    }
}
