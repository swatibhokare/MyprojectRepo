package arrayDemos;
class Food
{
	int foodid;
	String foodname;
	double foodprice;

	public Food(int foodid,String foodname,double foodprice)
	{
		this.foodid=foodid;
		this.foodname=foodname;
		this.foodprice=foodprice;
		
	}
	public void setFoodid(int foodid)
	{
		this.foodid=foodid;
	}
	public int getFoodid()
	{
		return foodid;
	}
	public void setFoodname(String foodname)
	{
		this.foodname=foodname;
	}
	public String getFoodname()
	{
		return foodname;
	}
	public void setFoodprice(double foodprice)
	{
		this.foodprice=foodprice;
	}
    public double getFoodprice()
    {
    	return foodprice;
    }
}
public class TestArrayofObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //creating array of objects
		Food foods[];
		foods=new Food[5];
		//System.out.println(foods[0]);
		//display food
		
		System.out.println("___________Food Details__________");
		   /* for(int i=0;i<foods.length;i++)
		    {
		    	System.out.println(foods[i]);
		    }*/
		for (Food f:foods)
		{
			System.out.println(f);
		}
		//instantiation
		foods[0]=new Food(1,"pav bhaji",150);
		foods[1]=new Food(2,"massala Dosa",220);
		foods[2]=new Food(3,"Tea",25);
		foods[3]=new Food(4,"Biryani",250);
		foods[4]=new Food(5,"Jelebi",100);
		//accessing
		//case 1
		System.out.println(foods[0].foodid);
		System.out.println(foods[0].foodname);
		System.out.println(foods[0].foodprice);
		
		//case 2
		System.out.println(foods[1].getFoodid());
		System.out.println(foods[1].getFoodname());
		System.out.println(foods[1].getFoodprice());
		
		
		//case 3
		
		System.out.println("___________food details by loop______");
		for(int i=0;i<foods.length;i++)
		{
			System.out.println(foods[i].getFoodid());
			System.out.println(foods[i].getFoodname());
			System.out.println(foods[i].getFoodprice());
			System.out.println(" ___________________");
		  
		}
		//case 4
		System.out.println("________food details by for each loop____");
		
		for(Food f:foods)
		{
			System.out.println(f.getFoodid());
			System.out.println(f.getFoodname());
			System.out.println(f.getFoodprice());
			System.out.println("----------------------------");
		}
		 System.out.println("----------food details by loop------");
		 for(int i=0;i<foods.length;i++)
		 {
			 System.out.println(foods[i]);
			 System.out.println("----------------");

		 }
	}

}
