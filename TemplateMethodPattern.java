using System;
namespace TemplateMethodPattern
 { 
  public abstract class BasicEngineering  
  {
 public void Papers()      
  {         
   //Common Papers:         
 Math();            
SoftSkills();            
//Specialized Paper:          
  SpecialPaper();       
 }       
 private void Math()     
   {          
  Console.WriteLine("Mathematics");      
  }        
private void SoftSkills()        
{           
 Console.WriteLine("SoftSkills");       
 }        
public abstract void SpecialPaper();   
 } }
//ComputerScience.cs 
using System;
namespace TemplateMethodPattern
 {    
public class ComputerScience:BasicEngineering  
  {      
 public override void SpecialPaper()       
 {            
Console.WriteLine("Object-Oriented Programming");      
  }    } }
using System;
namespace TemplateMethodPattern 
{   
 public class Electronics:BasicEngineering   
 {        
public override void SpecialPaper()    
    {          
  Console.WriteLine("Digital Logic and Circuit Theory");     
   }    } }
// Program.cs 
using System;
namespace TemplateMethodPattern 
{    
class Program   
 {        
static void Main(string[] args)        
{
Console.WriteLine("***Template Method Pattern Demo***\n");        
     BasicEngineering bs = new ComputerScience();             
Console.WriteLine("Computer Sc  Papers:");            
bs.Papers();            
Console.WriteLine();         
 bs = new Electronics();          
  Console.WriteLine("Electronics Papers:");            
bs.Papers();            
Console.ReadLine();      
  }    } }
