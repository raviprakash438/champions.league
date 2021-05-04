package com.example.football.champions.league.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Team  implements Serializable {
    private int team_key;
    private String team_name;
    private String team_badge;

}
