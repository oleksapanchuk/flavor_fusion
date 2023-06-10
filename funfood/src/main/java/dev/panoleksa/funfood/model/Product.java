package dev.panoleksa.funfood.model;

import jakarta.persistence.Entity;
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
    private Integer categoryId;
    private String name;
    private Integer price;
    private Integer weight;
    private String description;
    private String img;
}
