public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int x = 0;x<13;x++){
            for (int y = 0;y<13;y++){
                for (int z = 0;z<13;z++){
                    if(x<y && y<z && x+y+z==13 && y != 1 && x != 3 && z != 11 && z != 6){
                        System.out.println("x = "+x);
                        System.out.println("y = "+y);
                        System.out.println("z = "+z);
                        System.out.println("\n");
                    }
                }
            }
        }

    }
}