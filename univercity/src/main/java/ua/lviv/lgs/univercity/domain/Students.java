package ua.lviv.lgs.univercity.domain;

public class Students {
	
	private Integer id;
	private Integer userId;
	private Integer facultyId;
	
	public Students() {}


	public Students(Integer userId, Integer facultyId) {
		this.userId = userId;
		this.facultyId = facultyId;
	}

	public Students(Integer id, Integer userId, Integer facultyId) {
		this.id = id;
		this.userId = userId;
		this.facultyId = facultyId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public Integer getFacultyId() {
		return facultyId;
	}


	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facultyId == null) ? 0 : facultyId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (facultyId == null) {
			if (other.facultyId != null)
				return false;
		} else if (!facultyId.equals(other.facultyId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Students [id=" + id + ", userId=" + userId + ", facultyId=" + facultyId + "]";
	}
	
	
	
}


