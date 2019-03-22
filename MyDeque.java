public class MyDeque<E>{
  
  private E[] data;
  private int size, start, end;

  // Constructor
  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    size, start, end = 0;
    
  }
  
    @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[10];
    size = initialCapacity;
    start, end = 0; 
  
  }
  
  
  public int size(){
    return size;
  }
  
  
  
  
  public String toString(){ 
    
    String str = "{ ";

    if(end < start){
      
      int i = start;
      while(i < data.length){
        if(data[i] != null){
          str += data[i];
          str += ", ";
          i++;
        }
      }
      
      i = 0; //set i to 0 to wrap around to beginning of the deque
  
      while(i < end){
        str += data[i];
        str += ", ";
        i++
      }
      
      str += " }";
      return str;
    
    }
    
    
  }
  
  public void addFirst(E element){
    
    //throw exception
    if(element == null){
      throw new NullPointerException();  
    }
  }
  
    if(start >= 1){
      data[start - 1] = element;
      size++;
    }
    else if(){
      resize();
    }
  }
  
  public void addLast(E element){ 
  
  }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
