package cst438.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

	Reservation findByidReservation(int idReservation);
}
