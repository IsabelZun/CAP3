public int size(){
    node n = head;
    node m = tail;
    if(n == null){
        return 0;
    }
    int size = 1;
    While(n!=m){
        size++;
        n=n.getNext();
    }
    return size;
}
//Quise implementarlo en la clase que dice el ejercicio pero no pude arreglar los errores que me muestra el codigo que esta en el libro