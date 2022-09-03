package com.gusta.example.stategy.enumstrategy.service;

import com.gusta.example.stategy.enumstrategy.client.GithubApiClient;
import com.gusta.example.stategy.enumstrategy.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GetUserService {

    private final GithubApiClient apiClient;

    public UserDto getUser(String username) {
        return apiClient.getUser(username);
    }

}
