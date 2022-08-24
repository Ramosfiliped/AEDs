package mylistpackage;

//Implementação de uma Lista em Java
public class MyList<T> {
    Node first; //Referência para o primeiro nó

    //Inicialmente a lista começa vazia
    public MyList(){
        this.first = null;
    }

    //Método para adicionar um elemento(nó) na lista
    public void add(T value){
        //Se a lista estiver vazia, basta adicionar na primeira posição
        if(first == null){
            first = new Node<>(value);
        }else{
            //Percorrendo a lista
            for(Node<T> node = first; node != null; node = node.getNext()){
                //Se o próximo nó não existe, o nó atual apontará para o novo nó
                if(node.getNext() == null) {
                    node.setNext(new Node<>(value));
                    //Finaliza a função para o método não entrar em loop
                    return;
                }
            }
        }
    }

    //Atualiza o valor de um nó específico
    public void setValue(int index, T value){
        int counter = 0;
        for(Node<T> node = first; node != null; node = node.getNext()){
            if(counter == index){
                node.setValue(value);
                return;
            }
        }
    }

    public void remove(int index){
        int counter = 0;
        if (index == 0){
            this.first = first.getNext();
            return;
        }
        for(Node<T> node = first; node != null; node = node.getNext()){
            if((counter + 1 == index)){
                Node<T> next = node.getNext();
                node.setNext(next.getNext());
                return;
            }
        }
        System.out.println("Indice maior que o tamanho da lista");
    }

    public void print() {
        int counter = 0;
        for(Node<T> node = first; node != null; node = node.getNext()){
            System.out.println(counter + ": " + node.getValue());
            counter++;
        }
    }
}
