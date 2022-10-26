public void rotate() { 
		if(this.size==0 || this.size==1) { 
			return;
		}
		tail.setNext(this.head);
		tail = tail.getNext();
		
		// Circular
		head = tail.getNext();

		tail.setNext(null);

	}