package BookStore.com.Book_Store.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    @JsonProperty("order_id")
    private Long id;
    @JsonProperty("customer_id")
    private Long customerId;
    @JsonProperty("order_date")
    private Date orderDate;
    @JsonProperty("total_cost")
    private BigDecimal totalCost;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", orderDate=" + orderDate +
                ", totalCost=" + totalCost +
                '}';
    }
}
