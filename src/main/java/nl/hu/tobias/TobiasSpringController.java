package iac.tobias.tobiasspring;

import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TobiasSpringController {

    // Opdracht endpoint 1: GET /current-date
    @GetMapping("/current-date")
    public String getCurrentDate() {
        // Get current date & format
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'at' HH:mm:ss");

        return formatter.format(date);
    }

    // Opdracht endpoint 2: POST /welcome
    @PostMapping(value="/person")
    public String showName(@RequestBody String name) {
        return "Hallo "+name+"!";
    }
}