public class switch_test {

    public static void main(String[] args){

        int random = (int) Math.ceil(Math.random() * 10);
        System.out.println(random);

        switch (random)
        {
            case 3:
                System.out.println("switch 3");
            break;
            case 6: System.out.println("switch 6");
            break;
            case 1: case 2:
            case 4: case 8:
                System.out.println("switch is 1,2,4 of 8");
            break;
        }



       /* if(random >= 8)
        {
            System.out.println("kys");
        }
        else if(random == 7)
        {
            System.out.println("omg gelijk aan 7");
        }
        else if (random > 3 && random < 7)
        {
            System.out.println("het getal is tussen de 3 en 7");
        }
        else
        {
            System.out.println("het is een ander getal");
        }
        if (random == 1 || random ==3)
        {
            System.out.println("het getal is 1 of 3");
        }
        if ((random != 3 && random != 6)|| random == 8)
        {
            System.out.println("je moeder");
        }*/
    System.out.println("einde programma");
    }
}
