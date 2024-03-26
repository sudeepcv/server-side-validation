package com.sudeepcv.serversidevalidation.controller;

import com.sudeepcv.serversidevalidation.dto.UserDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public class ValidationTestController {
    @GetMapping("path-number/{number}")
    public ResponseEntity<?> pathValidation(@PathVariable("number") @Positive @Positive int number) {

        return ResponseEntity.ok("number =>"+number);

    }

    @PostMapping("user")
    public ResponseEntity<?> requestBodyValidation(@Valid @RequestBody  UserDTO userDTO) {
        return ResponseEntity.ok(userDTO);
    }


}
