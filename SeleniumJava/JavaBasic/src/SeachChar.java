public class SeachChar {

    public static void main(String[] args) {
        String name = "Sushil";
        char target = 's';
        
        
        searchChar(name.toLowerCase(), target);
    }

    static void searchChar(String name, char target){
        char[] value = name.toCharArray();
        
        for(int i = 0; i<value.length;i++){
            if(value[i]==target){
                System.out.println("Index value " + i +" = "+ value[i]);
            }

        }

    }
    
}
