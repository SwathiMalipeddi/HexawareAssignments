package com.spring.jpa.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LibResponse {

    private int libraryId;
    private String libraryName;
    private int booksCount;

}
