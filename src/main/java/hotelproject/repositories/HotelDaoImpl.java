package hotelproject.repositories;

import hotelproject.repositories.vo.HotelVo;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

public class HotelDaoImpl implements HotelDao {
    private List<HotelVo> hotels = new ArrayList<>();
    
    // Mybatis를 가져오기 위한 sql세션 팩토리 설정
    private SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();

    @Override
    public List<HotelVo> getAllHotels() {
        return hotels;
    }

    @Override
    public HotelVo getHotelById(int hotelId) {
        return hotels.stream().filter(h -> h.getHotelId() == hotelId).findFirst().orElse(null);
    }

    @Override
    public void addHotel(HotelVo hotel) {
        hotels.add(hotel);
    }

    @Override
    public void updateHotel(HotelVo hotel) {
        for (int i = 0; i < hotels.size(); i++) {
            if (hotels.get(i).getHotelId() == hotel.getHotelId()) {
                hotels.set(i, hotel);
                return;
            }
        }
    }

    @Override
    public void deleteHotel(int hotelId) {
        hotels.removeIf(h -> h.getHotelId() == hotelId);
    }
}
