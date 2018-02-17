public class Latte extends Drink {
    public Latte(String size){
        this.size = size;
    }

    public String getDescription() {
        return "Latte";
    }

    @Override
    public double cost() {
        if(this.size =="Small"){
            return 65.50;
        }
        else if(this.size == "Medium"){
            return 75.50;
        }
        else if(this.size == "Large"){
            return 85.50;
        }
        else{
            return 65.50;
        }
    }
}
