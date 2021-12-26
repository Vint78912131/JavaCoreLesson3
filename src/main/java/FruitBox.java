import java.util.ArrayList;

public class FruitBox <F extends Fruit>{
    private ArrayList<F> box = new ArrayList<>();
    private double boxWeight = 0;

    public FruitBox (F fruit, int count) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                box.add(fruit);
            }
            setBoxWeight(count * fruit.getWeight());
        }
    }

    public String fruitBoxToString() {
        String result = "";
        if (this.getBox() != null) {
            if (!this.getBox().isEmpty())
                result += ("Fruit: " + this.getFruitName() + ", Count: " + this.getBox().size());
            else
                result += "Empty box";
        }
        return result;
    }

    public String getFruitName() {
        String result = "";
        if (this.getBox() != null) {
            if (!this.getBox().isEmpty())
                result += (String.valueOf(this.getBox().get(0).getClass()).substring(6,String.valueOf(this.getBox().get(0).getClass()).length()));
        }
        return result;
    }

    public ArrayList<F> getBox() {
        return box;
    }

    public void setBox(ArrayList<F> box) {
        this.box = box;
    }

    public double getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(double weight) {
        this.boxWeight = weight;
    }

    public boolean compare(FruitBox fruitBox) {
        return (this.getBoxWeight() == fruitBox.getBoxWeight() ?  true : false);
    }

    private void putFruit(F fruit, int count) {
            for (int i = 0; i < count; i++) {
                this.getBox().add(fruit);
            }
            this.setBoxWeight(this.getBoxWeight() + count * fruit.getWeight());
    }

    public void moveTo(FruitBox fruitBox) {
        if (this.getBox() != null) {
            if (this.getBox().isEmpty())
                System.out.println("First box is empty!");
            else if (fruitBox.getBox().isEmpty()) {
                fruitBox.putFruit(this.getBox().get(0), this.getBox().size());
                this.getBox().clear();
                this.setBoxWeight(0);
            } else if (fruitBox.getBox().get(0).getClass() != this.getBox().get(0).getClass()) {
                System.out.println("There are different fruits in the boxes.\n" +
                        this.getBox().get(0).getClass() + " and " +
                        fruitBox.getBox().get(0).getClass());
            }
        }
        else
            System.out.println("First box is empty!");
    }

    @Override
    public String toString() {
        return "FruitBox{" + fruitBoxToString() +
                ", weight=" + this.getBoxWeight() +
                '}';
    }
}
