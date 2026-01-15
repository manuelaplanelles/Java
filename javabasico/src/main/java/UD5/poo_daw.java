package UD5;

public class poo_daw {
    static void main() {

        //Perro perro1 = new Perro("caniche","permanent",1,4,"verde"); //raza, pelo, peso, peso, patas, color
        //System.out.println("color: " + perro1.color + "- raza: " + perro1.raza);
        perro2.setColor("negro");
        perro.setRaza("caniche");
        System.out.println(perro2.getcolor());

        private String raza;
        private String pelo;
        private int peso;
        private  int patas;
        private String color;

        public Perro (String raza, String pelo, int peso, int patas, String color){
            this.raza = raza;
            this.pelo = pelo;
            this.peso = peso;
            this.patas = patas;
            this.color = color;
        }


        //GET
        public String getRaza() { //se limita a devolver la raza unicamente
            return raza;
        }
        public void setRaza(String raza){
            this.raza=raza; //el de la derecha es la clase y el de la izq es el atrubuto y se diferencia con el this
        }
        public void getPelo (){
            return pelo;
        }
        public void getPelo (String pelo){
            this.pelo = pelo;
        }
        public void getPeso (){
            return peso;
        }
        public void getPeso (String peso){
            this.peso = peso;
        }
        public void getPatas (){
            return patas;
        }
        public void getPatas (String patas){
            this.patas = patas;
        }
        public void getColor (){
            return color;
        }
        public void getColor (String color){
            this.color = color;
        }

    }
}
