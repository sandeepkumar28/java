class Phrase_o_matic
{
public static void main(String[] args)
{
String[] nature1={"sun","moon","ocean","blue"};
String[] nature2={"hot","cold","warm","mild"};
String[] nature3={"yellow","blue","red","pink"};
int x=nature1.length;
int y=nature2.length;
int z=nature3.length;
int rand1=(int)(Math.random()*x);
int rand2=(int)(Math.random()*y);
int rand3=(int)(Math.random()*z);
String phrase=nature1[rand1]+" "+nature2[rand2]+" "+nature3[rand3];
System.out.println("the phrase is"+" "+phrase);

}
}