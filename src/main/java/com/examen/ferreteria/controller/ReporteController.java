package com.examen.ferreteria.controller;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.dto.ClienteFacturaDTO;
import com.examen.ferreteria.entity.Articulo;
import com.examen.ferreteria.service.ReporteService;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ReporteController {

    private final ReporteService service;

    public ReporteController(ReporteService service) {
        this.service = service;
    }

    @GetMapping("/articulos/mostrarActivosFiltro")
    public List<Articulo> mostrarActivosFiltro(@RequestParam("nombre") String nombre) {
        return service.mostrarActivosFiltro(nombre);
    }

    @GetMapping("/articulos/reporteArticuloCategoria")
    public List<ArticuloCategoriaDTO> reporteArticuloCategoria() {
        return service.reporteArticuloCategoria();
    }

    @GetMapping("/clientes/reporteClienteFactura")
    public List<ClienteFacturaDTO> reporteClienteFactura() {
        return service.reporteClienteFactura();
    }
}