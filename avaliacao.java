package av1;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class avaliacao {
	public static void main(String[]args) {
//questao 1
		Scanner ano = new Scanner(System.in);
		System.out.println("Insira seu ano de nascimento: ");
		int indagacao = ano.nextInt();
		int anoatual = 2026;
		System.out.println(anoatual);
		int idade = anoatual - indagacao;
		System.out.println("Sua idade é " + idade + "!");
		
//questao 2
		System.out.println("1 - Quadrado, 2 - Retângulo, 3 - Triângulo, 4 - Círculo.");
		Scanner escolha = new Scanner(System.in);
		
		int num = escolha.nextInt();
		if(num == 1) {
			System.out.println("Você escolheu quadrado!");
			System.out.println("Determine as medidas em metros: ");
			Scanner medidas = new Scanner(System.in);
			System.out.println("Determine o lado 1: ");
			int lado = medidas.nextInt();
			System.out.println("Determine o lado 2: ");
			int lado2 = medidas.nextInt();
			int AreaQuadrado = lado * lado2;
			System.out.println("A área do quadrado é " + AreaQuadrado + "m²");
		}
			else if(num == 2) {
				System.out.println("Você escolheu retângulo!");
				System.out.println("Determine as medidas em metros: ");
				Scanner medidas = new Scanner(System.in);
				System.out.println("Determine a base: ");
				int BaseRetangulo = medidas.nextInt();
				System.out.println("Determine a altura: ");
				int AlturaRetangulo = medidas.nextInt();
				int AreaRetangulo = BaseRetangulo * AlturaRetangulo;
				System.out.println("A área do retângulo é " + AreaRetangulo + "m²");
			}
				else if(num == 3) {
						System.out.println("Você escolheu triângulo!");
						System.out.println("Determine as medidas em metros: ");
						Scanner medidas = new Scanner(System.in);
						System.out.println("Determine a base: ");
						int BaseTriangulo = medidas.nextInt();
						System.out.println("Determine a altura: ");
						int AlturaTriangulo = medidas.nextInt();
						int AreaTriangulo = BaseTriangulo * AlturaTriangulo / 2;
						System.out.println("A área do triângulo é " + AreaTriangulo + "m²");
				}
						else if(num == 4){
								System.out.println("Você escolheu círculo!");
								System.out.println("Determine o raio: ");
								Scanner medidas = new Scanner(System.in);
								float pi = (float) 3.14;
								float RaioCirculo = medidas.nextInt();
								float AreaCirculo = pi * (RaioCirculo * RaioCirculo);
								System.out.println("A área do círculo é " + AreaCirculo + "m²");
						}
						else {
							System.out.println("Opção indisponível.");
						}
//questao 3
		System.out.println("Insira dois valores: ");
		Scanner valor = new Scanner(System.in);
		
		float num1 = valor.nextInt();
		float num2 = valor.nextInt();
		
		System.out.println("Escolha entre as seguintes operações:");
		
		Scanner Operacao = new Scanner(System.in);
		System.out.println("1 - Soma, 2- Subtração, 3 - Multiplicação, 4 - Divisão");
		int resposta = Operacao.nextInt();
		if( resposta == 1) {
			System.out.println("Você escolheu soma! Aqui está: ");
			float soma = num1 + num2;
			System.out.println("A soma entre os dois valores resulta em: "+ soma + "!");
					
			}
		else if(resposta == 2) {
			System.out.println("Você escolheu subtração! Aqui está: ");
			float Subtracao = num1 - num2;
			System.out.println("A subtração entre os dois valores resulta em: "+ Subtracao + "!");
			
		}
		else if(resposta == 3) {
			System.out.println("Você escolheu multiplicação! Aqui está: ");
			float Multiplicacao = num1 * num2;
			System.out.println("A multiplicação entre os dois valores resulta em: "+ Multiplicacao + "!");
		}
		else if(resposta == 4) {
			System.out.println("Você escolheu divisão! Aqui está: ");
			float Divisao = num1 / num2;
			System.out.println("A divisão entre os dois valores resulta em: "+ Divisao + "!");
		}
		}
		
		
		
	
	
	
	
	
	}
	
				
					
				
			
		

