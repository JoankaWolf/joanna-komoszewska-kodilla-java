package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAvgTemperatures() {
        double sum = 0;
        Map<String, Double> avgTemperatures = new HashMap<>(temperatures.getTemperatures());

        for (double value : avgTemperatures.values()) {
            sum += value;
        }
        return sum / avgTemperatures.size();
    }

    public Double calculateMedianTemperatures() {
        List<Double> medianTemperatures = new ArrayList<>(temperatures.getTemperatures().values());

        Collections.sort(medianTemperatures);

        if (medianTemperatures.size() % 2 == 1)
            return medianTemperatures.get((medianTemperatures.size() + 1) / 2 - 1);
        else {
            double lower = medianTemperatures.get(medianTemperatures.size() / 2 - 1);
            double upper = medianTemperatures.get(medianTemperatures.size() / 2);

            return (lower + upper) / 2;
        }
    }
}
