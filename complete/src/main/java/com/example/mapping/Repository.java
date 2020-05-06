import javax.persistence.*;

@Entity
@Table(name = "profile_tbl")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Sting repositoryName;
    private Integer stars;
    private Member members; // oder doch als String ?? --> zu diskutieren!
    private Date createDate;
    private Integer commits;
    private Boolean readme;

	public Sting getRepositoryName() {
		return this.repositoryName;
	}

	public void setRepositoryName(Sting repositoryName) {
		this.repositoryName = repositoryName;
	}

	public Integer getStars() {
		return this.stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public Member getMembers() {
		return this.members;
	}

	public void setMembers(Member members) {
		this.members = members;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getCommits() {
		return this.commits;
	}

	public void setCommits(Integer commits) {
		this.commits = commits;
	}

	public Boolean getReadme() {
		return this.readme;
	}

	public void setReadme(Boolean readme) {
		this.readme = readme;
	}


    public Profile(Sting repositoryName, Integer stars, Member members, Date createDate,
     Integer commits, Boolean readme) {
        this.repositoryName = repositoryName;
        this.stars = stars;
        this.members = members;
        this.createDate = createDate;
        this.commits = commits;
        this.readme = readme;
    }

   
}



