package ru.kuzinatra.aircraftcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import ru.kuzinatra.aircraftcalculator.entity.Airplane1Impl;
import ru.kuzinatra.aircraftcalculator.entity.Airplane2Impl;
import ru.kuzinatra.aircraftcalculator.entity.HelicopterImpl;
import ru.kuzinatra.aircraftcalculator.entity.Vehicle;

public class MainActivity extends AppCompatActivity {
    private final double DISTANCE = 1000.0;
    private TextView output;
    private TextView output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vehicle airplane1 = new Airplane1Impl(210, 850, 3.7);
        Vehicle airplane2 = new Airplane2Impl(189, 900, 2.8);
        Vehicle helicopter = new HelicopterImpl(8, 250, 14);

        output = findViewById(R.id.output);
        output2 = findViewById(R.id.output2);

        output.setText("- Самолёт 1: ");
        output.append(String.valueOf(airplane1.calculateFuelConsumption(DISTANCE)));
        output.append(" тонн.\n\n");
        output.append("- Самолёт 2: ");
        output.append(String.valueOf(airplane2.calculateFuelConsumption(DISTANCE)));
        output.append(" тонн.\n\n");
        output.append("- Вертолёт: ");
        output.append(String.valueOf(helicopter.calculateFuelConsumption(DISTANCE)));
        output.append(" тонн.\n\n");

        output2.setText("- Самолёт 1: ");
        output2.append(String.valueOf(airplane1.calculateTravelTime(DISTANCE)));
        output2.append(" часа(-ов).\n\n");
        output2.append("- Самолёт 2: ");
        output2.append(String.valueOf(airplane2.calculateTravelTime(DISTANCE)));
        output2.append(" часа(-ов).\n\n");
        output2.append("- Вертолёт: ");
        output2.append(String.valueOf(helicopter.calculateTravelTime(DISTANCE)));
        output2.append(" часа(-ов).\n\n");
    }
}