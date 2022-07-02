package cn.kpn.demoneo4jspringdata;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

import java.util.ArrayList;
import java.util.List;
@Getter
@ToString
// https://neo4j.com/developer/spring-data-neo4j/
@Node("Movie")
public class MovieEntity {

    @Id
    private final String title;

    @Property("tagline")
    private final String description;

    @Relationship(type = "ACTED_IN", direction = Direction.INCOMING)
    private List<Roles> actorsAndRoles;

    @Relationship(type = "DIRECTED", direction = Direction.INCOMING)
    private List<PersonEntity> directors = new ArrayList<>();

    public MovieEntity(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters omitted for brevity
}