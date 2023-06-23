public class EncapsulationA {
    private int var = 50;

    //Getter
    public int getVar() {
        return var;
    }
        //Setter
        public void setVar(int var){
        if (var > 1000)
            this.var = 0;
        else {
            this.var = var;
        }
        }
        //You can do this quicker if you do code -> generate -> getters/setters

}

