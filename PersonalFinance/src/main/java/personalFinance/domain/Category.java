package personalFinance.domain;

import org.springframework.data.annotation.Id;

public class Category {

	@Id
	private String id;

	private String name;
	private String description;
	
	public Category() {}

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return String.format("Category[id=%s, Name='%s', Description='%s']",
				id, name, description);
	}

}