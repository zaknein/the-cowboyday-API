package com.zaknein.the_cowboyday_API.controller;








@AllArgsConstructor
@RequestMapping("/usuarios/")
@RestController
public class UsuariosController {



    @postMapping("register")
    public ResponseEntity<AuthResponse>  register(Valid @RequestBody RegisterRequest request) {
        return new String();
    }

    @postMapping("login")
    public ResponseEntity<AuthResponse>  login(@Valid @RequestBody LoginRequest request) {
        return new String();
    }


}