package hotelproject.services;

import hotelproject.repositories.HotelDao;
import hotelproject.repositories.vo.HotelVo;
import java.util.List;

public class HotelServiceImpl implements HotelService {
    private final HotelDao hotelDao;

    public HotelServiceImpl(HotelDao hotelDao) {
        this.hotelDao = hotelDao;
    }

    @Override
    public List<HotelVo> getAllHotels() {
        return hotelDao.getAllHotels();
    }

    @Override
    public HotelVo getHotelById(int hotelId) {
        return hotelDao.getHotelById(hotelId);
    }

    @Override
    public void addHotel(HotelVo hotel) {
        hotelDao.addHotel(hotel);
    }

    @Override
    public void updateHotel(HotelVo hotel) {
        hotelDao.updateHotel(hotel);
    }

    @Override
    public void deleteHotel(int hotelId) {
        hotelDao.deleteHotel(hotelId);
    }
    
    
}
