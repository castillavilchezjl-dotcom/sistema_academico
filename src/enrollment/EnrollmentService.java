// EnrollmentService.java
// Módulo de matrículas - CORREGIDO
// Fix: valida cupos disponibles antes de confirmar la matrícula
public class EnrollmentService {
    public void enroll(Student s, Course c) {
        if (c.getAvailableSeats() <= 0) {
            throw new IllegalStateException("No hay cupos disponibles en el curso");
        }
        db.save(s, c);
    }
}
