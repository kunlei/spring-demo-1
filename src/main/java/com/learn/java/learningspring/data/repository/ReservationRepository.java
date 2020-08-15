package com.learn.java.learningspring.data.repository;

import com.learn.java.learningspring.data.entity.Reservation;
import java.sql.Date;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
  Iterable<Reservation> findReservationByReservationDate(Date date);
}
