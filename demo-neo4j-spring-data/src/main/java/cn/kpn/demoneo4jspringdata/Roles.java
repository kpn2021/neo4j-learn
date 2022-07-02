package cn.kpn.demoneo4jspringdata;

import lombok.Getter;
import lombok.ToString;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
@Getter
@ToString
@Node("Roles")
public class Roles {
    @Id
    private final String name;

    public Roles(String name) {
        this.name = name;
    }
}
