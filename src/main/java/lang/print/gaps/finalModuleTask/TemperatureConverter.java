package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double F = (temperatureCelsius * 9 / 5.0) + 32;
        System.out.println(F);
    }
}
