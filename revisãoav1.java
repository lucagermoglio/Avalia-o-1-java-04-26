package ava;
import java.util.Scanner;

public class av1 {
	public static void main(String[]args) {
//questao1questao1questao1questao1questao1questao1questao1questao1questao1questao1questao1
        Scanner per = new Scanner(System.in);
        int sim = 0;
        int nao = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Usuário " + i + " - Você gosta de beterraba? (1 = SIM, 2 = NÃO): ");
            int resposta = per.nextInt();

            if (resposta == 1) {
                sim = sim + 1;
            } else {
                nao = nao + 1;
            }
        }
        System.out.println("\nResultado:");
        System.out.println("SIM: " + sim);
        System.out.println("NÃO: " + nao);
        
//questao2questao2questao2questao2questao2questao2questao2questao2questao2questao2questao2

        Scanner ReceberNumeros = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        float n1 = ReceberNumeros.nextFloat();
        float n2 = ReceberNumeros.nextFloat();
        float soma = n1 + n2;
        float media = soma / 2;
        System.out.println("A soma é de: "+ soma);
        System.out.println("A média é: "+ media);
        
        if(n1>n2) {
        	float sub = n1 - n2;
        	System.out.println("A diferença entre os dois é: "+sub);
        } else {
        	float sub2 = n2 - n1;
        	System.out.println("A diferença entre os dois é: "+ sub2);
        	
        }
        float multiplicacao = n1 * n2;
        System.out.println("A multiplicação resulta em " + multiplicacao);
        float divisao = n1 / n2;
        System.out.println("A divisão entre os valores resulta em: " + divisao);
//questao3questao3questao3questao3questao3questao3questao3questao3questao3questao3questao3
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.print("Digite o lado A: ");
        a = scanner.nextDouble();

        System.out.print("Digite o lado B: ");
        b = scanner.nextDouble();

        System.out.print("Digite o lado C: ");
        c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triângulo válido!");
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }

        } else {
            System.out.println("Não é um triângulo válido!");
        }
//questao4questao4questao4questao4questao4questao4questao4questao4questao4questao4questao4
        System.out.println("Defina os coeficientes da equeação:");
        Scanner coeficientes = new Scanner(System.in);
        int a1 = coeficientes.nextInt();
        int a2 = coeficientes.nextInt();
        int a3 = coeficientes.nextInt();
        System.out.println("Formato de uma equação do segundo grau: ax^2 + bx + c = 0");
        int delta = (a2 * a2) -(4 *a1*a3);
        System.out.println("O valor de delta é: " + delta);
        	int x1 = (int) ((-a2 + Math.sqrt(delta)) / (2 * a));
        	int x2 = (int) ((-a2 - Math.sqrt(delta)) / (2 * a));
        	System.out.println("x1 = " + x1);
        	System.out.println("x2 = " + x2);
        	int raiz1 = a1 *x1*x1 + a2*a1 + a3;
            int raiz2 = a1 *x2*x2 + a2*a1 + a3;
            System.out.println("Segunda raiz: "+ raiz2);
            System.out.println("Primeira raiz: "+ raiz1);
        }
        	}
       

        
        
        
        
        
        
        
        
        
	