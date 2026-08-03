int anosAutonomia = 450; //Int
double capacidadeBateria = 75.5; //Float
string modeloCarro = "Brasilia";
bool carregamentoRapido = true;

Console.WriteLine($" Qual a autonomia do Veiculo {anosAutonomia}");
Console.WriteLine($" Capacidade da bateria: {capacidadeBateria}");
Console.WriteLine($" Modelo do carro: {modeloCarro}");
Console.WriteLine($" Velocidade de carregamento: {carregamentoRapido}");


Console.Write("Digite a voltagem do carregador (110V / 220V)"); //Comentario
string entrada = Console.ReadLine(); //Input

string modelo = "      byd      ";

string formatado = modelo.ToUpper().Trim(); //Métodos

Console.WriteLine(formatado);


