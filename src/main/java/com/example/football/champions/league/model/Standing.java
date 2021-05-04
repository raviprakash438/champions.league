package com.example.football.champions.league.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Standing implements Serializable {
    private String country_name;
    private int league_id;
    private String league_name;
    private int team_id;
    private String team_name;
    private int overall_league_position;
}
