import java.util.Scanner;

public class CarrosFuncionalidades {
    
    Scanner scanner = new Scanner(System.in);
    Carro[] carros = new Carro[10];

    public void Cadastrar(){
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Digite os dados do carro " + (i + 1) + ":");
            System.out.print("Placa: ");
            String placa = scanner.nextLine();
            System.out.print("Proprietário: ");
            String proprietario = scanner.nextLine();
            System.out.print("Cor: ");
            String cor = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Km rodado: ");
            double kmRodado = scanner.nextDouble();
            scanner.nextLine();

            carros[i] = new Carro(placa, proprietario, cor, modelo, kmRodado);
        }
    }

    public void Listar(){
        System.out.println("\nDados dos carros:");
        for (int i = 0; i < carros.length; i++) {
            System.out.println("\nCarro " + (i + 1) + ":");
            System.out.println("Placa: " + carros[i].getPlaca());
            System.out.println("Proprietário: " + carros[i].getProprietario());
            System.out.println("Cor: " + carros[i].getCor());
            System.out.println("Modelo: " + carros[i].getModelo());
            System.out.println("Km rodado: " + carros[i].getKmRodado());
        }

        
    }

    public void LocalizarPlaca(){
        String buscaPlaca;
        boolean placaBuscar = false;
        String model = "";

        System.out.println("Digite a placa que deseja buscar: ");
        buscaPlaca = scanner.next();

        for (int i = 0; i < carros.length; i++){
            
            placaBuscar = buscaPlaca.equals(carros[i].getPlaca());
            model = carros[i].getModelo();

            if (placaBuscar == true) {
            break;
            }  
        }

        if (placaBuscar == true) {
            System.out.println("Placa encontrada, no veiculo " + model);
        }
        else{
            System.out.println("Essa placa não está cadastrada!");
        }
    }

    public void LocalizarProprietario(){
        String buscaProp;
        boolean propBuscar = false;
        String model = "";

        System.out.println("Digite o nome do proprietário que deseja buscar: ");
        buscaProp = scanner.next();

        for (int i = 0; i < carros.length; i++){
            
            propBuscar = buscaProp.equals(carros[i].getProprietario());
            model = carros[i].getModelo();

            if (propBuscar == true) {
            break;
            }  
        }

        if (propBuscar == true) {
            System.out.println("Proprietário encontrado no veiculo " + model);
        }
        else{
            System.out.println("Este proprietário não esta cadastrado!");
        }
    }

    public void LocalizarMaiorKmrodado(){
        
        System.out.println("Pressione qualquer tecla para buscar a maior quilometragem. ");
        scanner.nextLine();

        double maior = carros[0].getKmRodado();
        String model = "";

        for (int i = 0; i < carros.length ; i++ ){

            if (carros[i].getKmRodado() > maior){
                maior = carros[i].getKmRodado();
                model = carros[i].getModelo();
            }         
        }

        System.out.println("O carro com maior km rodado é " + model + " e seu km é " + maior);  
        
    }
}
