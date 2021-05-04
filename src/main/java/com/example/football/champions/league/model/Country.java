package com.example.football.champions.league.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Country implements Serializable {

    private int country_id;
    private String country_name;
    private String country_logo;
}
