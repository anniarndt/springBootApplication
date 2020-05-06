import javax.persistence.*;

@Entity
@Table(name = "profile_tbl")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userName;
    private Integer repositories;
    private String company;

    public Profile(String userName, int id, Integer repositories, String company) {
        this.userName = userName;
        this.id = id;
        this.repositories = repositories;
        this.company = company;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getRepositories() {
        return repositories;
    }
    public void setRepositories(Integer repositories) {
        this.repositories = repositories;
    }
}



