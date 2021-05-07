package proovikt;

public class Joogipudel {
    String pudelityyp;
    double maht;
    double mass;
    double taara_maksumus;
    Jook jook;


public Joogipudel(double maht, String pudelityyp, double mass, double taara_maksumus, Jook jook){
    this.maht = maht;
    this.pudelityyp = pudelityyp;
    this.mass = mass;
    this.taara_maksumus = taara_maksumus;
    this.jook = jook;
}
 public Jook getJook(){
     return jook;
 }

 public double pudeliMass(){
     if(this.jook != null){
         return this.mass + this.jook.erikaal * this.maht;
     }else{
         return mass;
     }
 }
 
 public double pudeliHind(){
     if(this.jook != null){
         return this.taara_maksumus + this.jook.liitri_omahind * this.maht;
     }else{
         return taara_maksumus;
     }
 }
}
