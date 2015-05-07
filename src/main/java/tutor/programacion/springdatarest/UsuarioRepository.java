package tutor.programacion.springdatarest;

//import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "data", path = "user")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

//    List<Usuario> findByNombre(@Param("nombre") String nombre);
    Usuario findByNombre(@Param("nombre") String nombre);
}
