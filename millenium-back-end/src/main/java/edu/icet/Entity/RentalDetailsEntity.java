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
@Table(name="rentalDetails")
public class RentalDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private double totalItemCost;
    private Integer quantity;
}
