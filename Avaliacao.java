void main(){
    int clientes = Integer.parseInt(IO.readln("Digite quantos clientes foram atendidos: "));
    int totalclientes = clientes;
    double tempo = 0;
    
    do {
        double espera = Integer.parseInt(IO.readln("Digite quanto você esperou para ser atendido: "));
        tempo = tempo + espera;
        
        clientes = clientes - 1;
    
    } while(clientes > 0);

    double media = tempo / totalclientes;

    if (media <= 10) {
        System.out.println("Atendimento Ágil");
    }
    else{
        if (media <= 20) {
            System.out.println("Atendimento regular");
        }
        else{
            System.out.println("Atendimento Lento: Reforçar a Equipe");
    }
    }
}
