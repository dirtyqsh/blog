package com.dirtyqsh.blog.DTO;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArticleDTO {
    String title;
    String author;
    String content;
    Date date;
}
