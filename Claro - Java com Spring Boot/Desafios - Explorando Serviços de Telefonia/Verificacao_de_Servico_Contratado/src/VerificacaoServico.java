/*
DESCRIÇÃO
Uma concessionária de telecomunicações oferece quatro tipos de serviços: telefonia móvel, telefonia fixa, banda larga e TV por assinatura. 

Para facilitar o atendimento ao cliente, é necessário implementar um programa que verifique se um cliente específico contratou um determinado serviço. 

Por exemplo, quando um cliente liga para a central de atendimento e menciona um serviço, o atendente deve ser capaz de rapidamente verificar se esse serviço está contratado pelo cliente.

ENTRADA
A entrada deve receber duas linhas. A primeira linha contém o nome do serviço a ser verificado (por exemplo, "movel", "fixa", "banda larga", "tv"). 

A segunda linha contém o nome do cliente seguido pelos serviços que ele contratou, todos separados por vírgulas (por exemplo, "Alice,movel,fixa").

SAÍDA
Deverá retornar "Sim" se o cliente contratou o serviço e "Nao" caso contrário.

Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	                Saída
movel
Alice,movel,fixa	    Sim

fixa
Bob,movel,tv	        Nao

tv
Carol,movel,fixa,tv	    Sim
 */

import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String servico = scanner.nextLine().trim();
        
        String entradaCliente = scanner.nextLine().trim();
        
        String[] entradas = entradaCliente.split(",");
        String nomeCliente = entradas[0];
        String contratado = "Nao";
        
        for (String partes : entradas) {
            if(partes.equalsIgnoreCase(servico)){
                contratado = "Sim";
                break;
            }
        }

        scanner.close();
        
        System.out.printf(contratado);
    }
}