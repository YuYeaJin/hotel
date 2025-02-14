package hotelproject.controllers;

import hotelproject.repositories.vo.HotelVo;
import hotelproject.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    
    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public List<HotelVo> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/{id}")
    public HotelVo getHotelById(@PathVariable int id) {
        return hotelService.getHotelById(id);
    }

    @PostMapping
    public void addHotel(@RequestBody HotelVo hotel) {
        hotelService.addHotel(hotel);
    }

    @PutMapping("/{id}")
    public void updateHotel(@PathVariable int id, @RequestBody HotelVo hotel) {
        hotel.setHotelId(id);
        hotelService.updateHotel(hotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable int id) {
        hotelService.deleteHotel(id);
    }
}
