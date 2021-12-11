package apirest.two.tarefando.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) //
        //atribuitos
        private Long id;

        @Column(nullable = false) // não pode deixar de ser preenchida
        private String nome;

        public Client() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Client client = (Client) o;
                return Objects.equals(id, client.id);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id);
        }
}
