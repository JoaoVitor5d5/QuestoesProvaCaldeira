int prioridade = 4;
int urgencia = 8;

if (prioridade > 3 && urgencia > 7) {
  System.out.println("Tarefa critica");
} else if (prioridade > 3 || urgencia > 7) (
  System.out.println("Tarefa importante");
} else {
  System.out.println("Tarefa comum");
}


// sem o main não faz nada! mesmo com a lógica correta
