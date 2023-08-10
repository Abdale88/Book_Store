package BookStore.com.Book_Store.dto;

import BookStore.com.Book_Store.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
}
