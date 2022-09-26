package Hotel;

import java.util.ArrayList;
import java.util.Scanner;

class Bookings {

	private Customer user;
	ArrayList<Room> rooms;

	private int booking_Id;
	private String booking_type;

	public int getBooking_Id() {
		return booking_Id;
	}

	public void setBooking_Id(int booking_Id) {
		this.booking_Id = booking_Id;
	}

	public String getBooking_type() {
		return booking_type;
	}

	public void setBooking_type(String booking_type) {
		this.booking_type = booking_type;
	}

}

class Customer {

//	private int customer_id;
	private String name;
	private String address;
	private String phone_no;

//	public int getCustomer_id() {
//		return customer_id;
//	}
//
//	public void setCustomer_id(int customer_id) {
//		this.customer_id = customer_id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public void takeUserInput() {
		System.out.println("Please provide the below details : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Full name :");
		String name = sc.nextLine();
		System.out.println("2. Address :");
		String address = sc.nextLine();
		System.out.println("3. Phone number :");
		String phone_no = sc.nextLine();
		System.out.println("Your details : ");
		System.out.println("Your name is : " + name);
		System.out.println("Your address is : " + address);
		System.out.println("Your number is : " + phone_no);
	}
}

class RoomType {
	private int single_occupancy;
	private int double_occupancy;
	private Price room_price;

	public Price getRoom_price() {
		return room_price;
	}

	public void setRoom_price(Price room_price) {
		this.room_price = room_price;
	}

	public int getSingle_occupancy() {
		return single_occupancy;
	}

	public void setSingle_occupancy(int single_occupancy) {
		this.single_occupancy = single_occupancy;
	}

	public int getDouble_occupancy() {
		return double_occupancy;
	}

	public void setDouble_occupancy(int double_occupancy) {
		this.double_occupancy = double_occupancy;
	}

	public void room_Choice() {
		System.out.println("");
		System.out.println("Choose the type of room from below category : ");
		System.out.println("1. Single Occupency with AC");
		System.out.println("2. Single Occupency without AC");
		System.out.println("3. Double Occupency with AC");
		System.out.println("4. Double Occupency without AC");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = input.nextInt();
		String choice;
//		this.getRoom_price()

		switch (num) {
		case 1:
			choice = "Single Occupency with AC";
			System.out.println("You selected " + choice + " room");
			System.out.println("Your total price is : 3000");
			break;

		case 2:
			choice = "Single Occupency without AC";
			System.out.println("You selected " + choice + " room");
			System.out.println("Your total price is : 2000");
			break;

		case 3:
			choice = "Double Occupency with AC";
			System.out.println("You selected " + choice + " room");
			System.out.println("Your total price is : 5000");
			break;

		case 4:
			choice = "Double Occupency without AC";
			System.out.println("You selected " + choice + " room");
			System.out.println("Your total price is : 4000");
			break;

		default:
			choice = "Invalid choice";
			break;
		}
	}
}

class Price {
	private String room_type;
	private int room_price;

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public int getRoom_price() {
		return room_price;
	}

	public void setRoom_price(int room_price) {
		this.room_price = room_price;
	}

}

class Room {
	private int roomId;
	private int floorId;
	private boolean hasAC;
	private RoomType room_class;

	public Room(int roomId, int floorId, boolean hasAC, RoomType room_class) {
		this.roomId = roomId;
		this.floorId = floorId;
		this.hasAC = hasAC;
		this.room_class = room_class;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getFloorId() {
		return floorId;
	}

	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}

	public boolean hasAC() {
		return hasAC;
	}

	public void sethasAC(boolean hasAC) {
		this.hasAC = hasAC;
	}

	public RoomType getRoom_class() {
		return room_class;
	}

	public void setRoom_class(RoomType room_class) {
		this.room_class = room_class;
	}
}

public class Driver {

	public static void main(String[] args) {

		Customer cus = new Customer();
		cus.takeUserInput();

		RoomType rt = new RoomType();
		rt.room_Choice();

	}

}
