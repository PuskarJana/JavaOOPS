package pusk;

class super1{
    int mask,roll;
    String name;
     void input(){
        System.out.println("Hello");
    }
}

class inheriatncSimple extends super1{
    void output(){
        mask=100;roll=50;
        name="Puskar";
        System.out.println(name+" "+roll+" "+mask);
    }
}
    
class MultipleInhertance extends  inheriatncSimple{

	 public static void main(String args[]){
		 MultipleInhertance ref=new MultipleInhertance();
	    ref.input();
	    ref.output();
	    }

}
