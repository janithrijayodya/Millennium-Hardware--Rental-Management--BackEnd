package edu.icet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="rental")
public class RentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rentalID;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private LocalDate dueDate;
    private double fine;
    private double totalCost;
}
