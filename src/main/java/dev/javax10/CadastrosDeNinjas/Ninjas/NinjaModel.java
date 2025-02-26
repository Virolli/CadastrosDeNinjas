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
@Table(name = "tb_cadastroNinja")

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

    // @ManyToOne - um ninja tem apenas uma missão.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;

}
