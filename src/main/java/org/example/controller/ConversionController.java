package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class ConversionController {

    @GetMapping("/length")
    public ResponseEntity<String> convertLength(
            @RequestParam double value,
            @RequestParam String fromUnit,
            @RequestParam String toUnit) {
        // Placeholder logic for length conversion
        double convertedValue = value * 100; // Example: Convert meters to centimeters
        return ResponseEntity.ok("Converted value: " + convertedValue + " " + toUnit);
    }
}
