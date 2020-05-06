import javax.persistence.*;

@Entity
@Table(name = "profile_tbl")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userName;
    private String[] repositories;
    private String company;

    public Profile(String userName, int age, String[] repositories) {
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

    
    public Integer getUserName() {
        return userName;
    }
    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public Integer getCompany() {
        return company;
    }
    public void setCompany(Integer company) {
        this.company = company;
    }

    public Integer getRepositories() {
        return repositories;
    }
    public void setRepositories(Integer repositories) {
        this.repositories = repositories;
    }


