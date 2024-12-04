package edu.icet.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private Long customerID;
    private String customerName;
    private String customerContact;
    private String customerCity;
}
