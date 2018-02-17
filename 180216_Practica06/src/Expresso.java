public class Expresso extends Drink {
    public Expresso(String size){
        this.size = size;
    }

    public String getDescription() {
        return "Expresso";
    }
    @Override
    public double cost() {
        if(this.size =="Small"){
            return 80.00;
        }
        else if(this.size == "Medium"){
            return 90.00;
        }
        else if(this.size == "Large"){
            return 100.00;
        }
        else{
            return 80.00;
        }
    }
}
