package com.dirtyqsh.blog.DTO;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArticleDTO {
    String title;
    String author;
    String content;
    LocalDate date;
}
