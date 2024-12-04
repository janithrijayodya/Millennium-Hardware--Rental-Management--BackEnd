package edu.icet.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="item")
public class HardwareItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemID;
    private String itemName;
    private Double rentalPerDay;
    private Double FinePerDay;
    private String status;

    @ManyToOne
    @JoinColumn(name = "rental_id", nullable = false)
    private RentalEntity rental;
}
