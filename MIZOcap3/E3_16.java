public static class E3_16<E> {
    private Node<E> header;
    private Node<E> trailer;

    /** 
     * Constructor that creates an empty DLL
     */
    public E3_16() {
        this.header = new Node<>(null, null, null);
        this.trailer = new Node<>(null, header, null);
        this.header.setNext(trailer);
    }

   
    public boolean isEmpty() {
      return this.header.getNext() == this.trailer;
    }

  
    public E getFirst() {
      if (isEmpty()) return null;
        return this.header.getNext().getElement();
    }

  
    public E getLast() {
      if (isEmpty()) return null;
        return this.trailer.getPrevious().getElement();
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element, header, header.getNext());
        header.getNext().setPrevious(newNode);
        header.setNext(newNode);
    }

    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (!(that instanceof E3_16) )
    return false;

    E3_16<E> other = (E3_16<E>) that;
  if (header == null&&other.header != null)
            return false;
        if (trailer == null&&other.trailer != null)
            return false;           

  while (header.getNext() != trailer){
      if (!(header.equals(other.header))){
              return false;
      }
              header = header.getNext();
              other.header = other.header.getNext();
     }
        return true;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("E3_16<");

        Node<E> finger = header.getNext();
        while (finger != trailer) {
            sb.append(finger.toString());
            if (finger.getNext() != trailer) {
                sb.append("-");
            }
            finger = finger.getNext();
        }

        sb.append(">");
        return sb.toString();
    }
}