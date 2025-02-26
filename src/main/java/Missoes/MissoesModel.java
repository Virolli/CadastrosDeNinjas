package Missoes;

import Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table (name = "tb_missoes")

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //@OneToMany - uma missão para muitos ninjas.
    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninja;


}
