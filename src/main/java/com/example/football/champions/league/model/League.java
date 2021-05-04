package com.example.football.champions.league.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class League implements Serializable {
    private int country_id;
    private String country_name;
    private int league_id;
    private String league_name;
//    private String league_season;
//    private String league_logo;
//    private String country_logo;
}
