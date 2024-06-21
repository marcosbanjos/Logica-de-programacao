import java.util.*;

public class Principal {
    public static void main(String[] args) {

        CarrosFuncionalidades carros = new CarrosFuncionalidades();
        
        carros.Cadastrar();
        carros.Listar();
        carros.LocalizarPlaca();
        carros.LocalizarProprietario();
        carros.LocalizarMaiorKmrodado();
    }
}