package hotelproject.repositories;

import hotelproject.repositories.vo.HotelVo;
import java.util.List;

public interface HotelDao {
    List<HotelVo> getAllHotels();	//	호텔조회
    HotelVo getHotelById(int hotelId);	//	호텔아이디
    void addHotel(HotelVo hotel);	//	호텔추가
    void updateHotel(HotelVo hotel);	//	호텔수정
    void deleteHotel(int hotelId);	//	호텔삭제
}
