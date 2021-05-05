package com.example.football.champions.league.controller;

import com.example.football.champions.league.model.Country;
import com.example.football.champions.league.model.League;
import com.example.football.champions.league.model.Standing;
import com.example.football.champions.league.model.Team;
import com.example.football.champions.league.service.FootballService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fifa")
@CrossOrigin
@Slf4j
public class FootballController {

    @Autowired
    FootballService footballService;


    @GetMapping("/countries")
    public List<Country> getCountries() {
        log.info("In Football controller getCountries method.");
        return footballService.getCountries();
    }

    @GetMapping("/country/{id}/leagues")
    public List<League> getLeagues(@PathVariable int id) {
        log.info("In Football controller getLeagues method.");
        return footballService.getLeagues(id);
    }

    @GetMapping("league/{id}/teams")
    public List<Team> getTeams(@PathVariable int id) {
        log.info("In Football controller getTeams method.");
        return footballService.getTeams(id);

    }

    @GetMapping("/standings/{id}")
    public List<Standing> getStanding(@PathVariable int id,
                                      @RequestParam(required = false) int team_id,
                                      @RequestParam(required = false) String country_name) {
        log.info("In Football controller getStanding method.");
        return footballService.getStanding(id, team_id, country_name);
    }
}
