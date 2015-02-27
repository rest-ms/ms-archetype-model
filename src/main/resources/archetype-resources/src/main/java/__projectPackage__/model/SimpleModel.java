package ${groupId}.${projectPackage}.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="simple", indexes = {
		@Index(name="idx_simple", columnList="test")
		})
@NamedQuery(
	    name="simpleByTest",
	    query="SELECT x FROM SimpleModel x WHERE x.test LIKE :test"
	)
public class SimpleModel {

	@Id
	@GeneratedValue
	private Long id;
	
	private String test;
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
}




