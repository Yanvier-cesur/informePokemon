import modelos.pokemon;

import java.util.List;

public class Main {
    static void main() {

        FileService fileService = new FileService();
        InformeService informeService = new InformeService();

        List<pokemon> pokemones = fileService.leerPokemonJson("pokemon.json");

        List<String> informe = informeService.generarInforme(pokemones);

        fileService.escribirInforme("pokedex.txt",informe);

    }
}
