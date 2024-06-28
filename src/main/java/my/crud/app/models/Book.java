package my.crud.app.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;

    @NotEmpty(message = "This field cannot be empty")
    @Size(min = 2, max = 80, message = "Book title cannot be that long")
    private String title;

    @NotEmpty(message = "This field cannot be empty")
    @Size(min = 2, max = 30, message = "Author's name cannot be that long")
    private String author;

    @NotEmpty(message = "This field cannot be empty")
    private int year;

}
