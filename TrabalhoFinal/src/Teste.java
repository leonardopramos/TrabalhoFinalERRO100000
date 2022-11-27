import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args) {
        
        ListaProdutos lst = new ListaProdutos();
        ArvoreProduto ar = new ArvoreProduto();

        File arquivoCSV50 = new File("A:/Documentos/Faculdade/2 Semestre/ALESTI/TrabalhoFinal/Produtos_100000.csv");
        int i = 0;
        try{
            String linhas = new String();
            Scanner sc = new Scanner(arquivoCSV50);
            sc.nextLine();
            while(sc.hasNext()){
                linhas = sc.nextLine();
                String[] aux = linhas.split(",");
                lst.adicionar(new Produto(Integer.parseInt(aux[0]), aux[1], aux[2], Double.parseDouble(aux[3])));
                ar.add(new Produto(Integer.parseInt(aux[0]), aux[1], aux[2], Double.parseDouble(aux[3])));
                System.out.println(i);
                i++;
            }
        } catch (FileNotFoundException e){
            System.out.println("Arquivo nao encontrado!");
        }
        System.out.println("Altura: " + ar.alturaArvore(ar.getRaiz()));
    }
}
