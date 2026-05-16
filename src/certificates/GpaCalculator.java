// GpaCalculator.java
// Módulo de certificados - CORREGIDO
// Fix: calcula promedio ponderado correctamente
public class GpaCalculator {
    public double calculate(List<Grade> grades) {
        double totalScore = 0;
        double totalCredits = 0;
        for (Grade g : grades) {
            totalScore   += g.getScore() * g.getCredits();
            totalCredits += g.getCredits();
        }
        return totalCredits > 0 ? totalScore / totalCredits : 0.0;
    }
}
