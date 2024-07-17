package com.example.smspr2.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

public class TbpostDto {

    @Builder
    //..등등

    //update..

    public static class CreareReqDto{
        @Schema
        @NotNull
        //... 등등
        private String title;
        private String author;
        private String content;

        //public Tbpost Entity()
    }

    public static class CreareResDto{
        private String id;
    }

    public static class SelectReqDto{
        private String id;
    }

    public static class SelectResDto{
        private String id;
        private String deleteAt;
        private String process;
        //...등등

        private String title;
        private String author;
        private String content;
    }

}
