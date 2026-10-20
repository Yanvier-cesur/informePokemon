package modelos;

import lombok.Data;

@Data
public class pokemon {
    private Long id;
    private String nombre;
    private String tipo;
    private Integer nivel;
    private Integer ps;

}
