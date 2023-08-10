package BookStore.com.Book_Store.dto;
//Data Transfer Object for order-related data sent to the client

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {
    private Long customer;
    private Date orderDate;
    private BigDecimal totalCost;
}
