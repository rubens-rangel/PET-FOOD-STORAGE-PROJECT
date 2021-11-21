package Application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Entities.Cachorro;
import Entities.Cliente;
import Entities.Gato;
import Entities.Passaro;


public class Application {
    public static void main(String[] args) {
        String Path = "C:\\Users\\ruben\\OneDrive\\Área de Trabalho\\java_files\\Cadastros.txt"; //arquivo.txt
        File file = new File(Path);

        Scanner sc = new Scanner(System.in); //scanner para Cadastro
        Scanner fr = new Scanner(System.in); //scanner para Fileread

        Cliente cliente = null;

        //estrutura Try-Catch para tratamento das exceções
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Path, true))) {
            fr = new Scanner(file);
            String[] object;

            System.out.println("Bem vindo a Loja de Ração a Granel!");
            System.out.println("Você já possui cadastro na loja? s/n");
            char resposta = sc.next().charAt(0);

            if (resposta == 's') {
                System.out.println("Deixe eu te localizar pelo nome,seu nome é?");
                String nome = sc.next();

                while (fr.hasNextLine()) {
                    object = fr.nextLine().split(";");
                    if (object[0].equals(nome)) {
                        System.out.println("Localizei seu cadastro!");
                        cliente = new Cliente(object[0], object[1], object[2], Double.parseDouble(object[3]));
                    }
                }

            } else if (resposta == 'n') {
                System.out.println("Vamos realizar o seu cadastro:");
                System.out.println("Qual o seu nome é?");
                String nome = sc.next().toLowerCase();
                System.out.println("Qual o nome do seu pet?");
                String nomepet = sc.next().toLowerCase();
                System.out.println("O seu pet é um Gato, Cachorro ou Passaro?");
                String TipoDePet = sc.next().toLowerCase();
                System.out.println("Qual o peso do seu pet?");
                double PesoPet = sc.nextDouble();
                cliente = new Cliente(nome, nomepet, TipoDePet, PesoPet);

                while (!fr.hasNextLine()) {
                    bw.write(cliente.toString());
                    System.out.println("Cadastro Adicionado!");
                }

            } else {
                System.out.println("Operação invalida");
                throw new RuntimeException();
            }


            System.out.println("Então " + cliente.getNome() + " deseja comprar ração para " + cliente.getNomepet() + "?");
            System.out.println("Quantos kg de ração deseja comprar?");
            double QuantidadeAComprar = sc.nextDouble();

            if (cliente.getTipoDePet().equals("cachorro")) {
                Cachorro dog = new Cachorro(cliente.getNomepet(), cliente.getPesoPet());
                System.out.print("O preço final é de: ");
                double precoKg = dog.PesoRacao(cliente.getPesoPet());
                System.out.println(dog.CalculoPreco(QuantidadeAComprar, precoKg));
            }

            if (cliente.getTipoDePet().equals("gato")) {
                Gato cat = new Gato(cliente.getNomepet(), cliente.getPesoPet());
                System.out.print("O preço final é de: ");
                double precoKg = cat.PesoRacao(cliente.getPesoPet());
                System.out.println(cat.CalculoPreco(QuantidadeAComprar, precoKg));
            }

            if (cliente.getTipoDePet().equals("passaro")) {
                Passaro bird = new Passaro(cliente.getNomepet(), cliente.getPesoPet());
                System.out.print("O preço final é de: ");
                double precoKg = bird.PesoRacao(cliente.getPesoPet());
                System.out.println(bird.CalculoPreco(QuantidadeAComprar, precoKg));
            }


        } catch (IOException e) {
            System.out.println("Arquivo não encontrado ou não pode ser lido!");

        } catch (NullPointerException e) {
            System.out.println("Usuario não encontrado!");

        } finally {

            if (sc != null) {
                sc.close();
                fr.close();
            }
        }
    }
}
