package com.ormi.springstudy.spring0715.Post실습;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Post {
    private long id;
    private String title;
    private String content;
    private LocalDateTime createAt;
}
