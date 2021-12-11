package apirest.two.tarefando.Repository;

import apirest.two.tarefando.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository// responsável por interagir com o banco de dados
                                                            //class e id do client
public interface ClientsRepository  extends JpaRepository<Client, Long> {
}
