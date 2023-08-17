package Proyecto.Gestor_Clinica.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Proyecto.Gestor_Clinica.modelos.entity.HistoriaClinica;
import Proyecto.Gestor_Clinica.repositorios.HistoriaClinicaRepository;

@Service
public class HistoriaClinicaServicio {

	@Autowired
	private HistoriaClinicaRepository historiaClinicaRepository;
	
	public List<HistoriaClinica> obtenerHistoriasClinicas() {
		return historiaClinicaRepository.findAll();
	}
	
	public HistoriaClinica obtenerPorId(int id) {
		return historiaClinicaRepository.findById(id).orElse(null);
	}
	
	public HistoriaClinica crearHistoriaClinica(HistoriaClinica historiaClinica) {
		return historiaClinicaRepository.save(historiaClinica);
	}
	
	public HistoriaClinica actualizarHistoriaClinica(HistoriaClinica historiaClinica) {
		return historiaClinicaRepository.save(historiaClinica);
	}
	
	public void borrarPorId(int id) {
		historiaClinicaRepository.deleteById(id);
	}

}