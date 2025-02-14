package hotelproject.services;

import hotelproject.repositories.vo.HotelVo;
import java.util.List;

public interface HotelService {
    List<HotelVo> getAllHotels();
    HotelVo getHotelById(int hotelId);
    void addHotel(HotelVo hotel);
    void updateHotel(HotelVo hotel);
    void deleteHotel(int hotelId);
}
