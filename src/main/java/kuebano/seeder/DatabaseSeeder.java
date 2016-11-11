package kuebano.seeder;

import kuebano.model.HotelBooking;
import kuebano.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;

    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    @Override
    public void run(String... strings) throws Exception {
        List bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Marriot", 200.50, 3));
        bookings.add(new HotelBooking("kingsley", 90, 4));
        bookings.add(new HotelBooking("Mimi", 2090, 1));
        bookings.add(new HotelBooking("ib", 3000, 23));

        bookingRepository.save(bookings);
    }
}
