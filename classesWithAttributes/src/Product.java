public class Product {

    //das ist alles public
    private int id;         //private gilt nur in das was geschweifte KKlammer
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;     //soll aus anfangbuchstabe vom namen und id bestehen dazu getter und setter


    //getter
    public int getId(){         //jetzt wird id auf in main gesehen
        return id;
    }

    //setter
    public void setId(int id){        //set da ich Wert einsetzen möchte aber als Parameter
        this.id=id;   //hier kann man auch this. this demek benim icersinden bulundum klasseden al
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }


}


//get al demek okuma amacli
//set kurmak   zb toplantiyi planladik gibi ; degerini vermeye
//Da wir private gemacht haben, kann man in main die variablen nicht
//aufrufen, daher wervenden wir jetzt getter and setter