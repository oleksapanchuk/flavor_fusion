package dev.panoleksa.ffood.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    private Integer id;
    private Integer user_id;
    private Integer status_id;
    private Integer total_price;
    private String address_delivery;
    private Integer is_liked;
    private LocalDateTime time_order; // "yyyy-MM-dd HH:mm:ss"
}
