package Classes;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Bem-vindo ao sistema de gerenciamento de Pessoas!");

        boolean running = true;
        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar nova pessoa");
            System.out.println("2. Exibir informações da pessoa");
            System.out.println("3. Editar informações da pessoa");
            System.out.println("4. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    pessoa = criarPessoa(scanner);
                    break;
                case 2:
                    exibirPessoa(pessoa);
                    break;
                case 3:
                    editarPessoa(scanner, pessoa);
                    break;
                case 4:
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static Pessoa criarPessoa(Scanner scanner) {
        System.out.println("\n--- Criar Nova Pessoa ---");

        

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("DTN: ");
        String dtn = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        // Você pode definir o ID da pessoa conforme necessário (ex: auto-incremento ou geração manual)
        int idPessoa = 1; // Exemplo de ID fixo

        Pessoa pessoa = new Pessoa(idPessoa, nome, dtn, genero, cpf, endereco, telefone, email, senha);

        System.out.println("Que tipo de pessoa você é?\nTutor[T] Adotante[A] Funciomario[F]:");
        String Tipo = scanner.nextLine();
        switch (Tipo) {
            case "T":

                Tutor tutor1 = new Tutor();
                tutor1 = criarTutor(scanner, pessoa);
                break;
            case "A":

                break;
            case "F":

                break;
        
            default:
                System.out.println("Pessoa incompatível");
                break;
        }


        
        System.out.println("Pessoa criada com sucesso!");
        return pessoa;
    }


    private static Tutor criarTutor(Scanner scanner, Pessoa pessoa1){
        
        System.out.println("\n--- Criar Nova Tutor ---");
        System.out.print("Numero animal: ");
        int numAnimal = scanner.nextInt();

        /* Apenas adicionar uma opção de escanear um NextLine 
         * para o buffer sem setar uma variável receptora resolveu o problema;
         * @luizfpq
         *
         *  Quando você chama scanner.nextInt(), o cursor do scanner fica posicionado após o número, 
         *  e o próximo scanner.nextLine() captura a nova linha deixada pelo nextInt(), 
         *  em vez de esperar pela entrada do usuário.
         */

        scanner.nextLine();


        System.out.print("Histórico de Adoção:");
        String histAdocao = scanner.nextLine();

        int idTutor = 1; // Exemplo de ID fixo
        System.out.println("Tutor criada com sucesso!");
        Tutor tutor1 = new Tutor(pessoa1, idTutor, numAnimal, histAdocao);
        return tutor1;

    }
    private static void exibirPessoa(Pessoa pessoa) {
        System.out.println("\n--- Informações da Pessoa ---");
        System.out.println(pessoa.toString());
    }

    private static void editarPessoa(Scanner scanner, Pessoa pessoa) {
        System.out.println("\n--- Editar Pessoa ---");

        System.out.print("Nome (" + pessoa.getNome() + "): ");
        String nome = scanner.nextLine();
        if (!nome.isEmpty()) pessoa.setNome(nome);

        System.out.print("DatadeNascimento (" + pessoa.getDataNasc() + "): ");
        String dtn = scanner.nextLine();
        if (!dtn.isEmpty()) pessoa.setDataNasc(dtn);

        System.out.print("Gênero (" + pessoa.getGenero() + "): ");
        String genero = scanner.nextLine();
        if (!genero.isEmpty()) pessoa.setGenero(genero);

        System.out.print("CPF (" + pessoa.getCPF() + "): ");
        String cpf = scanner.nextLine();
        if (!cpf.isEmpty()) pessoa.setCPF(cpf);

        System.out.print("Enderço (" + pessoa.getEndereco() + "): ");
        String endereco = scanner.nextLine();
        if (!endereco.isEmpty()) pessoa.setEndereco(endereco);

        System.out.print("Telefone (" + pessoa.getTelefone() + "): ");
        String telefone = scanner.nextLine();
        if (!telefone.isEmpty()) pessoa.setTelefone(telefone);

        System.out.print("Email (" + pessoa.getEmail() + "): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) pessoa.setEmail(email);

        System.out.print("Senha (" + pessoa.getSenha() + "): ");
        String senha = scanner.nextLine();
        if (!senha.isEmpty()) pessoa.setSenha(senha);

        System.out.println("Informações da pessoa atualizadas com sucesso!");
    }
}