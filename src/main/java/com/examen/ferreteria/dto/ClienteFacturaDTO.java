package com.examen.ferreteria.dto;

import java.math.BigDecimal;
import java.util.Date;

public record ClienteFacturaDTO(
        String nombre,
        String apellido,
        String nit,
        Date fecha,
        BigDecimal total) {
}