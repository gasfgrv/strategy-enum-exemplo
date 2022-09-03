package com.gusta.example.stategy.enumstrategy.controller;

import com.gusta.example.stategy.enumstrategy.service.GetUserService;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/get-user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GetGithubUserController {

    private final GetUserService service;

    @GetMapping
    public ResponseEntity<?> getUser(@RequestParam String username) {
        if (username == null || username.isEmpty()) {
            return getReponse(ResponseStrategy.RESPONSE_EMPTY, null);
        }

        try {
            var user = service.getUser(username);
            return getReponse(ResponseStrategy.RESPONSE_OK, user);
        } catch (FeignException e) {
            return getReponse(ResponseStrategy.RESPONSE_ERROR, null);
        }
    }

    private ResponseEntity<?> getReponse(ResponseStrategy responseType, Object body) {
        return responseType.execute(body);
    }

}
