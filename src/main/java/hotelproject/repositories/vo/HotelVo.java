
package hotelproject.repositories.vo;

public class HotelVo {
	
    private int hotelId; // 호텔 아이디
    private String name;	// 호텔 이름
    private String location; // 호텔 위치
    private String contact;	// 연락
    private String email;	// 이메일
    private double price;	// 호텔 가격
    private double rating;	// 호텔 대기
    private boolean isAvailable;	// 예약여부확인
    private String imageUrl;	// 호텔 사진첨부

    // 기본 생성자
    public HotelVo() {}

    // 모든 필드를 포함한 생성자
    public HotelVo(int hotelId, String name, String location, String contact, String email, double price, double rating, boolean isAvailable, String imageUrl) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
        this.contact = contact;
        this.email = email;
        this.price = price;
        this.rating = rating;
        this.isAvailable = isAvailable;
        this.imageUrl = imageUrl;
    }

    // Getter & Setter
    public int getHotelId() { return hotelId; }
    public void setHotelId(int hotelId) { this.hotelId = hotelId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}

