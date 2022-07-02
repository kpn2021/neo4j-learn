package cn.kpn.demoneo4jspringdata;

import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
@Repository
public interface MovieRepository extends Neo4jRepository<MovieEntity, String> {

    //    Mono<MovieEntity> findOneByTitle(String title);

    MovieEntity findOneByTitle(String title);

}