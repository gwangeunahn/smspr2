package com.example.smspr2.controller;


import com.example.smspr2.service.TbpostService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Tag()
@RequestMapping("/api/tbpost")
@Controller
public class TbpostController {

    private TbpostService
    public TbpostRestController(){

    }

    @Operation()

    @PostMapping("/")
    public ResponseEntity<TbpostDto.CreateResDto> create(@Valid @RequestBody ){
        return null;

        Return...
    }

    @Operation()

    @PutMapping("/")
    public ResponseEntity<TbpostDto.CreateResDto> create(@Valid @RequestBody ){
        return null;

        Return...
    }

    @Operation()

    @GetMapping("/detail")//문제가 발생해서 post방식으로 해봄
    public ResponseEntity<TbpostDto.CreateResDto> create(@Valid @RequestBody ){
        return null;

        Return...
    }

}
