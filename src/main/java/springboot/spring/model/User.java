package springboot.spring.model;




import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;




@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Имя не должно быть пустым")
    @Size(min = 2, message = "Имя должно включать минимум два символа")
    private String name;
    @NotBlank(message = "Фамилия не должна быть пустой")
    @Size(min = 2, message = "Фамилия должна включать минимум два символа")
    private String surname;
    @Min(value = 0, message = "возраст не может быть меньше 0")
    private Integer age;

    public User() {
    }

    public User(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
           this.age = age;
    }

    @Override
    public String toString() {
        return "Пользователь{" +
                "id=" + id +
                ", имя='" + name + '\'' +
                ", фамилия='" + surname + '\'' +
                ", возраст=" + age +
                '}';
    }
}
