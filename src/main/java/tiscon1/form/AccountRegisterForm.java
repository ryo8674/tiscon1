package tiscon1.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;


/**
 * @author kawasima
 */
@Data
public class AccountRegisterForm implements Serializable {
    @Size(min = 1, max = 100)
    @NotEmpty
    private String name;
    
    @NotEmpty
    private String email;


    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,20}$",message = "数字、英小文字、英大文字を組み合わせてください")
    @Size(min = 6,max = 20)
    @NotEmpty
    private String password;

    @NotEmpty
    private String password_check;


}

