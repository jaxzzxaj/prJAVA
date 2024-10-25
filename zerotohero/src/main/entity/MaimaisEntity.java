package entity;

public class MaimaisEntity {
	private int id;
	private String type;
	private String color;
	private String name;
	private int price;
	private String place;
	
//	getter/setter(各カラムを取得と配置する）
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}

	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	public String getPlace() {return place;}
	public void setPlace(String place) {this.place = place;}
	}
