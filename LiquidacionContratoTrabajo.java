public class LiquidacionContratoTrabajo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        class ConceptoLiquidacion {
            String concepto;
            double valor;

            public ConceptoLiquidacion(String concepto, double valor) {
                this.concepto = concepto;
                this.valor = valor;
            }
        }

        ConceptoLiquidacion periodo = new ConceptoLiquidacion("Periodo", 0.0);
        ConceptoLiquidacion salarioDiario = new ConceptoLiquidacion("Salario Diario", 0.0);
        ConceptoLiquidacion salarioMensualizado = new ConceptoLiquidacion("Salario Mensualizado", 0.0);
        ConceptoLiquidacion auxilioTransporte = new ConceptoLiquidacion("Auxilio de Transporte", 0.0);

        Object primaSegundoSemestre;
        Object cesantias;
        Object interesesCesantias;
        Object vacaciones;
        Object primaPrimerSemestrem;
        final double totalPrestaciones = primaPrimerSemestrem.valor + primaSegundoSemestre.valor + cesantias.valor +
                interesesCesantias.valor + vacaciones.valor;

        System.out.println("Concepto: " + periodo.concepto + ", Valor: " + periodo.valor);
        System.out.println("Concepto: " + salarioDiario.concepto + ", Valor: " + salarioDiario.valor);
        System.out.println("Concepto: " + salarioMensualizado.concepto + ", Valor: " + salarioMensualizado.valor);
        System.out.println("Concepto: " + auxilioTransporte.concepto + ", Valor: " + auxilioTransporte.valor);

        System.out.println("Total Prestaciones Sociales: " + totalPrestaciones);
    }
}