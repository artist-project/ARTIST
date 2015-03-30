package eu.artist.premigration.tft.tft.model;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="MigrationStrategy")
public class Goals {

	@XmlElement(name="sgoal", type=String.class)
	List<String> softGoals;

	public List<String> getSoftGoals() {
		return softGoals;
	}

	public void setSoftGoals(List<String> softGoals) {
		this.softGoals = softGoals;
	}
}
