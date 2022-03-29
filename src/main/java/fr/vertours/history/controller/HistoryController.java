package fr.vertours.history.controller;

import fr.vertours.history.model.History;
import fr.vertours.history.service.HistoryService;

import fr.vertours.translator.model.Num;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api")
public class HistoryController {

    private HistoryService service;

    public HistoryController(HistoryService service) {
        this.service = service;
    }

    @GetMapping(path = "/historique")
    public List<History> findAllHistory() {
        return service.getAllHistory();
    }

    @PostMapping(path = "/historique")
    public void createHistory(@RequestBody Num num) {
        service.createHistory(num);
    }
}
