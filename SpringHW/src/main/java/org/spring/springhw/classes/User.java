package org.spring.springhw.classes;



import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class User {
    private String name;
    private String city;

    public User(@Value("Nikita") String name, @Value("Moscow") String city) {
        this.name = name;
        this.city = city;
    }
}
