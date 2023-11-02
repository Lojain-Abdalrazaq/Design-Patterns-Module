package Iterator;

public class Main {
    public static void main(String[] args) {
        NameRepos namesRepository = new NameRepos();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }


}
