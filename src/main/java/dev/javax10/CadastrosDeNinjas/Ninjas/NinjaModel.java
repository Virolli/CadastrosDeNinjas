package dev.javax10.CadastrosDeNinjas.Ninjas;
import dev.javax10.CadastrosDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_cadastro")

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "Idade")
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id") // Chave estrangeira
    private MissoesModel missoes;

}
