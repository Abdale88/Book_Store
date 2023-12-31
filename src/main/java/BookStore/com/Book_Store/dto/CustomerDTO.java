package BookStore.com.Book_Store.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
//Data Transfer Object for customer-related data sent to the client
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {
    private String name;
    private String email;
    private String password;
    private String address;
    private BigDecimal balance;
}
