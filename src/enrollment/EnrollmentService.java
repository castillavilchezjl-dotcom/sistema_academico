// EnrollmentService.java
// Módulo de matrículas - VERSIÓN INICIAL
// Bug: no valida si el curso tiene cupos disponibles
public class EnrollmentService {
    public void enroll(Student s, Course c) {
        db.save(s, c);
    }
}
