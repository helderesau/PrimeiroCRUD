package biblioteca.hec;

import java.util.Scanner;

public class PrimeiroCrud {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String[]nomes = new String[50];
        int contador = 0;
        while (true){
            System.out.println("Escolha uma opção:  \n0 = Sair do sistema \n1 = Criar \n2 = Deletar \n3 = Alterar \n4 = Buscar \n5 = Buscar todos");
            int acao = sc.nextInt();

            if(acao == 0){
                System.out.println("Programa finalizado com sucesso!");
                break;
            }
            else if (acao == 1){
                System.out.println("Digite o nome do aluno: ");
                String nome = sc.next();
                nomes[contador] = nome;
                contador++;
            }
            else if (acao == 5){
                for (int i = 0; i < nomes.length; i++){
                    if(nomes[i] != null){
                        System.out.println(nomes[i] + " ID " + i);
                    }
                }
            }
            else if (acao == 4){
                for (int i = 0; i < nomes.length; i++){

                    System.out.print("Digite o número do nome escolhido: ");
                    int buscarnome = sc.nextInt();

                        System.out.println("Você escolheu o nome: " + nomes[buscarnome]);
                    break;
                }
            }
            else if (acao == 3){
                for (int i = 0; i < nomes.length; i++){

                    System.out.println("Digite o numero do nome que gostaria de alterar: ");
                    int nomealterar = sc.nextInt();

                    System.out.println("Você irá alterar o nome: " + nomes[nomealterar]);

                    System.out.println("Digite o novo nome: ");
                    String novonome = sc.next();

                    nomes[nomealterar] = novonome;

                    System.out.println("Você escolheu o nome: " + novonome);

                    break;

                }
            }
            else if (acao == 2){
                for (int i = 0; i < nomes.length; i++){

                    System.out.println("Digite o numero do nome que deseja excluir: ");
                    int nomeexcluir = sc.nextInt();

                    System.out.println("Você excluiu o nome: " + nomes[nomeexcluir]);

                    nomes[nomeexcluir] = null;

                    break;

                }
            }
        }
    }
}
