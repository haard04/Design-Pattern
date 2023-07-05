public class Main {
    public static void main(String[] args) {

        productRepository productsRepository=new productRepository();
        for(Iterator itr=productsRepository.getIterator(); itr.hasNext();){
            String name= (String) itr.next();
            System.out.println("Name: "+name);
        }
    }
}