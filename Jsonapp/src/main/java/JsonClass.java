import java.util.List;


public class JsonClass {
	
	public JsonClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	private long id;
	private List<String> favoriteSports;
	private List<Gender> gender;

	public List<Gender> getGender() {
		return gender;
	}

	public void setGender(List<Gender> gender) {
		this.gender = gender;
	}

	public List<String> getFavoriteSports() {
		return favoriteSports;
	}

	public void setFavoriteSports(List<String> favoriteSports) {
		this.favoriteSports = favoriteSports;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
