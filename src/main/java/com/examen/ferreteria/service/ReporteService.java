package com.examen.ferreteria.service;

import com.examen.ferreteria.dto.ArticuloCategoriaDTO;
import com.examen.ferreteria.dto.ClienteFacturaDTO;
import com.examen.ferreteria.entity.Articulo;
import com.examen.ferreteria.repository.ArticuloRepository;
import com.examen.ferreteria.repository.FacturaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ReporteService {

    private final ArticuloRepository articuloRepository;
    private final FacturaRepository facturaRepository;

    public ReporteService(ArticuloRepository articuloRepository,
                          FacturaRepository facturaRepository) {
        this.articuloRepository = articuloRepository;
        this.facturaRepository = facturaRepository;
    }

    public List<Articulo> mostrarActivosFiltro(String nombre) {
        return articuloRepository.buscarActivosPorNombre(nombre);
    }

    public List<ArticuloCategoriaDTO> reporteArticuloCategoria() {
        return articuloRepository.reporteArticuloCategoria();
    }

    public List<ClienteFacturaDTO> reporteClienteFactura() {
        return facturaRepository.reporteClienteFactura();
    }
}