import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id", nullable = false, unique = true)
    private String orderId;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    // Getters and Setters
}
