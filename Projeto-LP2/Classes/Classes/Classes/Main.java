package Classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        List<Tutor> tutores = new ArrayList<Tutor>();
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        List<Adotante> adotantes = new ArrayList<Adotante>();
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        System.out.println("Bem-vindo ao sistema de gerenciamento de Pessoas!");

        boolean running = true;
        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Criar nova pessoa");
            System.out.println("2. Exibir informações de uma pessoa");
            System.out.println("3. Exibir informações de todas as pessoas");
            System.out.println("4. Editar informações de uma pessoa");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    pessoa = criarPessoa(scanner, pessoas, tutores, adotantes, funcionarios);
                    pessoas.add(pessoa);
                    break;
                case 2:
                    System.out.println("Qual seu tipo:\n1. Tutor\n2. Adotante\n3. Funcionário");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    exibirPessoa(tipo, scanner, tutores, adotantes, funcionarios);
                    break;
                case 3:
                    System.out.println("Qual tipo deseja visualizar:\n1. Tutor\n2. Adotante\n3. Funcionário\n4. Todos");
                    int tipos = scanner.nextInt();
                    scanner.nextLine();
                    exibirPessoas(scanner, tipos, pessoas, tutores, adotantes, funcionarios);
                    break;
                case 4:
                    System.out.println("Digite o id da pessoa que deseja editar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    editarPessoa(scanner, pessoas, id);
                    break;
                case 5:
                    running = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    // cria um pessoa, e baseado na escolha do usúario escolhe se será tutor, adotante e/ou funcionário
    private static Pessoa criarPessoa(Scanner scanner, List<Pessoa> pessoas, List<Tutor> tutores, List<Adotante> adotantes, List<Funcionario> funcionarios) {
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

        // caso a lista de pessoas esteja vazia, o id é 1 (primeira pessoa cadastrada)
        // se a lista já tem alguma pessoa, o id é o tamanho da lista (número de pessoas cadastradas) + 1
        int idPessoa = 0;
        if (pessoas.isEmpty() == true)
            idPessoa = 1;
        else if (pessoas.isEmpty() == false)
            idPessoa = (pessoas.size()) + 1;

        Pessoa pessoa = new Pessoa(idPessoa, nome, dtn, genero, cpf, endereco, telefone, email, senha);

        System.out.println("Que tipo de pessoa você é?\nTutor[T] Adotante[A] Funcionário[F]:");
        String Tipo = scanner.nextLine();
        int x = 0;
        int y = 0;
        int z = 0;
        while (x != 1){
            y++;
            // o usúario escolhe que tipo ele será, podendo escolher adicionar mais de um tipo
            // digitando 1 se cadastra com apenas um tipo
            // digitando 2 a primeira vez se cadastra com dois tipos, digitando 2 pela segunda vez com 3 tipos
            System.out.println("Escolha se deseja se cadastrar com mais de um tipo:\n1. Cadastrar com um tipo\n2. Para cadastrar com mais de um tipo");
            x = scanner.nextInt();
            scanner.nextLine();
            // condição para não mostrar a mensagem, nem pegar o input do usúario na primeira passagem pelo loop
            if (z != 0){
                System.out.println("Qual outro tipo de pessoa você é?\nTutor[T] Adotante[A] Funcionário[F]:");
            Tipo = scanner.nextLine();
            }
            switch (Tipo) {
                case "T":
                case "t":
                    Tutor tutor = new Tutor();
                    tutor = criarTutor(scanner, pessoa, tutores);
                    // adiciona o tutor criado a lista de tututores
                    tutores.add(tutor);
                    break;
                case "A":
                case "a":
                    Adotante adotante = new Adotante();
                    adotante= criarAdotante(scanner, pessoa, adotantes);
                    // adiciona o adotante criado a lista de adotantes
                    adotantes.add(adotante);
                    break;
                case "F":
                case "f":
                    Funcionario funcionario = new Funcionario();
                    funcionario = criarFuncionario(scanner, pessoa, funcionarios);
                    // adiciona o funcionário criado a lista de funcionários
                    funcionarios.add(funcionario);
                    break;
            
                default:
                    System.out.println("Tipo incompatível");
                    break;
            }
            z++;
            // caso o usúario cadastre 3 vezes automaticamente saia do loop (x = 1)
            if (y == 3)
                x = 1;
        }


        
        System.out.println("Pessoa criada com sucesso!");
        return pessoa;
    }

    /*
    cria um tutor
    parámetros:
    scanner(para pegar os dados do tutor),
    pessoa(pessoa que detém as informções do tutor),
    lista tutores(lista para verificar e gerar o id do tutor).
    */
    private static Tutor criarTutor(Scanner scanner, Pessoa pessoa, List<Tutor> tutores){
        
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


        System.out.print("Histórico de Adoção: ");
        String histAdocao = scanner.nextLine();

        // caso a lista de tutores esteja vazia, o id é 1 (primeira tutor cadastrado)
        // se a lista já tem algum tutor, o id é o tamanho da lista (número de tutores cadastrados) + 1
        int idTutor = 0;
        if (tutores.isEmpty() == true)
            idTutor = 1;
        else if (tutores.isEmpty() == false)
            idTutor = (tutores.size()) + 1;
        System.out.println("Tutor criado com sucesso!");
        Tutor tutor = new Tutor(pessoa, idTutor, numAnimal, histAdocao);
        return tutor;

    }

    // exibe as informações do tutor de acordo com seu id
    private static void exibirTutor(int id, List<Tutor>tutores)
    {
        System.out.println("\n--- Informações do Tutor ---");
        System.out.println(tutores.get(id - 1));
    }

    // exibe todos os tutores
    private static void exibirTutores(List<Tutor> tutores)
    {
        if (tutores.isEmpty() == true)
            System.out.println("\nNenhum tutor encontrado.");
        else{
            int tamanho = tutores.size();
        for (int i = 0; i < tamanho; i++) {
            System.out.println("\n--- Informação do Tutor ---");
            System.out.println(tutores.get(i));
        }
        }
    }

    /*
    cria um adotante
    parámetros:
    scanner(para pegar os dados do adotante),
    pessoa(pessoa que detém as informções do adotante),
    lista adotantes(lista para verificar e gerar o id do adotante).
    */
    public static Adotante criarAdotante(Scanner scanner, Pessoa pessoa, List<Adotante>adotantes){
        System.out.println("\n--- Criar Novo Adotante ---");
        System.out.print("Espécie do Animal: ");
        String especie = scanner.nextLine();

        System.out.println("Raça do Animal: ");
        String raca = scanner.nextLine();

        System.out.println("Tipo do Animal: ");
        String tipo = scanner.nextLine();

        System.out.println("Idade do Animal: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Sexo do Animal: ");
        String sexo = scanner.nextLine();

        // caso a lista de adotantes esteja vazia, o id é 1 (primeira adotante cadastrado)
        // se a lista já tem algum adotante, o id é o tamanho da lista (número de adotantes cadastrados) + 1
        int idAdotante = 0;
        if (adotantes.isEmpty() == true)
            idAdotante = 1;
        else if (adotantes.isEmpty() == false)
            idAdotante = (adotantes.size()) + 1;

        System.out.println("Adotante criado com sucesso!");
        Adotante adotante1 = new Adotante(pessoa, idAdotante, especie, raca, tipo, idade, sexo);
        return adotante1;
    }

    // exibe as informações do adotante de acordo com seu id
    public static void exibirAdotante(int id, List<Adotante>adotantes){
        if (adotantes.isEmpty() == true)
            System.out.println("\nNenhum adotante cadastrado.");
        else{
            System.out.println("\n--- Informações do Adotante ---");
            System.out.println(adotantes.get(id - 1));
        }
        
    }

    // exibe as informações de todos os adotantes
    private static void exibirAdotantes(List<Adotante> adotantes)
    {
        if (adotantes.isEmpty() == true)
            System.out.println("\nNenhum adotante encontrado.");
        else{
            int tamanho = adotantes.size();
        for (int i = 0; i < tamanho; i++) {
            System.out.println("\n--- Informação do Adotante ---");
            System.out.println(adotantes.get(i));
        }
        }
    }

    /*
    cria um funcionário
    parámetros:
    scanner(para pegar os dados do funcionário),
    pessoa(pessoa que detém as informções do funcionário),
    lista funcionarios(lista para verificar e gerar o id do funcionário).
    */
    public static Funcionario criarFuncionario(Scanner scanner, Pessoa pessoa, List<Funcionario>funcionarios){
        System.out.println("\n--- Criar novo Funcionário ---");
        System.out.println("Data da Contratação: ");
        String dataContr = scanner.nextLine();

        System.out.println("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.println("Salario: ");
        double salario = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Departamento: ");
        String departamento = scanner.nextLine();

        // caso a lista de funcionários esteja vazia, o id é 1 (primeiro funcionário cadastrado)
        // se a lista já tem algum funcionário, o id é o tamanho da lista (número de funcionários cadastrados) + 1
        int idFuncionario = 0;
        if (funcionarios.isEmpty() == true)
            idFuncionario = 1;
        else if (funcionarios.isEmpty() == false)
            idFuncionario = (funcionarios.size()) + 1;

        System.out.println("Funcionário criado com sucesso!");
        Funcionario funcionario = new Funcionario(pessoa, idFuncionario, dataContr, cargo, salario, departamento);

        return funcionario;
    }

    // exibe as informações do funcionário de acordo com seu id
    public static void exibirFuncionario(int id, List<Funcionario>funcionarios){
        System.out.println("\n--- Informações do Funcionário ---");
        System.out.println(funcionarios.get(id - 1));
    }

    // exibe as informações de todos os funcionários
    private static void exibirFuncionarios(List<Funcionario> funcionarios)
    {
        if (funcionarios.isEmpty() == true)
            System.out.println("\nNenhum funcionário encontrado.");
        else{
            int tamanho = funcionarios.size();
        for (int i = 0; i < tamanho; i++) {
            System.out.println("\n--- Informação do funcionário ---");
            System.out.println(funcionarios.get(i));
        }
        }
    }

    /*
    determina se vai exibir todos os tutores, adotantes, funcionários ou todas as pessoas
    de acordo com a escolha do usúario
    */
    private static void exibirPessoas(Scanner scanner, int tipo, List<Pessoa> pessoas, List<Tutor>tutores,
     List<Adotante>adotantes, List<Funcionario>funcionarios)
    {
        
        if (pessoas.isEmpty() == true)
            System.out.println("\nNenhuma pessoa encontrada.");
        else{
            switch (tipo) {
                case 1:
                    exibirTutores(tutores);
                    break;
                case 2:
                    exibirAdotantes(adotantes);
                    break;
                case 3:
                    exibirFuncionarios(funcionarios);
                    break;
                case 4:
                    int tamanho = pessoas.size();
                    for (int i = 0; i < tamanho; i++) {
                        System.out.println("\n--- Informação da Pessoa ---");
                        System.out.println(pessoas.get(i));
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }   
        }
    }

    // determina se vai exibir as informações de um tutor, adotante ou funcionário
    private static void exibirPessoa(int Tipo, Scanner scanner, List<Tutor>tutores,
    List<Adotante>adotantes, List<Funcionario>funcionarios) {

        switch (Tipo) {
            case 1:
                System.out.println("Qual o id do tutor que deseja exibir: ");
                int idTutor = scanner.nextInt();
                scanner.nextLine();
                exibirTutor(idTutor, tutores);
                break;
            case 2:
                System.out.println("Qual o id do adotante que deseja exibir: ");
                int idAdotante = scanner.nextInt();
                scanner.nextLine();
                exibirAdotante(idAdotante, adotantes);
                break;
            case 3:
                System.out.println("Qual o id do funcionário que deseja exibir: ");
                int idFuncionario = scanner.nextInt();
                scanner.nextLine();
                exibirFuncionario(idFuncionario, funcionarios);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
    }

    // edita as informações de uma pessoa, caso não digite nada em algum campo não modifica ele
    private static void editarPessoa(Scanner scanner, List<Pessoa>pessoas, int id) {
        System.out.println("\n--- Editar Pessoa ---");
        id = id - 1;
        System.out.print("Nome (" + pessoas.get(id).getNome() + "): ");
        String nome = scanner.nextLine();
        if (!nome.isEmpty()) pessoas.get(id).setNome(nome);

        System.out.print("DatadeNascimento (" + pessoas.get(id).getDataNasc() + "): ");
        String dtn = scanner.nextLine();
        if (!dtn.isEmpty()) pessoas.get(id).setDataNasc(dtn);

        System.out.print("Gênero (" + pessoas.get(id).getGenero() + "): ");
        String genero = scanner.nextLine();
        if (!genero.isEmpty()) pessoas.get(id).setGenero(genero);

        System.out.print("CPF (" + pessoas.get(id).getCPF() + "): ");
        String cpf = scanner.nextLine();
        if (!cpf.isEmpty()) pessoas.get(id).setCPF(cpf);

        System.out.print("Enderço (" + pessoas.get(id).getEndereco() + "): ");
        String endereco = scanner.nextLine();
        if (!endereco.isEmpty()) pessoas.get(id).setEndereco(endereco);

        System.out.print("Telefone (" + pessoas.get(id).getTelefone() + "): ");
        String telefone = scanner.nextLine();
        if (!telefone.isEmpty()) pessoas.get(id).setTelefone(telefone);

        System.out.print("Email (" + pessoas.get(id).getEmail() + "): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) pessoas.get(id).setEmail(email);

        System.out.print("Senha (" + pessoas.get(id).getSenha() + "): ");
        String senha = scanner.nextLine();
        if (!senha.isEmpty()) pessoas.get(id).setSenha(senha);

        System.out.println("Informações da pessoa astualizadas com sucesso!");
    }
}