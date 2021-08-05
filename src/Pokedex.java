import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    public static final String shape = "Rectangle";
    public static final String color = "Red";
    boolean screenIsLitUp;
    List<PokedexItem> pokemonsAndStuff = new ArrayList<PokedexItem>();
    List<ActualPokemon> tempPokemon = new ArrayList<ActualPokemon>();

    public Pokedex(boolean screenIsLitUp) {
        this.screenIsLitUp = screenIsLitUp;
    }

    public static String getColor() {
        return color;
    }
    public static String getShape() {
        return shape;
    }

    public boolean getScreenIsLitUpString() {
        return screenIsLitUp;
    }

    public void setScreenIsLitUp(boolean screenIsLitUp) {
        this.screenIsLitUp = screenIsLitUp;
    }

    public List<PokedexItem> getPokemonsAndStuff() {
        return pokemonsAndStuff;
    }

    public void setPokemonsAndStuff(List<PokedexItem> pokemonsAndStuff) {
        this.pokemonsAndStuff = pokemonsAndStuff;
    }

    public List<ActualPokemon> getTempPokemon() {
        return tempPokemon;
    }

    public void setTempPokemon(List<ActualPokemon> tempPokemon) {
        this.tempPokemon = tempPokemon;
    }
}