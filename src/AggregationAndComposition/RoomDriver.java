package AggregationAndComposition;

public class RoomDriver {
	public static void main(String[] args) {
		Room room=new Room(600);
		System.out.println(room.getArea());
		
		House h=new House("red",room);

		//System.out.println(h.setArea());
		System.out.println(h.getColor());
		
		HouseComposition hc=new HouseComposition("Neela",650);
		System.out.println(hc.getRoom().getArea());
		System.out.println(hc.getColor());
	}
}
