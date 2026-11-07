package com.examen.ferreteria.dto;

import java.math.BigDecimal;

public record ArticuloCategoriaDTO(
        String nombre,
        String marca,
        String categoria,
        BigDecimal precio,
        Integer stock) {
}