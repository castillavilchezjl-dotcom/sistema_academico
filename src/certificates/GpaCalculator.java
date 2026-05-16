// GpaCalculator.java
// Módulo de certificados - VERSIÓN INICIAL
// Bug: usa promedio simple en lugar de ponderado
public class GpaCalculator {
    public double calculate(List<Grade> grades) {
        return grades.stream()
                     .mapToDouble(Grade::getScore)
                     .average()
                     .orElse(0.0);
    }
}
