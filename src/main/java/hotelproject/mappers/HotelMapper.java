package hotelproject.mappers;

import hotelproject.repositories.vo.HotelVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HotelMapper {

    @Select("SELECT * FROM hotels")
    List<HotelVo> getAllHotels();

    @Select("SELECT * FROM hotels WHERE hotelId = #{hotelId}")
    HotelVo getHotelById(int hotelId);

    @Insert("INSERT INTO hotels (name, location, contact, email, price, rating, isAvailable, imageUrl) " +
            "VALUES (#{name}, #{location}, #{contact}, #{email}, #{price}, #{rating}, #{isAvailable}, #{imageUrl})")
    void addHotel(HotelVo hotel);

    @Update("UPDATE hotels SET name=#{name}, location=#{location}, contact=#{contact}, email=#{email}, " +
            "price=#{price}, rating=#{rating}, isAvailable=#{isAvailable}, imageUrl=#{imageUrl} WHERE hotelId=#{hotelId}")
    void updateHotel(HotelVo hotel);

    @Delete("DELETE FROM hotels WHERE hotelId=#{hotelId}")
    void deleteHotel(int hotelId);
}
