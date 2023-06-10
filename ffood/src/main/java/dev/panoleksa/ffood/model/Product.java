package dev.panoleksa.ffood.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    private Integer id;
    private Integer category_id;
    private String name_ua;
    private Integer price;
    private Integer weight;
    private String description;
    private String img;
}
