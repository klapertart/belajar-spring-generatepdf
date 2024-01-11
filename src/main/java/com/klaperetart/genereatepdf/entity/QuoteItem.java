package com.klaperetart.genereatepdf.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author tritr
 * @since 1/11/2024
 */

@Data
@Setter
@Getter
public class QuoteItem {
    private String description;
    private Integer quantity;
    private Double unitPrice;
    private Double total;
}
