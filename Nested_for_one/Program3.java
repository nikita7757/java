package Nested_for_one;

 class Program3 {
    public static void main(String [] args){
        int x =14;
        for(int i = 1; i<=4; i++){
            
            for(int j = 1; j<=4;j++){
                System.out.print(x+"\t");    
            }
            System.out.println();
            x++;
        }
    }  
}
