/*@Carolina Bernal Challenger Alura G6 Backend*/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ConversorDivisas {
    private String monedaInicial;
    private String monedaAConvertir;
    private Double montoDineroConvertir;
    private Double tasaDeCambio;
    private Double resultadoDeCambio;

    public ConversorDivisas() {
    }

    public ConversorDivisas(String monedaInicial, String monedaAConvertir, Double montoDineroConvertir, Double tasaDeCambio) {
        this.monedaInicial = monedaInicial;
        this.monedaAConvertir = monedaAConvertir;
        this.montoDineroConvertir = montoDineroConvertir;
        this.tasaDeCambio = tasaDeCambio;
    }

    public Double getResultadoDeCambio() {
        return resultadoDeCambio;
    }

    public String getMonedaInicial() {
        return monedaInicial;
    }

    public String getMonedaAConvertir() {
        return monedaAConvertir;
    }

    public Double getMontoDineroConvertir() {
        return montoDineroConvertir;
    }

    public Double getTasaDeCambio() {
        return tasaDeCambio;
    }

    public Double conversorMoneda (String monedaBase, String monedaFinal, Double montoDinero, Double tasa){

        this.resultadoDeCambio = montoDinero * tasa;

        System.out.println("*****************\nEl valor "+
                montoDinero + " " + monedaBase +
                " corresponde al valor final de =>>> " + this.resultadoDeCambio + " " + monedaFinal);

        LocalDateTime datosDeConsulta = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHoraConsulta = datosDeConsulta.format(formatoFechaHora);
        System.out.println("Consulta realizada el " + fechaHoraConsulta + "\n*****************");

        return resultadoDeCambio;
    }


}
