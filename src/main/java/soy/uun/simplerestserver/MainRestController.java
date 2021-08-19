/*
 *
 *  * Copyright 2021 New Relic Corporation. All rights reserved.
 *  * SPDX-License-Identifier: Apache-2.0
 *
 */

package soy.uun.simplerestserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class MainRestController {
    
    @RequestMapping("/")
    public ResponseEntity<String> fourOFour() {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
