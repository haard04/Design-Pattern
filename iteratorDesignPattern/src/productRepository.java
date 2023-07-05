public class productRepository implements shop {
    public String products[] ={"product 1","product 2","product 3","product 4"};
    @Override
    public Iterator getIterator(){
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext(){
           if(index<products.length){
              return true;
           }
           return false;
        }

        @Override
        public Object next(){
            if(this.hasNext()){
                return products[index++];
            }
            return null;
        }
    }
}

