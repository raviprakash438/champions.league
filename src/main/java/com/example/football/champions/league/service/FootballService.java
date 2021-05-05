package com.example.football.champions.league.service;

import com.example.football.champions.league.model.Country;
import com.example.football.champions.league.model.League;
import com.example.football.champions.league.model.Standing;
import com.example.football.champions.league.model.Team;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class FootballService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${baseUri}")
    private String uri;

    @Value("${api-key}")
    private String apiKey;

    public List<Country> getCountries() {
        log.info("In country service method.");
        String countryUrl = uri + "?action=get_countries&APIkey=" + apiKey;

        ResponseEntity<Country[]> response = restTemplate.getForEntity(countryUrl, Country[].class);
        List<Country> countryList = Arrays.asList(response.getBody());
        log.info("response: " + countryList);

        return countryList;

    }

    public List<League> getLeagues(int id) {
        log.info("In league service method.");
        String leagueUrl = uri + "?action=get_leagues&APIkey=" + apiKey;

        ResponseEntity<League[]> response = restTemplate.getForEntity(leagueUrl, League[].class);
        List<League> leaguesList = Arrays.asList(response.getBody());
        leaguesList = leaguesList.stream().filter(league -> league.getCountry_id() == id).collect(Collectors.toList());
        log.info("response: " + leaguesList);

        return leaguesList;

    }

    public List<Team> getTeams(int id) {
        log.info("In league service method.");
        String teamUrl = uri + "?action=get_teams&league_id=" + id + "&APIkey=" + apiKey;

        ResponseEntity<Team[]> response = restTemplate.getForEntity(teamUrl, Team[].class);
        List<Team> teamList = Arrays.asList(response.getBody());
        // log.info("response: "+ teamList);

        return teamList;

    }

    public List<Standing> getStanding(int league_id, int team_id, String country_name) {
        log.info("In league service method.");
        String standingUrl = uri + "?action=get_standings&league_id=" + league_id + "&APIkey=" + apiKey;

        ResponseEntity<Standing[]> response = restTemplate.getForEntity(standingUrl, Standing[].class);
        List<Standing> standingList = Arrays.asList(response.getBody());
        log.info("count before filter --> " + standingList.size());
        standingList = standingList.stream().filter(standing ->
                standing.getTeam_id() == team_id &&
                        standing.getCountry_name().equalsIgnoreCase(country_name)).collect(Collectors.toList());
        log.info("count after filter --> " + standingList.size());
        return standingList;
    }
}
