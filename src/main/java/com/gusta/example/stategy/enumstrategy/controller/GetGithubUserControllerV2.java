package com.gusta.example.stategy.enumstrategy.controller;

import com.gusta.example.stategy.enumstrategy.dto.ErroDto;
import com.gusta.example.stategy.enumstrategy.service.GetUserService;
import com.gusta.example.stategy.enumstrategy.utils.ResponseStrategy;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/users")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GetGithubUserControllerV2 {

    private final GetUserService service;

    @GetMapping("/{username}")
    public ResponseEntity<Object> getUser(@PathVariable String username) {
        if (doesNotHaveUsername(username)) {
            var error = new ErroDto(LocalDateTime.now(), "Please, pass a username for search");
            return getReponse(ResponseStrategy.RESPONSE_EMPTY, error);
        }

        var user = service.getUser(username);

        return getReponse(ResponseStrategy.RESPONSE_OK, user);
    }

    private boolean doesNotHaveUsername(String username) {
        return username == null || username.isEmpty();
    }

    private ResponseEntity<Object> getReponse(ResponseStrategy responseType, Object body) {
        return responseType.execute(body);
    }

}
