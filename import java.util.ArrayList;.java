import java.util.ArrayList;

public class ArrayListModel {
    public static class food {
        private String items;
        private String name;
    
        public food(){
        }

        public food (String items,String name){
            this.itemsfood = items;
            this.namefood = name;
        }

        public String getitemsfood() {
            return this.itemsfood;
        }

        public void setitemsfood(String itemsfood) {
            this.itemsfood = itemsfood;
        }

        public String getnamefood() {
            return this.namefood;
        }

        public void setnamefood(String namefood) {
            this.namefood = namefood;
        }
    }

    public static void main(String[] args) {
        ArrayList<food> pizza = new ArrayList<>();
        food Product=new food();
        foodProduct.setitemsfood("sugar");
        foodProduct.setnamefood("pizza");
        foodProduct.setJumlah("3,6");
    pizza.add(foodProduct);


        foodProduct = new food("pizza","sugar","3,6",7);
        pizza.add(foodProduct);

        for (int i=0;i<food.size();i++){
            System.out.println(pizza.get(i).getitemsfood());
            System.out.println(pizza.get(i).getnamefood());
            System.out.println(pizza.get(i).getJumlah());
        }

    }

}
