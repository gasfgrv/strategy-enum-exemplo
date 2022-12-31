package com.gusta.example.stategy.enumstrategy.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserDto {

    private String login;
    private String url;
    @JsonProperty("repos_url")
    private String repos;
    private String name;
    private String company;
    private String location;
    private String email;
    private String bio;
    @JsonProperty("twitter_username")
    private String twitterUsername;

}
