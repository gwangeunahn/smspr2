package com.example.smspr2.domain;

import com.example.smspr2.dto.TbpostDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Table(indexes = {
        @Index(columnList = "deleted")
        // ..등등
})
@Entity
public class Tbpost {

    @Id private String id;
    @Setter private Boolean deleted;
    @Setter private String createdAt;
    @Setter private String modifiedAt;

    @Setter @Column(nullable = false, length=400)private String title;
    @Setter private String author;
    @Setter private String content;
    protected Tbpost(){}
    private Tbpost(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
    public static Tbpost of(String title, String author, String content) {
        return new Tbpost(title, author, content);// 앞에 ㅇ생성자 다 막아서 of만으ㄹ만 만드룻 있다
    }

    public TbpostDto.CreareResDto toCreateResDTo(){

    }
}
