package Proyecto.Gestor_Clinica.modelos.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historia_clinica")
public class HistoriaClinica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "Paciente_ID")
	private int Paciente_ID;

	@Column(name = "Doctor_ID")
	private int Doctor_ID;

	@Column(name = "Fecha_Cita")
	private LocalDate Fecha_Cita;

	@Column(name = "Sintomas")
	private String Sintomas;

	@Column(name = "Diagnostico")
	private String Diagnostico;

	@Column(name = "Tratamiento")
	private String Tratamiento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPaciente_ID() {
		return Paciente_ID;
	}

	public void setPaciente_ID(int paciente_ID) {
		Paciente_ID = paciente_ID;
	}

	public int getDoctor_ID() {
		return Doctor_ID;
	}

	public void setDoctor_ID(int doctor_ID) {
		Doctor_ID = doctor_ID;
	}

	public LocalDate getFecha_Cita() {
		return Fecha_Cita;
	}

	public void setFecha_Cita(LocalDate fecha_Cita) {
		Fecha_Cita = fecha_Cita;
	}

	public String getSintomas() {
		return Sintomas;
	}

	public void setSintomas(String sintomas) {
		Sintomas = sintomas;
	}

	public String getDiagnostico() {
		return Diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		Diagnostico = diagnostico;
	}

	public String getTratamiento() {
		return Tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		Tratamiento = tratamiento;
	}

}
