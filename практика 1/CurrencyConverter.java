import java.util.Scanner;
class CurrencyConverter {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки        
        int yuan; // сумма денег в юанях      
        double roubles; // сумма денег в рублях        
        String s = " ";        
        Scanner input = new Scanner(System.in);        // Получение суммы в юанях        
        System.out.print("Введите сумму денег в юанях: ");        
        yuan = input.nextInt();        
        if (yuan <= 0) {
            System.out.print("Некорректная сумма в юанях");        }
        // Вычисление суммы в рублях        
        roubles = ROUBLES_PER_YUAN * yuan;        // Отображение суммы в рублях       
         //System.out.println("Сумма в рублях: " + roubles);        
         System.out.print(yuan);        
         int digit = yuan % 10;        
         int digit1 = yuan / 10 % 10;        
         if (digit==1){
            s = " китайский юань";        }
        else if (digit > 4 || digit1==1){
            s = " китайских юаней";        }
        else{
            s = " китайских юаня";        }
        System.out.print(s + " = ");        
        System.out.print(roubles);        
        System.out.print(" руб");        
        input.close();    
    }
}

