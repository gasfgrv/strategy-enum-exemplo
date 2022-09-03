package com.gusta.example.stategy.enumstrategy.client;

import com.gusta.example.stategy.enumstrategy.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "githubApiClient",  url = "https://api.github.com")
public interface GithubApiClient {

    @GetMapping("/users/{user}")
    UserDto getUser(@PathVariable("user") String user);

}
