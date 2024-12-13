package med.voll.api.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findByActivoTrue(Pageable paginacion);

//    @Query(value = """
//    SELECT * FROM medicos m
//    WHERE m.activo = TRUE
//    AND m.especialidad = :especialidad
//    AND m.id NOT IN (
//        SELECT c.medico_id FROM consultas c WHERE c.fecha = :fecha
//    )
//    ORDER BY RAND() LIMIT 1
//    """, nativeQuery = true)
//    Medico elegirMedicoAleatorioDisponibleEnLaFecha(Especialidad especialidad, LocalDateTime fecha);
//@Query(value = """
//    SELECT * FROM medicos m
//    WHERE m.activo = TRUE
//    AND m.especialidad = :especialidad
//    AND m.id NOT IN (
//        SELECT c.medico_id FROM consultas c WHERE c.fecha = :fecha
//    )
//    ORDER BY RAND()
//    """, nativeQuery = true)
//List<Medico> listarMedicosDisponiblesEnLaFecha(@Param("especialidad") Especialidad especialidad,
//                                               @Param("fecha") LocalDateTime fecha);
@Query("""
    SELECT m FROM Medico m 
    WHERE m.activo = TRUE 
      AND m.especialidad = :especialidad 
      AND m.id NOT IN (
          SELECT c.medico.id FROM Consulta c WHERE c.fecha = :fecha
      )
""")
List<Medico> listarMedicosDisponiblesEnLaFecha(@Param("especialidad") Especialidad especialidad,
                                               @Param("fecha") LocalDateTime fecha);

    @Query("""
            select m.activo
            from Medico m
            where
            m.id = :idMedico
            """)
    boolean findActivoById(Long idMedico);

    @Query(value = """
SELECT * FROM medicos m
WHERE m.activo = TRUE
AND m.especialidad = :especialidad
AND m.id NOT IN (
    SELECT c.medico_id FROM consultas c WHERE c.fecha = :fecha
)
ORDER BY RAND()
""", nativeQuery = true)
    List<Medico> elegirMedicoAleatorioDisponibleEnLaFecha(@Param("especialidad") Especialidad especialidad, @Param("fecha") LocalDateTime fecha);


}
