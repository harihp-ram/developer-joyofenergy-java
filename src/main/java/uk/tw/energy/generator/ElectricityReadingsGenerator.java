package uk.tw.energy.generator;

import uk.tw.energy.domain.ElectricityReading;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElectricityReadingsGenerator {

    public List<ElectricityReading> generate(int number) {

        List<ElectricityReading> readings = new ArrayList<>();
        Instant now = Instant.now();

        Random readingRandomiser = new Random();

        for (int i = 0; i < number; i++ ) {

            double reading = (readingRandomiser.nextGaussian() + 1) / 2;

            ElectricityReading electricityReading = new ElectricityReading(now.minusSeconds(i * 3600), BigDecimal.valueOf(reading));
            readings.add(electricityReading);

        }

        return readings;

    }

}
