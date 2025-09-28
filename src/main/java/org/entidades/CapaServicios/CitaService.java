package org.entidades.CapaServicios;
import org.entidades.CitaMedica.Cita;
import org.entidades.EntidadesBase.Medico;
import org.entidades.EntidadesBase.Paciente;
import org.entidades.EntidadesBase.Sala;
import org.entidades.Excepcion.CitaException;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

interface CitaService {
    Cita programarCita(Paciente paciente, Medico medico, Sala sala,
                       LocalDateTime fechaHora, BigDecimal costo) throws CitaException;

    List<Cita> getCitasPorPaciente(Paciente paciente);

    List<Cita> getCitasPorMedico(Medico medico);

    List<Cita> getCitasPorSala(Sala sala);

    void guardarCitas(String filename) throws IOException;

    void cargarCitas(String filename, Map<String, Paciente> pacientes,
                     Map<String, Medico> medicos, Map<String, Sala> salas)
            throws IOException, ClassNotFoundException, CitaException;
}
